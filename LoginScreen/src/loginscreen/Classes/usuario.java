/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen.Classes;

import java.util.Random;

/**
 *
 * @author pc
 */
public class usuario extends usuario_dao {

    private String id = "";
    private String Nome = "";
    private int pontos;

    public String Get_id(String nome, String senha) throws ClassNotFoundException {
        String resp = get_id(nome, senha);
        int contador = 0;
        String temp = "";
        if (resp.equals("")){
            return "null";
        }
        else{
        for (int i = 0; i < resp.length(); i++) {
            if (resp.charAt(i) == '-') {
                contador++;
                continue;
            }
            switch (contador) {
                case 2:
                    id += resp.charAt(i);
                    break;
                case 1:
                    temp += resp.charAt(i);
                    break;
                case 0:
                    Nome += resp.charAt(i);
                    break;
            }

        }
        this.pontos = Integer.parseInt(temp);
        return id;
        }
    }

    public void criar_login(String nome, String email, String senha) throws ClassNotFoundException {
        String Nome = nome;
        String Email =email;
        String Senha = senha;
        while (verifica_id(id) == true) {
            String caracteres = "abcdefghijklmnopqrstuvxwyz1234567890";
            for (int i = 0; i < 20; i++) {
                Random rand = new Random();
                int caractere = rand.nextInt(caracteres.length() - 1);
                id += caracteres.charAt(caractere);
            }
        }
        criar_conta(Nome, id, Email, Senha);
    }

    public boolean verifica_cadastro(String nome, String email) throws ClassNotFoundException {
        String resp = "";
        resp = verificar(nome, email);
        if (!"".equals(resp)) {
            return true;
        } else {
            return false;
        }
    }
    public String get_nome (String id) throws ClassNotFoundException{
       String resp = nome(id);
       return resp;
    }
}
