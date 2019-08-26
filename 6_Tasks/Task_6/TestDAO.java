<<<<<<< HEAD
package by.peleng.DAO;

import by.peleng.DAO.data.connect.ConnectorDB;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;

public class TestDAO  {




    public void filnAll(String sqlRequest){
        Connection cn = null;
        Statement st = null;
        ArrayList<String> list = new ArrayList<>();
        try {
            cn = ConnectorDB.getConnection();
            st = cn.createStatement();
            ResultSet resultSet =
                    st.executeQuery(sqlRequest);
            ResultSetMetaData mets = resultSet.getMetaData();
            int iColumnCoint = mets.getColumnCount();
            for (int i=1;i<iColumnCoint;i++){
               list.add(mets.getColumnName(i));

            }
            while (resultSet.next()) {
               for (String s:list){
                   System.out.print("  |  "   + s+" : "+ resultSet.getString(s)+"  |  ");
               }
               System.out.println();

            }
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed): " + e);
        } finally {
            if (cn!=null){
                try {
                    cn.close();
                } catch (SQLException e){
                    System.err.println(e);
                }
            }
        }


    }

}
=======
package by.peleng.DAO;

import by.peleng.DAO.data.connect.ConnectorDB;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;

public class TestDAO  {




    public void filnAll(String sqlRequest){
        Connection cn = null;
        Statement st = null;
        ArrayList<String> list = new ArrayList<>();
        try {
            cn = ConnectorDB.getConnection();
            st = cn.createStatement();
            ResultSet resultSet =
                    st.executeQuery(sqlRequest);
            ResultSetMetaData mets = resultSet.getMetaData();
            int iColumnCoint = mets.getColumnCount();
            for (int i=1;i<iColumnCoint;i++){
               list.add(mets.getColumnName(i));

            }
            while (resultSet.next()) {
               for (String s:list){
                   System.out.print("  |  "   + s+" : "+ resultSet.getString(s)+"  |  ");
               }
               System.out.println();

            }
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed): " + e);
        } finally {
            if (cn!=null){
                try {
                    cn.close();
                } catch (SQLException e){
                    System.err.println(e);
                }
            }
        }


    }

}
>>>>>>> добавлена задача 6-6 на jdbc
