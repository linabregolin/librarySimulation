package Aulas.biblioteca;
import java.util.ArrayList;
public class CadastroLivros {
    private int index;
    private ArrayList<Livro> livros;

public CadastroLivros(){
    livros = new ArrayList<Livro>();
    index = 0;
}

public void adicionarLivro(Livro livro){
    livros.add(livro);
    System.out.println("\nLivro cadastrado com sucesso!");
}

public boolean pesquisarLivro(String titulo, String autor) {
    for (int i = 0; i < livros.size(); i++) {
        int local = -1;
        if (livros.get(i).getTitulo().equals(titulo) && livros.get(i).getAutor().equals(autor)) {
            local = i;
            System.out.println("\nLivro encontrado na posição " + local + ".");
            return true;
        }
    }
    System.out.println("\nLivro não encontrado.");
    return false;
}

public void removerLivro(String titulo, String autor){
        boolean posicao = pesquisarLivro(titulo,autor);

        if(posicao == true){
            livros.remove(posicao);
            System.out.println("\nLivro removido com sucesso!");
        }
}
}


