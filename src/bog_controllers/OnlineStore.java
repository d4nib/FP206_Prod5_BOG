package bog_controllers;

import java.util.Scanner;

import bog_models.CustomerType;
import static java.lang.System.exit;

import bog_views.GestionOS;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class OnlineStore  extends Application{ 
    private static GestionOS gestionOS;

    public static void printMenu(String[] options) {
        System.out.println("");
        System.out.println("            ONLINE STORE MENU          ");
        System.out.println("---------------------------------------\n");
        for (String option : options) {
            System.out.println("    " + option);
        }
        System.out.println("");
    }


    public static void main(String[] args) throws Exception {
        
        launch(args);
     /*   gestionOS = new GestionOS();

        // Show menu
        String[] options = {
                "Create new customer.........: [1]",
                "Create new product..........: [2]",
                "Create new order............: [3]",
                "Show products...............: [4]",
                "Show customers..............: [5]",
                "Show regular customers......: [6]",
                "Show premium customers......: [7]",
                "Show pending orders.........: [8]",
                "Show sent orders............: [9]",
                "Delete order................: [10]",
                "Exit........................: [0]",
        };
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int option = 1;
        while (option != 0) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        gestionOS.createCustomer(scanner);
                        break;
                    case 2:
                        gestionOS.createProduct(scanner);
                        break;
                    case 3:
                        gestionOS.createOrder(scanner);
                        break;
                    case 4:
                        gestionOS.listProducts(scanner);
                        break;
                    case 5:
                        gestionOS.listCustomers(scanner, null);
                        break;
                    case 6:
                        gestionOS.listCustomers(scanner, CustomerType.REGULAR);
                        break;
                    case 7:
                        gestionOS.listCustomers(scanner, CustomerType.PREMIUM);
                        break;
                    case 8:
                        gestionOS.listOrders(scanner, false);
                        break;
                    case 9:
                        gestionOS.listOrders(scanner, true);
                        break;
                    case 10:
                        gestionOS.deleteOrder(scanner);
                        break;
                    case 0:
                        scanner.close();
                        exit(0);
                }
            } catch (Exception e) {
                System.out.println("Please select a valid menu option");
                scanner.next();
            }
        }*/

    } 

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(OnlineStore.class.getResource("/bog_views/MainView.fxml"));
            //Cargo la ventana
            Pane ventana = (Pane) loader.load();
            
            //Cargo la escena
            Scene scene = new Scene(ventana);
            
            //Seteo la escena y la muestro
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
