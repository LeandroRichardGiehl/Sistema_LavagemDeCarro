/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author richa
 */
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    
    public Carro(String marca, String modelo, int ano,String cor, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    Carro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String exibeCarro(){
        return "Marca: "+this.marca+" Modelo: "+this.modelo+" Ano: "+this.ano+" Cor: "+this.cor+" Placa do carro: "+this.placa;
    }
}
