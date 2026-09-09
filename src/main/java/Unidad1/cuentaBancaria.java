/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author mendo
 */
public class cuentaBancaria {
    //atributos del TDA
    private String numCuenta;
    private String Titular;
    private float Saldo;
    
    //Contructores 
    //constructor por default 
    public cuentaBancaria(){
        numCuenta="0000000000000000";
        Titular="Gest 01";
        Saldo=0.0f;
    }
    //constructor parametrizado
    public cuentaBancaria(String titular, String cuenta, float saldo){
        numCuenta=cuenta;
        Titular=titular;
        Saldo=saldo;
    }
    //Constructor copia
    public cuentaBancaria(cuentaBancaria cuenta){
        numCuenta=cuenta.numCuenta;
        Titular=cuenta.Titular;
        Saldo=cuenta.Saldo;
    }
    
    public String getNumcuenta(){
        return numCuenta;
    }
    
    public void setNumCuneta(String ncuenta){
        numCuenta=ncuenta;
    }
    
}
