package org.example.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFolder {
    private final Properties properties = new Properties();
    {
        try (FileInputStream fis = new FileInputStream("src/test/resources/BrowserProperties")){
            properties.load(fis);

        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public String readProperty(String propertyName){
        return properties.getProperty(propertyName);
    }
}
