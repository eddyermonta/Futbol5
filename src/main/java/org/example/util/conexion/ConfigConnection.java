package org.example.util.conexion;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigConnection {

    private String driver;
    private String url;
    private String username;
    private String password;


    public ConfigConnection() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                throw new IllegalArgumentException("No se encontro el archivo de configuracion");
            }
            Properties properties = new Properties();
            properties.load(input);
            loadProperties(properties);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadProperties(Properties properties) {
        driver = properties.getProperty("db.driver");
        url = properties.getProperty("db.url");
        username = properties.getProperty("db.username");
        password = properties.getProperty("db.password");
    }

    public String driver() {
        return driver;
    }

    public String url() {
        return url;
    }

    public String username() {
        return username;
    }

    public String password() {
        return password;
    }
}
