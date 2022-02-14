package ua.hillel.test.homeWork17;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class homeWork17 {

    @DataProvider
    public Object[][] generateUser(){

        return new Object[][]{
                {"Name1", "Password1", "user"},
                {"Name2", "Password2", "user"},
                {"Name3", "Password3", "admin"},
        };
    }

    @Test(dataProvider = "generateUser", groups = {"Login"})
    public void loginTest(String user, String password, String role)
    {
        if (role == "admin")
            throw new RuntimeException("Admin can not login");
        else
        System.out.printf("User - %s, Password - %s, Role - %s\n", user, password, role);

    }

    @Test(dataProvider = "generateUser", dependsOnGroups = { "Login" })
    public void authorizeTest(String user, String password, String role)
    {
        System.out.printf("User %s is logged in", user);
    }

    @Test
    @Parameters({"login"})
    public void getParameter(String parameter)
    {
        System.out.println(parameter);
    }


}
