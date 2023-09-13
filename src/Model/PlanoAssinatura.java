/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author richa
 */
public class PlanoAssinatura {
    public String nome;
    public double preco;
    public int numeroLavagens;
    public String formaPagamento;

    public PlanoAssinatura(String nome, double preco, int numeroLavagens, String formaPagamento){
        this.nome = nome;
        this.preco = preco;
        this.numeroLavagens = numeroLavagens;
        this.formaPagamento = formaPagamento;
    }
}
