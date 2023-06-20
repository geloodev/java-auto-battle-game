package com.geloodev.utils;

import java.io.File;

import freemarker.template.Configuration;

public class FreeMarkerUtil {
    
    private static  Configuration configuration;

    public static void init() {
        
        try {
            configuration = new Configuration(Configuration.VERSION_2_3_32);
            configuration.setDirectoryForTemplateLoading(new File("src/main/java/com/geloodev/views"));
        } 
        catch (Throwable exception) {
            System.err.println("Failed to initializes FreeMarker: " + exception);
            throw new ExceptionInInitializerError(exception);
        }
    }

    public static Configuration getConfiguration() {
        return configuration;
    }
}
