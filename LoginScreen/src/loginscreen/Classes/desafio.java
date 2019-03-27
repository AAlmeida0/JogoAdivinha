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
public class desafio extends desafio_DAO {
    private String desc;
    private String combinacao;
    private String id ="";
    
    public boolean criar_desafio (String id2,String desc,String comb) throws ClassNotFoundException{
        while (verifica_id(id) == true) {
            String caracteres = "abcdefghijklmnopqrstuvxwyz1234567890";
            for (int i = 0; i < 20; i++) {
                Random rand = new Random();
                int caractere = rand.nextInt(caracteres.length() - 1);
                id += caracteres.charAt(caractere);
            }
        }
        Criar_desafio(id2, desc, comb, id);
        return true;
    }
    
    
}
