package by.peleng.DAO;

import by.peleng.DAO.data.connect.ConnectorDB;
import by.peleng.DAO.data.subject.Satelites;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static by.peleng.DAO.data.subject.Entity.close;

public class SatellitesDAO extends AbstractDAO<Integer, Satelites> {
    public static  String SQL_SELECT_ALL_SATELITES = "SELECT * FROM `universe`.`satellites`";

    public static  String SQL_SINSERT_SATELITES ="INSERT INTO `universe`.`satellites` " +
            "(`idsatellites`, `name`, `radius`, `distance`, `Planets_idPlanets`, `Planets_galaxies_idgalaxies`) VALUES ('4', 'Linj-86', '214', '587498', '6', '2')";
    public static  String SQL_DELETE_ID = "DELETE FROM `universe`.`satellites` WHERE (`idsatellites` = '?')";


    @Override
    public List<Satelites> findAll() {
        List<Satelites> satelite = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        try {
            cn = ConnectorDB.getConnection();
            st = cn.createStatement();
            ResultSet resultSet =
                    st.executeQuery(SQL_SELECT_ALL_SATELITES);
   /*         ResultSetMetaData mets = resultSet.getMetaData();
            int iColumnCoint = mets.getColumnCount();
            for (int i=1;i<iColumnCoint;i++){
                System.out.print(mets.getColumnName(i) + "  ");

            }*/
            while (resultSet.next()) {
                Satelites satelites = new Satelites();
                satelites.setId(resultSet.getInt("idsatellites"));
                satelites.setName(resultSet.getString("name"));
                satelites.setRadius(resultSet.getInt("radius"));
                satelites.setDistance(resultSet.getInt("distance"));
                satelites.setPlanets_idPlanets(resultSet.getInt("Planets_idPlanets"));
                satelites.setPlanets_galaxies_idgalaxies(resultSet.getInt("Planets_galaxies_idgalaxies"));

                satelite.add(satelites);
            }
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed): " + e);
        } finally {
            close(st);

        }
        return satelite;
    }

    @Override
    public Satelites findEntityById(Integer id) {
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
    public boolean delete(Satelites entity) {
        return false;
    }

    @Override
    public boolean create(Satelites entity) {

        boolean flag = false;
        Connection cn = null;
        PreparedStatement ps = null;
        try {

            cn = ConnectorDB.getConnection();
            ps = cn.prepareStatement(SQL_SINSERT_SATELITES);

            ps.setInt(1, entity.getId());
            ps.setString(2, entity.getName());
            ps.setInt(3, entity.getRadius());
            ps.setInt(4, entity.getDistance());
            ps.setInt(5, entity.getPlanets_idPlanets());
            ps.setInt(6, entity.getPlanets_galaxies_idgalaxies());

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
    public Satelites update(Satelites entity) {
        return null;
    }
}
