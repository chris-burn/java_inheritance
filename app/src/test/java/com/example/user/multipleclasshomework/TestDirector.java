package com.example.user.multipleclasshomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/06/2017.
 */

public class TestDirector {

    Director director;

    @Before
    public void before(){
        director = new Director(20, "Sean Jones", "FGHIJ", 50000.00, "Sausages", 500000.00);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(80000.00);
        assertEquals(80000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canSetName(){
        director.setName("Brent Jones");
        assertEquals("Brent Jones", director.getName());
    }


}
