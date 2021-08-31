package com.demo.util;

import java.util.Properties;

public class TestDataProvider {
    public static Properties property = new PropertyLoader().getProperty();

    public enum TestData{
        URL("URL"),
        HOME_URL_PATTERN("HOME_URL_PATTERN");

        private String value;

        TestData(String value){
            this.value = value;
        }

        public String val(){
            return property.getProperty(value).toString();
        }
    }
}
