package com.testtask.helloworld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GreetingTheWorldTest {
    private GreetingTheWorld greetingTheWorld = new GreetingTheWorld();

    @Test
    public void testSetPropertiesMorning() throws Exception {
        greetingTheWorld.setProperties(6);
        assertEquals(greetingTheWorld.getValueProperties(), "app.morning");
        greetingTheWorld.setProperties(7);
        assertEquals(greetingTheWorld.getValueProperties(), "app.morning");
    }

    @Test
    public void testSetPropertiesDay() throws Exception {
        greetingTheWorld.setProperties(9);
        assertEquals(greetingTheWorld.getValueProperties(), "app.day");
        greetingTheWorld.setProperties(10);
        assertEquals(greetingTheWorld.getValueProperties(), "app.day");
    }

    @Test
    public void testSetPropertiesEvening() throws Exception {
        greetingTheWorld.setProperties(19);
        assertEquals(greetingTheWorld.getValueProperties(), "app.evening");
        greetingTheWorld.setProperties(20);
        assertEquals(greetingTheWorld.getValueProperties(), "app.evening");
    }

    @Test
    public void testSetPropertiesNight() throws Exception {
        greetingTheWorld.setProperties(23);
        assertEquals(greetingTheWorld.getValueProperties(), "app.night");
        greetingTheWorld.setProperties(0);
        assertEquals(greetingTheWorld.getValueProperties(), "app.night");
    }
}