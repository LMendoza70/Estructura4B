/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author mendo
 */
public class recursividad {
    
    public int factorial(int n){
        if(n==0){//casi base
            return 1;
        }
        System.out.println("de ida con : "+n);
        int res=n*factorial(n-1);
        System.out.println("de regreso con : " +n +" res "+res);
        return res;
    }
    
}
