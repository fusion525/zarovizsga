package hu.nive.ujratervezes.zaroviszga;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {

    private MariaDbDataSource dataSource;

    public DogTypes(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country)
    {
        List<String> foundDogs = new ArrayList<>();

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("SELECT name from employees.dog_types WHERE country = ? ORDER BY name desc");
        ) {
            stmt.setString(1, country.toUpperCase());

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                foundDogs.add(rs.toString().toLowerCase());
            }

        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }

        return foundDogs;
    }

}
