package by.peleng.DAO.data.connect;

import by.peleng.DAO.data.subject.Galahies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DataBaseHelper {
    private final static String SQL_INSERT_GALAHIES =
            "INSERT INTO `universe`.`galaxies` (`idgalaxies`, `name`, `palanet`) VALUES(?,?,?)";


    private Connection connect;
    public DataBaseHelper() throws SQLException {
        connect = ConnectorDB.getConnection();
    }
    public PreparedStatement getPreparedStatement(){
        PreparedStatement ps = null;
        try {
            ps = connect.prepareStatement(SQL_INSERT_GALAHIES);
        } catch (SQLException e) {}
        return ps;
    }



    public boolean insertGalaxies(PreparedStatement ps, Galahies ab) {
        boolean flag = false;
        try {
            ps.setInt(1, ab.getId());
            ps.setString(2, ab.getName());
            ps.setString(3, ab.getPlanets());
            ps.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }


    public void closeStatement(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}