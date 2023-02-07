import java.sql.*;

public class Application {

    public static void main(String[] args) throws SQLException {


        final String user = "postgres";
        final String password = "6297794neon";
        final String url = "jdbc:postgresql://localhost:5432/skypro";


        try (final Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE id = (?)")) {

            statement.setInt(1, 3);

            final ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                String firstNameOfEmployee = "First_name: " + resultSet.getString("first_name");
                String lastNameOfEmployee = "Last_name: " + resultSet.getString("last_name");
                String genderOfEmployee = "Gender: " + resultSet.getString("gender");
                String ageOfEmployee = "Age: " + resultSet.getString("age");
                String cityIdOfEmployee = "City_id: " + resultSet.getString("city_id");


                System.out.println(firstNameOfEmployee);
                System.out.println(lastNameOfEmployee);
                System.out.println(genderOfEmployee);
                System.out.println(ageOfEmployee);
                System.out.println(cityIdOfEmployee);

            }
        }
    }
}

