import com.epam.training.garden.domain.GardenProperties;
import com.epam.training.garden.domain.PlantType;
import com.epam.training.garden.service.GardenService;
import com.epam.training.garden.service.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        GardenService gardenService = new GardenService();

        System.out.println("***Welcome to Garden Planner***");
        System.out.println("\nPlease enter your garden properties:");
        System.out.print("Size (in square metres): ");
        Scanner scanner = new Scanner(System.in);
        double input1 = scanner.nextDouble();
        System.out.print("Water supply(in liter): ");
        Scanner scanner2 = new Scanner(System.in);
        double input2 = scanner2.nextDouble();

        GardenProperties gardenProperties = new GardenProperties(input1, input2);
        gardenService.setGardenProperties(gardenProperties);

        System.out.println("\nKnown plant types: ");
        List<PlantType> plantTypesMain = gardenService.getPlantTypes();
        for (PlantType plant : plantTypesMain) {
            System.out.println("- " + plant.getName());
        }

        System.out.println("\nPlease enter the plants you wish to put into the garden. Press enter when you are done");
        Map<String, Integer> userInputs = new HashMap<>();

        boolean loop = true;
        Scanner scanner3 = new Scanner(System.in);
        while (loop) {
            System.out.print("Enter plant (format: name,amount): ");
            String input3 = scanner3.nextLine();
            if (input3.equals("")) {
                break;
            }
            String plantName = input3.replaceAll("[^A-Za-z]", "").trim();   // could be an array
            String plantNumb = input3.replaceAll("\\D", "").trim();
            int plantNumbParsed = Integer.parseInt(plantNumb);
            userInputs.put(plantName, plantNumbParsed);
        }

        Result result = gardenService.evaluatePlan(userInputs);
        result.printResult(result);

        scanner.close();
        scanner2.close();
        scanner3.close();
    }
}

