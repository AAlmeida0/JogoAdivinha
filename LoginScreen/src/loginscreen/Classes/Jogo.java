/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen.Classes;

import java.util.LinkedList;

/**
 *
 * @author pc
 */
public class Jogo extends Jogo_DAO {

    public LinkedList<String> get_lista() throws ClassNotFoundException {
        return Get_LISTA();
    }

    public String get_jogo(String id) throws ClassNotFoundException {
        return GET_JOGO(id);
    }

    public String verifica(String combinacao, String Sequencia) {
        String sequencia = Sequencia;
                for (int i=0;i<sequencia.length();i++){
            if (sequencia.length() != combinacao.length()){
                sequencia += " ";
            }
        }
         String resposta = "";
        boolean presente = false;
        for (int i = 0; i < sequencia.length(); i++) {
            if (sequencia.charAt(i) == combinacao.charAt(i)) {
                resposta += "1";
            } else {
                for (int a = 0; a < sequencia.length(); a++) {
                    if (sequencia.charAt(i) == combinacao.charAt(a)) {
                        presente = true;
                        resposta += "3";
                        break;
                    }
                }
            }
            if (presente == false && sequencia.charAt(i) != combinacao.charAt(i) || sequencia.charAt(i) == ' ') {
                resposta += "2";
            }
        }
        return resposta;
    }

    public int get_vidas(String id) throws ClassNotFoundException {
        int resp = vidas(id);
        switch (resp) {
            case 0:
                resp = 8;
                break;
            case 1:
                resp = 12;
                break;
            case 2:
                resp = 15;
                break;
            default:
                resp = -1;
                break;
        }
        return resp;
    }

    public void atualizar_pontos(String id, int pontos) throws ClassNotFoundException {
        int resp = get_pontos(id);
        pontos(id, (resp + pontos));
    }
}
