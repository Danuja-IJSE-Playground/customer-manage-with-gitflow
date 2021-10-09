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

package lk.ijse.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/DashboardForm.fxml"))));
        primaryStage.show();

    }
}
