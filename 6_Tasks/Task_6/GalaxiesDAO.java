package by.peleng.DAO;

import by.peleng.DAO.data.connect.ConnectorDB;
import by.peleng.DAO.data.subject.Galahies;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static by.peleng.DAO.data.subject.Entity.close;

public class GalaxiesDAO extends AbstractDAO<Integer, Galahies>{

    public static  String SQL_SELECT_ALL_GALAHIES = "SELECT * FROM universe.galaxies;";
    private final static String SQL_INSERT_GALAHIES =
            "INSERT INTO `universe`.`galaxies` (`idgalaxies`, `name`, `palanet`) VALUES(?,?,?)";

    @Override
    public List<Galahies> findAll() {
        List<Galahies> galahie = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        try {
            cn = ConnectorDB.getConnection();
            st = cn.createStatement();
            ResultSet resultSet =
                    st.executeQuery(SQL_SELECT_ALL_GALAHIES);
   /*         ResultSetMetaData mets = resultSet.getMetaData();
            int iColumnCoint = mets.getColumnCount();
            for (int i=1;i<iColumnCoint;i++){
                System.out.print(mets.getColumnName(i) + "  ");

            }*/
            while (resultSet.next()) {

                Galahies galahies = new Galahies();
                galahies.setId(resultSet.getInt("idgalaxies"));
                galahies.setName(resultSet.getString("name"));
                galahies.setPlanets(resultSet.getString("palanet"));
                galahie.add(galahies);
            }
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed): " + e);
            try {
                throw  new DAOException();
            } catch (DAOException ex) {
                ex.printStackTrace();
            }
        } finally {
           // close(st);
                if (cn!=null){
                    try {
                        cn.close();
                    } catch (SQLException e){
                        System.err.println(e);
                    }
            }
        }
        return galahie;


    }

    @Override
    public Galahies findEntityById(Integer id) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean delete(Galahies entity) {
        return false;
    }

    @Override
    public boolean create(Galahies entity) {
        boolean flag = false;
        Connection cn = null;
        PreparedStatement ps = null;
        try {

            cn = ConnectorDB.getConnection();
            ps = cn.prepareStatement(SQL_INSERT_GALAHIES);

            ps.setInt(1, entity.getId());
            ps.setString(2, entity.getName());
            ps.setString(3, entity.getPlanets());
            ps.executeUpdate();
            flag = true;
            } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("SQL exception (request or table failed): " + ex);
        }


        finally {
            close(cn);

        }


        return flag;
    }

    @Override
    public Galahies update(Galahies entity) {
        return null;
    }
}
