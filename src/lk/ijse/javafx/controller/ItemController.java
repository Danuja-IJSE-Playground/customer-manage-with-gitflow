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

import lk.ijse.javafx.db.DBConnection;
import lk.ijse.javafx.model.Customer;
import lk.ijse.javafx.model.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemController {
    public boolean saveItem(Item i) throws SQLException, ClassNotFoundException {
        Connection con= DBConnection.getInstance().getConnection();
        String query="INSERT INTO items VALUES(?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1,i.getCode());
        stm.setObject(2,i.getDescription());
        stm.setObject(3,i.getQtyOnHand());
        stm.setObject(4,i.getUnitPrice());
        return stm.executeUpdate()>0;
    }
}
