package capitulo03;

import javax.swing.*;

public class Invoice {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double preco;

    public Invoice(String numero, String descricao, int quantidadeComprada, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.preco = preco;
    }

    public double getInvoiceAmount() {
        if (quantidadeComprada <= 0) {
            return 0; //So nao sei como retornar esse 0 sem o ponto flutuante
        } else if (preco <= 0) {
            return 0.0;
        } else {
            return quantidadeComprada*preco;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
