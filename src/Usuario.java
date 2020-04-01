/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna Luiza
 */
public class Usuario {
    //5 atributos
    String nome;
    String cpf;
    float idade;
    String endereco;
    String telefone;
    
    //1 construtor
    public Usuario(){
        System.out.println("Pesquisando cadastro...");
    }
    
    //2 metodos
    void cadastrar(){
        System.out.println("Realizando cadastro...");
    }
    
    void escolheLivro(){
        System.out.println("Escolha o livro desejado.");
    }
    
}
