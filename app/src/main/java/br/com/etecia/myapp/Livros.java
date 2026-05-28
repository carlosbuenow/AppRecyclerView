package br.com.etecia.myapp;

public class Livros {
    private String titulo;
    private String categoria;
    private int imagemLivro;
    private double preco;

    public Livros(String titulo, String categoria, int imagemLivro, double preco) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.imagemLivro = imagemLivro;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImagemLivro() {
        return imagemLivro;
    }

    public void setImagemLivro(int imagemLivro) {
        this.imagemLivro = imagemLivro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
