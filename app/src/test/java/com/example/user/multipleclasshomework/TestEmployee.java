package com.example.user.multipleclasshomework;

import org.junit.Before;
import org.junit.Test;

import static android.R.attr.name;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/06/2017.
 */

public class TestEmployee {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee(10, "Chris Burn", "ABCDE", 30000.00);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(40000.00);
        assertEquals(40000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canSetName(){
        employee.setName("Christopher Burn");
        assertEquals("Christopher Burn", employee.getName());
    }


}
