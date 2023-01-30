package com.telran.project.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    private static final String PROP_FILE = "/test.properties";

    public static String loadProperty(String propertyName) {

        Properties properties = new Properties();

        try {
            properties.load(PropertiesLoader.class.getResourceAsStream(PROP_FILE));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String value = "";
        if (propertyName != null) {
            value = properties.getProperty(propertyName);
        }
        return value;
    }
}
