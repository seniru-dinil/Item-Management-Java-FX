package itemManagement.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    public void btnAddItemOnClick(ActionEvent actionEvent) {
        Stage stg = new Stage();
        try {
            stg.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/addItemForm.fxml"))));
            stg.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnSearchItemOnClick(ActionEvent actionEvent) {
        Stage stg = new Stage();
        try {
            stg.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/searchItemForm.fxml"))));
            stg.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnDeleteItemOnClick(ActionEvent actionEvent) {
        Stage stg = new Stage();
        try {
            stg.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/deleteItemForm.fxml"))));
            stg.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnViewItemOnClick(ActionEvent actionEvent) {
        Stage stg = new Stage();
        try {
            stg.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/viewItemForm.fxml"))));
            stg.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnUpdateItemOnClick(ActionEvent actionEvent) {
        Stage stg = new Stage();
        try {
            stg.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/updateItemForm.fxml"))));
            stg.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
