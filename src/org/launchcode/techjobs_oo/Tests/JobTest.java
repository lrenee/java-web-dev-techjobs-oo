package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs_oo.main.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    Job test_job6;
    Job test_job7;
    Job test_job8;
    Job test_job9;
    Job test_job10;
    Job test_job11;
    String str1;
    String str3;

    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job( "Business Analyst", new Employer("MWDC"), new Location("Saint Louis"), new PositionType("Data Scientist / Business Intelligence"), new CoreCompetency("SQL"));
        test_job5 = new Job("Business Analyst", new Employer("MWDC"), new Location("Saint Louis"), new PositionType("Data Scientist / Business Intelligence"), new CoreCompetency("SQL"));
        test_job6 = new Job( "", new Employer("Utrip"), new Location("Seattle"), new PositionType("Mobile Developer"), new CoreCompetency("iOS"));
        test_job7 = new Job("Java Dev", new Employer("Equifax"), new Location(""), new PositionType("Web - Front End"), new CoreCompetency("Java"));
        test_job8 = new Job ("Business Intelligence Analyst", new Employer(""), new Location("Saint Louis"), new PositionType("Data Scientist / Business Intelligence"), new CoreCompetency("Database"));
        test_job9 = new Job ("C# / Game Dev", new Employer("Bass Underwriters"), new Location("South Florida"), new PositionType(""), new CoreCompetency(".Net"));
        test_job10 = new Job("IOS Engineer", new Employer("Anheuser Busch"), new Location ("Saint Louis"), new PositionType("Web - Full Stack"), new CoreCompetency(""));
        test_job11 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        str1 = Integer.toString(test_job1.getId());
        str3 = Integer.toString(test_job3.getId());
    }


    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testSettingJobId() {
        assertTrue(test_job1.getId() != test_job2.getId());
        assertEquals(1, test_job2.getId() - test_job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product Tester", test_job3.getName());
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertTrue(test_job3.getLocation() instanceof Location);
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals(test_job4, test_job5);
    }

    @Test
    public void toStringHasBlankLineBeforeAndAfterJobInfo() {
        assertTrue(test_job1.toString().startsWith("\n"));
        assertTrue(test_job1.toString().endsWith("\n"));
        assertTrue(test_job3.toString().startsWith("\n"));
        assertTrue(test_job3.toString().endsWith("\n"));
    }

    @Test
    public void toStringContainsFieldLabelsAndFieldData() {
        assertEquals(test_job3.toString(), "\nID: "+str3+"\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n");
        assertTrue(test_job3.toString().contains("ID: "));
        assertTrue(test_job3.toString().contains("Name: "));
        assertTrue(test_job3.toString().contains("Employer: "));
        assertTrue(test_job3.toString().contains("Location: "));
        assertTrue(test_job3.toString().contains("Position Type: "));
        assertTrue(test_job3.toString().contains("Core Competency: "));
        assertTrue(test_job3.toString().contains(this.str3));
        assertTrue(test_job3.toString().contains(test_job3.getName()));
        assertTrue(test_job3.toString().contains(test_job3.getEmployer().getValue()));
        assertTrue(test_job3.toString().contains(test_job3.getLocation().getValue()));
        assertTrue(test_job3.toString().contains(test_job3.getPositionType().getValue()));
        assertTrue(test_job3.toString().contains(test_job3.getCoreCompetency().getValue()));
    }

    @Test
    public void emptyFieldAssignedDataNotAvailable() {
        assertEquals(test_job6.getName(), "Data not available");
        assertEquals(test_job7.getLocation().getValue(), "Data not available");
        assertEquals(test_job8.getEmployer().getValue(), "Data not available");
        assertEquals(test_job9.getPositionType().getValue(), "Data not available");
        assertEquals(test_job10.getCoreCompetency().getValue(), "Data not available");
    }

    @Test
    public void emptyJobReturnsOops() {
        assertEquals(test_job1.toString(), "OOPS!  This job does not seem to exist.");
    }



}
