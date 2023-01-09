package com.witstan.java1;

import org.junit.Test;

/**
 * @author witstan
 * @create 2023-01-09 14:27
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO c = new CustomerDAO();
        c.add(new Customer());

        StudentDAO dao = new StudentDAO();
        dao.add(new Student());
        Student index = dao.getIndex(1);
    }
}
