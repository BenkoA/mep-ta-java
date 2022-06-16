import com.epam.training.fooddelivery.data.FileBasedDataStore;
import com.epam.training.fooddelivery.service.FoodDeliveryService;

import java.io.IOException;
import java.time.LocalDate;

public class Application {


    public static void main(String[] args) throws IOException {
        FileBasedDataStore fileBasedDataStore = new FileBasedDataStore("com/epam/training/fooddelivery/data/order.csv");
        FoodDeliveryService foodDeliveryService = new FoodDeliveryService(fileBasedDataStore);

        LocalDate startDate = LocalDate.ofEpochDay(01-01-2022);
        LocalDate endDate = LocalDate.ofEpochDay(05-01-2022);

        fileBasedDataStore.getOrders();
        foodDeliveryService.getOrders(startDate, endDate);

    }
}
