/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna Luiza
 */
public class Biblioteca {
    //5 atributos
    String qAutores;
    String qGeneros;
    String endereco;
    float qUsuarios;
    float qLivros;
    
    //1 construtor
    public Biblioteca(){
        System.out.println("Verificando quantidade de usuários da biblioteca...");
    }
    
    //2 metodos
    
    void procurarUsuario(){
        System.out.println("Verificando cadastro do usuário...");
    }
    
    void cobrarLivrosAtrasados(){
        System.out.println("Procurando possíveis atrasos...");
    }
}
