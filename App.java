package Aulas.biblioteca;
import java.util.Scanner;
public class App {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        CadastroLivros cadastro = new CadastroLivros();
        int menu;
        boolean repetir = true, repetir1 = true;

        do{
        System.out.println("\n*** MENU *** \n (1) Adicionar livro; \n"
        + " (2) Pesquisar livro;\n (3) Remover Livro; \n (4) Sair.");
        menu = input.nextInt();

        switch(menu){
            case 1:
            String titulo, autor;
            int paginas, verificar;
            double valor;

                Livro novoLivro = new Livro();
                input.nextLine();

                System.out.println("\nInsira o título do livro: ");
                novoLivro.setTitulo(titulo = input.nextLine());

                System.out.println("Insira o autor do livro: ");
                novoLivro.setAutor(autor = input.nextLine());

                System.out.println("Insira o total de páginas do livro: ");
                novoLivro.setPaginas(paginas = input.nextInt());

                System.out.println("Insira o preço do livro: ");
                novoLivro.setValor(valor = input.nextDouble());

                System.out.println("\nAs informações registradas foram: ");
                novoLivro.Imprimir();
                System.out.println( "\nDeseja confirmar as informações? \n (1) SIM.    (2) NÂO.");

                do{
                verificar = input.nextInt();

                if(verificar ==1){cadastro.adicionarLivro(novoLivro); repetir = false;}
                else if(verificar ==2){System.out.println("\nO livro não foi cadastrado. Voltando ao menu..."); repetir = false;}
                else{System.out.println("Valor inválido, tente novamente."); repetir = true;}
                }while(repetir1);
                
                break;
            case 2:
                input.nextLine();
                String pesqTitulo, pesqAutor;

                System.out.println("\nInsira o título do livro a ser pesquisado:");
                pesqTitulo = input.nextLine();

                System.out.println("Insira o autor do livro a ser pesquisado:");
                pesqAutor = input.nextLine();

                cadastro.pesquisarLivro(pesqTitulo, pesqAutor);
                break;

            case 3:
                input.nextLine();
                String pesqTitulo2, pesqAutor2;

                System.out.println("\nInsira o título do livro a ser removido:");
                pesqTitulo2 = input.nextLine();

                System.out.println("Insira o autor do livro a ser removido:");
                pesqAutor2 = input.nextLine();

                cadastro.removerLivro(pesqTitulo2, pesqAutor2);
                break;

            case 4:
                System.out.println("Saindo...");
                repetir = false;
                break;

            default:
                System.out.println("\nErro, tente novamente.");
                break;
        }
        }while(repetir);
    }

}
