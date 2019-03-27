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
public class desafio_DAO {

    String resposta = "";

    public void Criar_desafio(String id, String desc, String comb, String id2) throws ClassNotFoundException {
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "insert into COMBINACAO(ID_USUARIO,ID_COMBINACAO,DESCRICAO,COMBINACAO,DIFICULDADE) values ('"+id+"','"+id2+"','"+desc+"','"+comb+"',0)";
            ResultSet rs = stmt.executeQuery(sql);
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        commit();
    }

    public boolean verifica_id(String id) throws ClassNotFoundException {
        if (id == "") {
            return true;
        } else {
            Statement stmt = null;
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection connection = null;
                connection = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
                stmt = connection.createStatement();
                String sql = "select ID_USUARIO from COMBINACAO where ID_COMBINACAO = '" + id + "'";
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
        if (resposta == "") {
            return false;
        } else {
            return true;
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
