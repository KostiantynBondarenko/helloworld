package com.testtask.helloworld;


import org.apache.log4j.Logger;
import java.util.ResourceBundle;

public class GreetingTheWorld {
    private static final Logger log = Logger.getLogger(GreetingTheWorld.class);

    private ResourceBundle bundle;
    private String valueProperties;

    public GreetingTheWorld() {
    }

    GreetingTheWorld(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public ResourceBundle getBundle() {
        return bundle;
    }

    public void setBundle(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public String getValueProperties() {
        return valueProperties;
    }

    public void setValueProperties(String valueProperties) {
        this.valueProperties = valueProperties;
    }

    public void setProperties(int hourNow) {
        if (hourNow >= 6 && hourNow < 9) {
            this.valueProperties = "app.morning";
        } else if (hourNow >= 9 && hourNow < 19) {
            this.valueProperties = "app.day";
        } else if (hourNow >= 19 && hourNow < 23) {
            this.valueProperties = "app.evening";
        } else {
            this.valueProperties = "app.night";
        }
    }

    public void printMessages() {
        String message = bundle.getString(valueProperties);

        log.info(String.format("Print messages: %s Local: %s", message, bundle.getLocale()));
        System.out.println(message);
    }
}
