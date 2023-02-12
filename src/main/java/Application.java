import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        Employee book1 = new Employee(2, "zzz", "zzz", "man", 30, 3);

        employeeDAO.create(book1);


        System.out.println(employeeDAO.readById(1));


        List<Employee> list = employeeDAO.readAll();

        for (Employee employee : list) {
            System.out.println(employee);
        }

        Employee employee2 = new Employee(5, "xxx", "xxx", "woman", 27, 4);


        employeeDAO.updateEmployee(employee2);


        employeeDAO.delete(employee2);

    }
}



