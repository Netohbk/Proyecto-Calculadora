/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import pilas.PilaA;
import pilas.PilaADT;

/**
 *
 * @author Ernesto Palma
 * * Definiciòn de la clase Evaluación de Postfija que usa pilas
 * @param <T>
 */
public class EvaluacionPostfija <T>{
    
    /**
     * Constructor por omisión
     */
    public EvaluacionPostfija(){
        
    }
    
    /**
     * Método que regresa el resultado de une expresión en postfija usando pilas
     * @param cadena
     * @return double
     */
    public double evaluaPost(String cadena){
        PilaADT<Double> pila=new PilaA();
        int i=0;
        double resul, numer;
        while(i<cadena.length()){
            System.out.println("Valor de i en inicio: "+i);
            if(this.operador(cadena.charAt(i))){
                numer=pila.pop();
                switch(cadena.charAt(i)){ // es más fácil usar casos que condicional if
                    case'+': resul=pila.pop() + numer;
                            pila.push(resul);
                            break;
                    case'-': resul=pila.pop() - numer;
                            pila.push(resul);
                            break;
                    case'*': resul=pila.pop() * numer;
                            pila.push(resul);
                            break;
                    case'/': resul=pila.pop() / numer;
                            pila.push(resul);
                            break;
                    case'^': resul=Math.pow(pila.pop(), numer);
                            pila.push(resul);
                            break;
                }
            }
            else if(this.parentesis(cadena.charAt(i))){
                StringBuilder sb=new StringBuilder();
                int cont=0;
                while(!this.parentesis(cadena.charAt(i+1))){
                    sb.append(cadena.charAt(i+1));
                    i++;
                    cont++;
                }
                pila.push(Double.parseDouble(sb.toString()));
                i++;
                System.out.println("valor de i"+i);
            }    
            else
                pila.push(Double.parseDouble(cadena.substring(i, i+1)));  
            i++;
        }
        return pila.peek();
    }
    
    /**
     * Método que indica si un caracter de una cadena de texto es un operador 
     * @param cadena
     * @return boolean
     */
    public boolean operador(char cadena){
        boolean resp=false;
        if(cadena == '+' | cadena == '-' | cadena == '*' | cadena == '/' | cadena == '^')
            resp=true;
        return resp;
    }
    
    /**
     * Método que indica si un caracter de una cadena de texto es un paréntesis
     * @param cadena
     * @return 
     */
    public boolean parentesis(char cadena){
        boolean resp=false;
        if(cadena == '(' | cadena== ')')
            resp = true;
        return resp;
    }
    
}
