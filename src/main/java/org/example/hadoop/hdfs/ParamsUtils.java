package org.example.hadoop.hdfs;

import java.io.IOException;
import java.util.Properties;

public class ParamsUtils {
    private static Properties properties = new Properties();
    static {
        try {
            properties.load(ParamsUtils.class.getClassLoader().getResourceAsStream("wc.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Properties getProperties() throws Exception {
        return properties;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getProperties().getProperty("HDFS_URL"));
    }
}