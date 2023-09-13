/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author richa
 */
public class Cliente {
    public String nome;
    public String sobrenome;
    public String sexo;
    public String telefone;
    public String dataNascimento;
    public String endereco;
    public Veiculo veiculo;
    public PlanoAssinatura planoAssinatura;

   public Cliente (String nome, String sobrenome, String telefone, String dataNascimento, String endereco){
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.telefone = telefone;
       this.dataNascimento = dataNascimento;
       this.endereco = endereco;
   }
}