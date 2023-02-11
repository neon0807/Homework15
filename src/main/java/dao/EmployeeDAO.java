package dao;

import model.City;
import model.Employee;

import java.util.List;

public interface EmployeeDAO {

    void create(Employee employee);


    Employee readById(int id, String firstName, String lastName, String gender, int age, City city);

    List <Employee> readAll();

    void updateEmployeeById(int id, String first_name, String last_name, String gender,
                            int age, String city_name);

    void deleteById(int id);

}
