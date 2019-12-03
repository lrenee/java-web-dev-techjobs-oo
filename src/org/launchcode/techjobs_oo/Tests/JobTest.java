package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
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

    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job( "Business Analyst", new Employer("MWDC"), new Location("Saint Louis"), new PositionType("Data Scientist / Business Intelligence"), new CoreCompetency("SQL"));
        test_job5 = new Job("Business Analyst", new Employer("MWDC"), new Location("Saint Louis"), new PositionType("Data Scientist / Business Intelligence"), new CoreCompetency("SQL"));
        
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


}
