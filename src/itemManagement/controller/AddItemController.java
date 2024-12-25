package itemManagement.controller;

import itemManagement.dbc.DataBaseConnection;
import itemManagement.model.Item;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class AddItemController {
    public TextField txtName;
    public TextField txtCode;
    public TextField txtDesc;
    public TextField txtQTY;
    public TextField txtPrice;

    public void btnAddItemOnClick(ActionEvent actionEvent) {
        DataBaseConnection.getInstance().getItemArrayList().add(new Item(txtCode.getText(), txtDesc.getText(), txtName.getText(), Double.parseDouble(txtPrice.getText()), Integer.parseInt(txtQTY.getText())));
        emptyTxtFld();
    }

    public void emptyTxtFld(){
        txtName.setText("");
        txtCode.setText("");
        txtPrice.setText("");
        txtQTY.setText("");
        txtDesc.setText("");
    }
}
