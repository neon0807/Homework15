import dao.CityDAO;
import dao.CityDAOImpl;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.City;
import model.Employee;

import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        cityDAO.create(new City("5"));

        City city = cityDAO.readById(5);
        Employee employee1 = new Employee(5, "ooo", "ooo", "man", 35);
        employee1.setCity(city);
        employeeDAO.create(employee1);


        cityDAO.delete(city);







    }
}



