package by.peleng.DAO.data.subject;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Entity implements Serializable, Cloneable {
    public int id;
    public Entity() {
    }
    public Entity(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static void close(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
// лог о невозможности закрытия Statement
        }
    }
    public static void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();

            }
        } catch (SQLException e) {
// генерация исключения, т.к. нарушается работа пула
        }
    }
}