/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clearminds.cuentas;

/**
 *
 * @author Oscar
 */
public class Cuenta {
    private String Id;
    private String Tipo = "A";
    private double Saldo;

    public String getId() {
        return Id;
    }

    public String getTipo() {
        return Tipo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public Cuenta(String Id) {
        this.Id = Id;
        this.Tipo = "A";
    }

    public Cuenta(String Id, String Tipo, double Saldo) {
        this.Id = Id;
        this.Tipo = Tipo;
        this.Saldo = Saldo;
    }
    public void imprimirConMiEstilo(){
        System.out.println("*********************************");
        imprimirCentrado("CUENTA");
        System.out.println("*********************************");
        imprimirCentrado("Numero de cuenta " + this.Id);
        imprimirCentrado("Tipo " + this.Tipo);
        imprimirCentrado("Saldo " + this.Saldo);
        System.out.println("*********************************\n");
    }
    private void imprimirCentrado(String contenido) {
        int longitudLinea = 31; // Ajusta la longitud según sea necesario
        int espaciosAntes = (longitudLinea - contenido.length()) / 2;
        int espaciosDespues = longitudLinea - espaciosAntes - contenido.length();

        StringBuilder lineaCentrada = new StringBuilder("*");
        for (int i = 0; i < espaciosAntes; i++) {
            lineaCentrada.append(" ");
        }
        lineaCentrada.append(contenido);
        for (int i = 0; i < espaciosDespues; i++) {
            lineaCentrada.append(" ");
        }
        lineaCentrada.append("*");

        System.out.println(lineaCentrada.toString());
    }
}
