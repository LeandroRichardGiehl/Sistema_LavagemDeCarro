/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalTime;

/**
 *
 * @author richa
 */
public class Agendamento {
    public Cliente cliente;
    public int dia;
    public LocalTime horario;

    public Agendamento(int dia, int hora, int minuto){
    this.dia = dia;
    this.horario = LocalTime.of(hora, minuto);
    }
}
