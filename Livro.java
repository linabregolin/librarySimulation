package Aulas.biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private double valor;

public Livro(){
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    this.valor = valor;
}

public void setTitulo(String titulo){
    this.titulo = titulo;
}

public String getTitulo(){
    return this.titulo;
}

public void setAutor(String autor){
    this.autor = autor;
}

public String getAutor(){
    return this.autor;
}

public void setPaginas(int paginas){
    this.paginas = paginas;
}

public int getPaginas(){
    return this.paginas;
}

public void setValor(double valor){
    this.valor = valor;
}

public double getValor(){
    return this.valor;
}

public void Preencher(String titulo, String autor, int paginas, double valor){
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    this.valor = valor;
}

public void Imprimir(){
    System.out.println("\nTítulo: " + this.titulo + "\nAutor: " + this.autor + "\nPáginas totais: "
    + this.paginas + "\nPreço: " + this.valor);
}

public void Copia(){
    Livro copia = new Livro();
    copia.Preencher(this.titulo,this.autor,this.paginas,this.valor);
    System.out.println("Cópia gerada. Imprimindo a cópia...");
    copia.Imprimir();
}

}
