package com.epam.training.garden.service;

import com.epam.training.garden.domain.GardenProperties;
import com.epam.training.garden.domain.PlantType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GardenService {
    private final Map<String, PlantType> plantTypeMap = new HashMap<>(); //never used, but I let it stay for reference
    private GardenProperties gardenProperties;
    private List<PlantType> plantTypes;


    public GardenService() {
        PlantType corn = new PlantType("Corn", 0.4, 10);
        PlantType pumpkin = new PlantType("Pumpkin", 2, 5);
        PlantType grape = new PlantType("Grape", 3, 5);
        PlantType tomato = new PlantType("Tomato", 0.3, 10);
        PlantType cucumber = new PlantType("Cucumber", 0.4, 10);
        this.setPlantTypes(Arrays.asList(corn, pumpkin, grape, tomato, cucumber));

    }

    public List<PlantType> getPlantTypes() {
        return plantTypes;
    }

    public List<String> getPlantName(List<PlantType> list) {
        return list.stream().map(s -> s.getName()).collect(Collectors.toList());
    }

    public void setGardenProperties(GardenProperties gardenProperties) {
        this.gardenProperties = gardenProperties;
    }

    public void setPlantTypes(List<PlantType> plantTypes) {
        this.plantTypes = plantTypes;

    }

    public Result evaluatePlan(Map<String, Integer> items) {
        setPlantTypes(plantTypes);
        Map<String, PlantType> plantTypeMap = new HashMap<>();
        plantTypes.forEach(plantType -> plantTypeMap.put(plantType.getName(), plantType));


        // user input checked for unknown plants
        for (String plant : items.keySet()) {
            if (!plantTypeMap.containsKey(plant)) throw new IllegalArgumentException("Unknown type of plant: " + plant);
        }

        // calculation starts if plant pass
        double originalArea = gardenProperties.getArea();
        double originalWater = gardenProperties.getWaterSupply();
        double remainingArea = gardenProperties.getArea();
        double remainingWaterSupply = gardenProperties.getWaterSupply();
        boolean areaOk = true;
        boolean waterOk = true;

        for (Map.Entry<String, Integer> entry : items.entrySet()) // loads entry map with user inputs from items
        {
            String plantTypeName = entry.getKey(); // key saved to a string
            double ammount = entry.getValue(); // value saved to a double( its the user input for number of plants)
            PlantType plantType = plantTypeMap.get(plantTypeName); // com.epam.training.garden.domain.com.epam.training.garden.domain.PlantType object created

            remainingArea -= plantType.getArea() * ammount;

            if (remainingArea < 0) areaOk = false;
            remainingWaterSupply -= plantType.getWaterAmount() * ammount;

            if (remainingWaterSupply < 0) waterOk = false;


        }
        return new Result(originalArea - remainingArea, originalWater - remainingWaterSupply, areaOk, waterOk);
    }
}






















