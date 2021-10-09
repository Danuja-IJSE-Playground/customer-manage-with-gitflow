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

package lk.ijse.javafx.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection = null;

    private Connection connection ;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kade","root","25412541");

    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dbConnection==null){
            dbConnection=new DBConnection();
        }
        return dbConnection;

    }

    public Connection getConnection(){
        return connection;
    }
}
