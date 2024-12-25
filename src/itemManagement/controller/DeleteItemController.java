package itemManagement.controller;

import itemManagement.dbc.DataBaseConnection;
import itemManagement.model.Item;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.util.ArrayList;

public class DeleteItemController {
    public TextField txtName;
    public TextField txtCode;
    public TextField txtQTY;
    public TextField txtDesc;
    public TextField txtPrice;

    public void btnSearchItemOnClick(ActionEvent actionEvent) {
            Item o = search(txtCode.getText());
            if(o!=null){
                txtName.setText(o.getItemName());
                txtDesc.setText(o.getItemDescription());
                txtPrice.setText(o.getItemPrice()+"");
                txtQTY.setText(o.getItemQTY()+"");
                return;
            }
         JOptionPane.showMessageDialog(null,"invalid item code");
    }

    public void btnDeleteItemOnClick(ActionEvent actionEvent) {
        DataBaseConnection.getInstance().getItemArrayList().remove(search(txtCode.getText()));
        JOptionPane.showMessageDialog(null,"item has been removed");
        emptyTxtFld();
    }

    public Item search(String code){
        ArrayList<Item> itemArrayList = DataBaseConnection.getInstance().getItemArrayList();
        for (Item obj:itemArrayList){
            Item o = obj.ifExist(txtCode.getText());
            if(o!=null){
                return  o;
            }
        }
        return  null;
    }

    public void emptyTxtFld(){
        txtName.setText("");
        txtCode.setText("");
        txtPrice.setText("");
        txtQTY.setText("");
        txtDesc.setText("");
    }
}
