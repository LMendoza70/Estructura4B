/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author mendo
 */
public class tdaHora {
    //defino mis atributos
    private int hora;
    private int minuto;
    private int segundo;
    
    //definimos constante a implementar 
    private final int SEGUNDOS_MINUTOS=60;
    private final int SEGUNDOS_HORA=3600;
    private final int SEGUNDOS_DIA=86400;
    
    //constructor vacio
    public tdaHora(){
        hora=0;
        minuto=0;
        segundo=0;
    }
    
    //constructor parametrizado
    public tdaHora(int h, int m,int s){
        if(h>=0 && h<=23){
            hora=h;
        }else{
            hora=0;
        }
        minuto=(m>=0 && m<=59)?m:0;
        segundo=(s>=0 && s<=59) ?s:0;
    }
    //constructor copia
    public tdaHora(tdaHora x){
        hora=x.hora;
        minuto=x.minuto;
        segundo=x.segundo;
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
            return minuto;
    }
     
    public int getSegundo(){
        return segundo;
    }
    
    public void setHora(int h){
        hora=(horaValida(h)==true)?h:0;
    }
    
    public void setMinuto(int m){
        if(minutoValido(m)==true){
            minuto=m;
        }
        minuto=0;
    }
    
    public void setSegundo(int s){
        segundo=(segundoValido(s))?s:0;
    }
    
    public boolean horaValida(int h){
        if(h>=0 && h<=23){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean minutoValido(int m){
        boolean r=false;
        r=(m>=0 &&m<=59)?true:false;
        return r;
    }
    
    public boolean segundoValido(int s){
        if(s>=0 && s<=59)
            return true;
        return false;
    }
    
    @Override
    public String toString(){
        String res="";
        res+=(hora<10)?"0"+hora+":":hora+":";
        res+=(minuto<10)?"0"+minuto+":":minuto+":";
        res+=(segundo<10)?"0"+segundo:segundo+"";
        return res;
    }
    
    public boolean esIgual(tdaHora x){
        if(hora==x.hora && minuto==x.minuto && segundo==x.segundo)
            return true;
        return false;
    }
    
    public void sumarSegundos(int s){
        //agregamos los segundo a la hora 
        segundo=segundo+s;
        
        //ajustamos de segundos a minutos 
        int mExtra =segundo/SEGUNDOS_MINUTOS;//esto me arroja en entero 1
        segundo=segundo%SEGUNDOS_MINUTOS;//115%60 55
        
        if(segundo<0){
            segundo+=60;
            mExtra--;
        }
        minuto=minuto+mExtra;
        
        //ajuste de minutos a horas
        int hExtra=minuto/60;
        minuto=minuto%60;
        
        if(minuto<0){
            minuto+=60;
            hExtra--;
        }
        
        hora+=hExtra;
        
        //ajustamos la hora para que quede entre 0 y 23
        
        hora=hora%24;
        if(hora<0)
            hora+=24;
    }
    
    
    
}
