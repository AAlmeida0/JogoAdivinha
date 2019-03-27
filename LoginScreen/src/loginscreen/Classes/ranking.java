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
public class ranking {

    public LinkedList<String> get_ranking() throws ClassNotFoundException {// select ID_USUARIO from USUARIO where NOME = nome and SENHA = senha;
        Statement stmt = null;
        LinkedList<String> list = new LinkedList();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "ROOT", "toor");
            stmt = connection.createStatement();
            String sql = "select NOME,PONTOS from USUARIO where rownum <= 10 order by PONTOS desc";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(rs.getString("NOME") + "-" + rs.getInt("PONTOS"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return list;
    }
}
