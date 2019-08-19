package by.peleng.DAO;

import by.peleng.DAO.data.connect.ConnectorDB;
import by.peleng.DAO.data.subject.Planets;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static by.peleng.DAO.data.subject.Entity.close;

public class PlanetsDAO extends AbstractDAO<Integer, Planets> {

    public static String SQL_SELECT_ALL_PLANETS = "SELECT * FROM `universe`.`planets`;";
    public static String SQL_INSERT__PLANETS = "INSERT INTO `universe`.`planets` " +
            "(`idPlanets`, `name`, `core temperature`, `atmosphere`, `life`, `radius`, `satellites`, `galaxies_idgalaxies`) " +
            "VALUES (?, ?, ?,?, ?, ?, ?, ?)";
    public static String  SQL_DELETE_ID=" DELETE FROM `universe`.`planets` WHERE (`idPlanets` = ?)";

    @Override
    public List<Planets> findAll() {
        List<Planets> planets = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        try {
            cn = ConnectorDB.getConnection();
            st = cn.createStatement();
            ResultSet resultSet =
                    st.executeQuery(SQL_SELECT_ALL_PLANETS);
       /*     ResultSetMetaData mets = resultSet.getMetaData();
            int iColumnCoint = mets.getColumnCount();
            for (int i=1;i<iColumnCoint;i++){
                System.out.print(mets.getColumnName(i) + "  ");

            }*/
            while (resultSet.next()) {
                Planets planet = new Planets();
                planet.setId(resultSet.getInt("idPlanets"));
                planet.setName(resultSet.getString("name"));
                planet.setCoreTemperathure(resultSet.getInt("core_temperature"));
                planet.setAthmosphere(resultSet.getBoolean("atmosphere"));
                planet.setLife(resultSet.getBoolean("life"));
                planet.setRadius(resultSet.getInt("radius"));
                planet.setSatellites(resultSet.getInt("satellites"));
                planet.setGalaxies_id(resultSet.getInt("galaxies_idgalaxies"));

                planets.add(planet);
            }
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed): " + e);
        } finally {
            close(st);

        }
        return planets;
    }

    @Override
    public Planets findEntityById(Integer id) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        boolean flag = false;
        Connection cn = null;
        PreparedStatement ps = null;
        try {

            cn = ConnectorDB.getConnection();
            ps = cn.prepareStatement(SQL_DELETE_ID);
            ps.setInt(1, id);
            ps.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("SQL exception (request or table failed): " + ex);
        } finally {
            close(cn);

        }




        return flag;
    }

    @Override
    public boolean delete(Planets entity) {
        return false;
    }

    @Override
    public boolean create(Planets entity) {
        boolean flag = false;
        Connection cn = null;
        PreparedStatement ps = null;
        try {

            cn = ConnectorDB.getConnection();
            ps = cn.prepareStatement(SQL_INSERT__PLANETS);

            ps.setInt(1, entity.getId());
            ps.setString(2, entity.getName());
            ps.setInt(3, entity.getCoreTemperathure());
            ps.setBoolean(4, entity.isAthmosphere());
            ps.setBoolean(5, entity.isLife());
            ps.setInt(6, entity.getRadius());
            ps.setInt(7, entity.getSatellites());
            ps.setInt(8, entity.getGalaxies_id());


            ps.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("SQL exception (request or table failed): " + ex);
        } finally {
            close(cn);

        }


        return flag;


    }

    @Override
    public Planets update(Planets entity) {
        return null;
    }
}
