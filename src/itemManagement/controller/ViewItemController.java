package itemManagement.controller;

import itemManagement.dbc.DataBaseConnection;
import itemManagement.model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class ViewItemController {
    public TableView table;
    public TableColumn txtCode;
    public TableColumn txtName;
    public TableColumn txtDesc;
    public TableColumn txtPrice;
    public TableColumn txtQTY;

    public void btnReloadOnClick(ActionEvent actionEvent) {
        ArrayList<Item> arrayList = DataBaseConnection.getInstance().getItemArrayList();
        ObservableList<Item> itemObservableList = FXCollections.observableArrayList();
        txtCode.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        txtDesc.setCellValueFactory(new PropertyValueFactory<>("itemDescription"));
        txtPrice.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));
        txtQTY.setCellValueFactory(new PropertyValueFactory<>("itemQTY"));
        txtName.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        arrayList.forEach(item->itemObservableList.add(item));
        table.setItems(itemObservableList);
    }
}
