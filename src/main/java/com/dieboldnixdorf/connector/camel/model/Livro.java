package com.dieboldnixdorf.connector.camel.model;

public class Livro {

    private String codigo;
    private String titulo;
    private String tituloCurto;
    private String nomeAutor;
    private double valorEbook;
    private double valorImpresso;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloCurto() {
        return tituloCurto;
    }

    public void setTituloCurto(String tituloCurto) {
        this.tituloCurto = tituloCurto;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public double getValorEbook() {
        return valorEbook;
    }

    public void setValorEbook(double valorEbook) {
        this.valorEbook = valorEbook;
    }

    public double getValorImpresso() {
        return valorImpresso;
    }

    public void setValorImpresso(double valorImpresso) {
        this.valorImpresso = valorImpresso;
    }
}
