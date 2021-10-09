/*
 *
 *  *
 *  *  * ---------------------------------------------------------------------------------------------
 *  *  *  *  Copyright (c) Scince 2021 - present Danuja. All rights reserved.
 *  *  *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *  *  *--------------------------------------------------------------------------------------------
 *  *
 *
 */

package lk.ijse.javafx.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import lk.ijse.javafx.model.Customer;
import lk.ijse.javafx.model.Item;

import java.sql.SQLException;

public class ItemAddFormController {
    @FXML
    private JFXTextField txtCode;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXTextField txtPrice;

    @FXML
    void btnSaveOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String code = txtCode.getText();
        String description = txtDescription.getText();
        String qty = txtQty.getText();
        String price = txtPrice.getText();

        if(new ItemController().saveItem(new Item(code, description, Integer.parseInt(qty), Double.parseDouble(price)))) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..").show();
        }  else {
            new Alert(Alert.AlertType.WARNING, "Try Again..").show();
        }
    }
}
