package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job jobTest1 = new Job();
        Job jobTest2 = new Job();
        assertEquals (jobTest1.getId(), jobTest2.getId(), 1);
        assertNotEquals(jobTest1.getId(), jobTest2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobTest3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(jobTest3.getName() != null);
        assertTrue(jobTest3.getEmployer() != null);
        assertTrue(jobTest3.getLocation() != null);
        assertTrue(jobTest3.getPositionType() != null);
        assertTrue(jobTest3.getCoreCompetency() != null);

        assertEquals("Product tester", jobTest3.getName());
        assertEquals("ACME", jobTest3.getEmployer().getValue());
        assertEquals("Desert", jobTest3.getLocation().getValue());
        assertEquals("Quality control", jobTest3.getPositionType().getValue());
        assertEquals("Persistence", jobTest3.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job jobTest4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTest5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobTest4.equals(jobTest5));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobTest6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedStart = jobTest6.toString().substring(0,System.lineSeparator().length());
        String expectedEnd = jobTest6.toString().substring(jobTest6.toString().length() - System.lineSeparator().length(), jobTest6.toString().length());

        String dataInfo = "ID: " + jobTest6.getId() + "\r\nName: Product tester\r\nEmployer: ACME\r\nLocation: Desert" +
                "\r\nPosition Type: Quality control\r\nCore Competency: Persistence";

        Assert.assertEquals(System.lineSeparator() + dataInfo + System.lineSeparator(), jobTest6.toString());
        assertEquals(System.lineSeparator(), expectedStart);
        assertEquals(System.lineSeparator(), expectedEnd);
    }


}
