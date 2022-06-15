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
        System.out.println(" ");
        System.out.println("Please enter your garden properties:");
        System.out.println("Size (in square metres):");
        Scanner scanner = new Scanner(System.in);
        double input1 = scanner.nextDouble();
        System.out.println("Water supply(in liter):");
        Scanner scanner2 = new Scanner(System.in);
        double input2 = scanner2.nextDouble();
        GardenProperties gardenProperties = new GardenProperties(input1, input2);
        gardenService.setGardenProperties(gardenProperties);

        List<PlantType> plantTypesMain = gardenService.getPlantTypes();
        List<String> plants = gardenService.getPlantName(plantTypesMain);
        System.out.println("Available plants are:" + "\n" + " - " + plants.get(0) + "\n" + "\n" + " - " + plants.get(1) + "\n" + "\n" + " - " + plants.get(2) + "\n" + "\n" + " - " + plants.get(3) + "\n");


        System.out.println("Please enter the plants you wish to put into the garden. Press enter when you are done");
        Map<String, Integer> userInputs = new HashMap<>();
        boolean loop = true;
        Scanner scanner3 = new Scanner(System.in);
        while (loop) {
            System.out.println("Enter plant name and amount (format:name,amount):");
            String input3 = scanner3.nextLine();
            if (input3.equals("")){
                break;
            }
            String plantName = input3.replaceAll("[^A-Za-z]", "").trim();   // could be an array
            String plantNumb = input3.replaceAll("\\D", "").trim();
            int plantNumbParsed = Integer.parseInt(plantNumb);
            userInputs.put(plantName, plantNumbParsed);
            System.out.println(userInputs);
        }

        Result result = gardenService.evaluatePlan(userInputs);
        System.out.println("***Results***");
        System.out.println(result);
        if (result.isAreaOk() && result.isWaterOk()) {         // removed true, its set to true by default
            System.out.println("Your plan is feasable:)");
        } else System.out.println("Sadly your plan wont work:(");
        if (!result.isWaterOk()) {                        // changed "false" to "!result."
            System.out.println("Not enough water!");
        }
        if (!result.isAreaOk()) {                        // same as line 48(!result.)
            System.out.println("Not enough area!");
        }
        scanner.close();
        scanner2.close();
        scanner3.close();


    }


}

