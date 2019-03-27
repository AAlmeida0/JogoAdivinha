/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author pc
 */
public class Jogo_DAO {

    LinkedList<String> lista = new LinkedList();
    String resposta = "";

    public LinkedList<String> Get_LISTA() throws ClassNotFoundException {
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "select ID_COMBINACAO,DIFICULDADE,DESCRICAO from COMBINACAO ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                lista.add(rs.getString("ID_COMBINACAO") + "-" + rs.getString("DIFICULDADE") + "-" + rs.getString("DESCRICAO"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return lista;
    }

    public String GET_JOGO(String id) throws ClassNotFoundException {
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "select * from COMBINACAO where ID_COMBINACAO = '" + id + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                resposta = rs.getString("COMBINACAO") + "-" + rs.getString("DESCRICAO") + "-" + String.valueOf(rs.getInt("DIFICULDADE"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return resposta;
    }

    public int vidas(String id) throws ClassNotFoundException {
        Statement stmt = null;
        int resp = -1;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "select * from COMBINACAO where ID_COMBINACAO = '" + id + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                resp = rs.getInt("DIFICULDADE");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return resp;
    }

    public int get_pontos(String id) throws ClassNotFoundException {
        Statement stmt = null;
        int resp = -1;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "select PONTOS from USUARIO where ID_USUARIO = '" + id + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                resp = rs.getInt("PONTOS");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return resp;
    }

    public void pontos(String id, int pontos) throws ClassNotFoundException {
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "update USUARIO set PONTOS = " + pontos + " where ID_USUARIO = '" + id + "'";
            ResultSet rs = stmt.executeQuery(sql);
            connection.close();
            commit();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
    }

    private void commit() throws ClassNotFoundException {
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "commit";
            ResultSet rs = stmt.executeQuery(sql);
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
    }
}
