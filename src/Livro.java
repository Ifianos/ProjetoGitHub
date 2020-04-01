/**
 * @author Anna Luiza
 */
public class Livro {
    //5 atributos
    String autor;
    String titulo;
    String generoLiterario;
    float nCadastro;
    float qPaginas;
    
    //1 construtor
    public Livro(){
        System.out.println("Procurando quantidade de livros sobre determinado autor...");
    }
    
    //3 métodos
        void procurar(){
            System.out.println("Procurando se livro está disponível...");
        }
        
        void devolverLivro(float dataDevolverLivro){
            System.out.println("Favor devolver livro em até sete dias.");
        }
}
