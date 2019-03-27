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

/**
 *
 * @author pc
 */
public class usuario_dao {

    String resposta = "";

    public String get_id(String nome, String senha) throws ClassNotFoundException {// select ID_USUARIO from USUARIO where NOME = nome and SENHA = senha;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String Nome = nome;
            String Senha = senha;
            String sql = "select NOME,PONTOS,ID_USUARIO from USUARIO where NOME = '" + Nome + "' and SENHA = '" + Senha + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                resposta += rs.getString("NOME") + "-" + rs.getInt("PONTOS") + "-" + rs.getString("ID_USUARIO");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return resposta;
    }

    public boolean verifica_id(String id) throws ClassNotFoundException {
      if (id == ""){
          return true;
      }
      else {
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "select NOME from USUARIO where ID_USUARIO = '" + id + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                resposta = rs.getString("NOME");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
      }
      if (resposta == ""){
          return false;
      }
      else {
          return true;
      }
    }

    public void criar_conta(String nome, String id, String email, String senha) throws ClassNotFoundException {
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "insert into USUARIO(NOME,ID_USUARIO,EMAIL,SENHA,PONTOS) values ('" + nome + "','" + id + "','" + email + "','" + senha + "',0)";
            ResultSet rs = stmt.executeQuery(sql);
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        commit();
    }

    public String verificar(String nome, String email) throws ClassNotFoundException {
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "select ID_USUARIO from USUARIO where NOME = '" + nome + "' and EMAIL = '" + email + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                resposta = rs.getString("ID_USUARIO");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return resposta;
    }
    
    public String nome (String id) throws ClassNotFoundException{
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "select NOME from USUARIO where ID_USUARIO = '"+id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                resposta = rs.getString("NOME");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return resposta;
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
