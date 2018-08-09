package com.dieboldnixdorf.connector.camel.model;


public class Item {

    private String uuid;
    private String formato;
    private int quantidade;
    private Livro livro;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Item{" +
                "uuid='" + uuid + '\'' +
                ", formato='" + formato + '\'' +
                ", quantidade=" + quantidade +
                ", livro=" + livro +
                '}';
    }
}
