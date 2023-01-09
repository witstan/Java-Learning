package com.witstan.exer1;

import org.junit.Test;

import java.util.List;

/**
 * @author witstan
 * @create 2023-01-09 21:54
 */
public class DAOTest {

    @Test
    public void test(){

        DAO<User> userDAO = new DAO<>();
        userDAO.save("001",new User(001,20,"Tom"));
        userDAO.save("002",new User(002,24,"Jerry"));
        userDAO.save("003",new User(003,54,"Tina"));
        userDAO.save("004",new User(004,76,"Jessi"));

        User u003 = userDAO.get("003");

        System.out.println(u003);

        userDAO.update("002",new User(005,35,"Adam"));
        User u002 = userDAO.get("002");

        System.out.println(u002);

        List<User> list = userDAO.list();
        System.out.println(list);

        userDAO.delete("001");

        List<User> list1 = userDAO.list();
        System.out.println(list1);




    }
}
