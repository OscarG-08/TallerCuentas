/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clearminds.test;

import com.clearminds.cuentas.Cuenta;

/**
 *
 * @author Oscar
 */
public class TestCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(647);
        Cuenta cuenta2 = new Cuenta("03476", "C", 98);
        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");
        System.out.println("VALORES INICIALES");
        cuenta1.imprimirConMiEstilo();
        cuenta2.imprimirConMiEstilo();
        cuenta3.imprimirConMiEstilo();
        System.out.println("VALORES MODIFICADOS");
        cuenta1.setSaldo(444);
        cuenta2.setTipo("D");
        cuenta3.setSaldo(567);
        cuenta1.imprimirConMiEstilo();
        cuenta2.imprimirConMiEstilo();
        cuenta3.imprimirConMiEstilo();
        Cuenta cuenta4 = new Cuenta("0987");
        cuenta4.setSaldo(10);
        Cuenta cuenta5 = new Cuenta("0557", "C", 10);
        Cuenta cuenta6 = new Cuenta("0666");
        cuenta4.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();
        cuenta6.imprimirConMiEstilo();
    }
}
