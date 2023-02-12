package dao;

import model.City;
import model.Employee;

import java.util.List;

public interface CityDAO {

    void create(City city);

    City readById(int id);

    List<City> readAll();

    void updateEmployee(City city);

    void delete(City city);

}
