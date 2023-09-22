/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author richa
 */
public class Cliente {
   private String nome;
   private String sobrenome;
   private String sexo;
   private String telefone;
   private String dataDeNascimento;
   private String endereco;
   private Carro car;
   
  public Cliente (){
      this.nome = "";
      this.sobrenome = "";
      this.sexo = "";
      this.telefone = "";
      this.dataDeNascimento = "";
      this.endereco = "";
  }
   
   public Cliente (String nome, String sobrenome){
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.sexo = sexo;
       this.telefone = telefone;
       this.dataDeNascimento = dataDeNascimento;
       this.endereco = endereco;
       this.car = null;
   }


   
    public String getNome(){
        return this.nome;    
    }
    
    public String getSobrenome(){
        return this.sobrenome;     
    } 
    
    public String getSexo(){
        return this.sexo;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public String getDataNascimento(){
        return this.dataDeNascimento;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setCarro(Carro car){
        this.car = car;
    }
    
    public Carro getCarro(Carro car){
        return this.car;
    }
 
    public String todoOsDados(){
        return "Nome e Sobrenome: "+this.nome+" "+this.sobrenome+" Sexo: "+this.sexo+"  Telefone: "+this.telefone+" Data de Nascimento: "+this.dataDeNascimento+" Edereço: "+this.endereco+" Carro: "+this.car;
    }
    
}
