package com.testtask.helloworld;


import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("app", defaultLocale);
        GreetingTheWorld greetingTheWorld = new GreetingTheWorld(bundle);
        int hourNow = LocalTime.now().getHour();

        greetingTheWorld.setProperties(hourNow);
        greetingTheWorld.printMessages();
    }

}
