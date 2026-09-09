/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthh.estructura4b;

import Unidad1.cuentaBancaria;

/**
 *
 * @author mendo
 */
public class Estructura4B {

    public static void main(String[] args) {
        cuentaBancaria cuenta=new cuentaBancaria("Luis Alberto Mendoza", "54708565325241", 15000.50f);
        cuenta.setNumCuneta("hola esto es un ejemplo");
        
        System.out.println("Banco mendoza");
        System.out.println("Cuenta bancaria de luis");
        
        
        
    }
}
