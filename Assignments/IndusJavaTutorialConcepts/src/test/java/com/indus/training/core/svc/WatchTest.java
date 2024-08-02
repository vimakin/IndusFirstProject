package com.indus.training.core.svc;

import com.indus.training.core.domain.WatchInput;
import com.indus.training.core.domain.WatchOutput;
import com.indus.training.core.impl.Watch;
import com.indus.training.core.impl.WatchModel;
import com.indus.training.core.impl.Watch.DigitalWatch;

import junit.framework.TestCase;

public class WatchTest extends TestCase {

    private Watch watchObj = null;
    private DigitalWatch digitalWatchObj = null;

    protected void setUp() throws Exception {
        WatchInput input = new WatchInput("Casio", "G-Shock", 2021);
        WatchModel wm = new WatchModel(input);
        watchObj = new Watch(wm);
        digitalWatchObj = new DigitalWatch(wm);
    }

    protected void tearDown() throws Exception {
        watchObj = null;
        digitalWatchObj = null;
    }

    public void testGetTime() {
        // Step 1: Expected Result
        String expectedResult = "12:00 PM";
        // Step 2: Actual Result
        String actualResult = watchObj.getTime();
        // Step 3: Assertion
        assertEquals(expectedResult, actualResult);
    }

    public void testGetWatchDetails() {
        // Step 1: Expected Result
        String expectedResult = "Brand: Casio, Model: G-Shock, Year: 2021";
        // Step 2: Actual Result
        WatchOutput output = watchObj.getWatchDetails();
        String actualResult = output.getDetails();
        // Step 3: Assertion
        assertEquals(expectedResult, actualResult);
    }

    public void testGetDigitalWatchDetails() {
        // Step 1: Expected Result
        String expectedResult = "Brand: Casio, Model: G-Shock, Year: 2021, Date: 07/26/2024";
        // Step 2: Actual Result
        WatchOutput output = digitalWatchObj.getWatchDetails();
        String actualResult = output.getDetails();
        // Step 3: Assertion
        assertEquals(expectedResult, actualResult);
    }
}
