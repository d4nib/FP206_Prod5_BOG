/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bog_controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author joanl
 */
public class MainController implements Initializable {

    @FXML
    private Button btnShowCustomer;
    @FXML
    private Button btnShowProducts;
    @FXML
    private Button btnCreateCustomer;
    @FXML
    private Button btnCreateProduct;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void showCustomers(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/bog_views/CustomerView.fxml"));
            Parent root = loader.load();

            CustomerController controller = loader.getController();

            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindows());

            Stage myStage = (Stage) this.btnShowCustomer.getScene().getWindow();
            myStage.close();
        } catch (Exception e) {
        }

    }

    @FXML
    private void showProducts(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/bog_views/ProductView.fxml"));
            Parent root = loader.load();

            ProductController controller = loader.getController();

            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindows());

            Stage myStage = (Stage) this.btnShowCustomer.getScene().getWindow();
            myStage.close();
        } catch (Exception e) {
        }
    }

    @FXML
    private void createCustomer(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/bog_views/CustomerView.fxml"));
            Parent root = loader.load();

            CustomerController controller = loader.getController();

            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindows());
            
            Stage myStage = (Stage) this.btnShowCustomer.getScene().getWindow();
            myStage.close();
            controller.addCustomer(event);
        } catch (Exception e) {
        }
    }

    @FXML
    private void createProduct(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/bog_views/ProductView.fxml"));
            Parent root = loader.load();

            ProductController controller = loader.getController();

            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindows());

            Stage myStage = (Stage) this.btnShowCustomer.getScene().getWindow();
            myStage.close();
            controller.addProduct(event);
        } catch (Exception e) {
        }
    }

}
