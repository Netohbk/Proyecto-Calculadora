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
            if(this.operador(cadena.charAt(i))){
                numer=pila.pop(); // no pedimos condiciones, pues se garantiza postfija bien escrita la cual empieza con un número al menos
                switch(cadena.charAt(i)){ // es más fácil usar casos que condicional if por ser varios
                    case'+': resul=pila.pop() + numer; // cada caso es una operación, aquí es una suma 
                            pila.push(resul);
                            break;
                    case'-': resul=pila.pop() - numer; // resta
                            pila.push(resul);
                            break;
                    case'*': resul=pila.pop() * numer; // multiplicación
                            pila.push(resul);
                            break;
                    case'/': if(numer == 0){
                                    throw new RuntimeException("no se puede dividir entre cero");
                                }
                            else{
                                resul=pila.pop() / numer; // división
                                pila.push(resul);
                            }
                            break;
                    case'^': if(numer == 0 && pila.peek()==0){
                        throw new RuntimeException("no se puede hacer la operación ");
                    }
                    else{
                        resul=Math.pow(pila.pop(), numer); // potencia
                            pila.push(resul);
                    }
                            break;
                }
            }
            else if(this.parentesis(cadena.charAt(i))){ // identifica el paréntesis inicial
                StringBuilder sb=new StringBuilder();
                int cont=0;
                while(!this.parentesis(cadena.charAt(i+1))){  // Agrupa lo que está dentro de los paréntesis como un número   
                    sb.append(cadena.charAt(i+1));
                    i++;
                    cont++;
                }
                pila.push(Double.parseDouble(sb.toString())); // agrega el número a la pila
                i++;
            }  
            i++;
        }
        return Math.round(pila.peek()*10000)/10000d;
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
     * @return boolean
     */
    public boolean parentesis(char cadena){
        boolean resp=false;
        if(cadena == '(' | cadena== ')')
            resp = true;
        return resp;
    }
    
}
