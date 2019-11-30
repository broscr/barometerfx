package sample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseDao {

    Connection connection;

    public DatabaseDao() {

        connection = SqliteConnection.connector();
        if (connection == null) {
            System.exit(1);
        }
    }

    public List<Meydanlar> selectAll() {
        String sql = "SELECT istasyon_id, istasyon_name, istasyon_height, istasyon_gravity,istasyon_indic FROM meydanlar";
        try {
            List<Meydanlar> meydanlars = new ArrayList<>();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            // loop through the result set
            while (rs.next()) {
                Meydanlar meydanlar1 = new Meydanlar(rs.getInt("istasyon_id"),rs.getString("istasyon_name")
                        ,rs.getDouble("istasyon_height"),rs.getDouble("istasyon_gravity")
                        ,rs.getString("istasyon_indic"));
                meydanlars.add(meydanlar1);
                System.out.println(meydanlar1.getIstasyon_name());
            }
            return meydanlars;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public boolean idDbConnected() {
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
