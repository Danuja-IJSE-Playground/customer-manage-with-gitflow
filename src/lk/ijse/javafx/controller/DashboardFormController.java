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

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    @FXML
    void btnCustomerOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("../view/CustomerAddForm.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnItemOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("../view/ItemAddForm.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
