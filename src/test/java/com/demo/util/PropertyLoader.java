package com.demo.util;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
    String fileName;
    InputStream inputStream = null;
    String path = "ui/config/";
    Properties property = new Properties();

    public Properties getProperty(String fileName){
        try{
            inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
            property.load(inputStream);

        }catch (Exception e){}
    return property;
    }

    public Properties getProperty(){
        try{
            String testData = System.getProperty("testData");
            fileName = path + testData + ".properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
            property.load(inputStream);
        } catch (Exception e){

        }
        return property;
    }
}
