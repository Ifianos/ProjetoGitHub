/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna Luiza
 */
public class ProjetoTres {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        b1.qUsuarios = 1054;
        System.out.println("No momento temos " + b1.qUsuarios + " usuários de nossa biblioteca.");
        
        System.out.println(" ");
        
        Livro l1 = new Livro();
        l1.autor = "Machado de Assis";
        System.out.println("Temos 10 livros disponíveis de " + l1.autor + ".");
        
        System.out.println(" ");
        
        Usuario u1 = new Usuario();
        u1.idade = 18;
        u1.nome = "Maria";
        u1.cpf = "799.577.156-10";
        System.out.println("Nome do usuário: " + u1.nome);
        System.out.println("Idade do usuário: " + u1.idade);
        System.out.println("CPF do usuário: " + u1.cpf);
    }   
}
