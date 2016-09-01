/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.atividadepadroescriacional.core.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Anderson Souza
 */
public class ConnectionFactory {
    private String url;
    private Properties prop;

    public ConnectionFactory() {
        this.url = "jdbc:postgresql://localhost:5432/militia";
        prop = new Properties();
        prop.setProperty("user", "postgres");
        prop.setProperty("password", "123456");
        
    }
    
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url, prop);
    }
    
    
    

}
