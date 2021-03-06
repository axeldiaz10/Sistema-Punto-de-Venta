/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Axel y Ampy
 */
public class Turno {
    private Date horaEntrada;
    private Date horaSalida;
    private String nombre;
    
    public Turno() {
    }

    public Turno(Date horaEntrada, Date horaSalida, String nombre) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return "Turno{" + "horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", nombre=" + nombre + '}';
    }

    
    
}
