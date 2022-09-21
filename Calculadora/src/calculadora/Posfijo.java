/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import pilas.PilaA;
import pilas.PilaADT;

/**
 * Definición de clase Postfijo que convierte expresión en postfija
 * @author m-gla
 */
public class Posfijo {
    
    /**
     * Constructor por omisión 
     */
    public Posfijo(){
    }
    
    /**
     * Método para asignar el peso del los carácteres de los operadores.
     * @param n
     * @return 
     */
    public int pesoOp(Character n){
        int valor = 0;
        if(null != n)switch (n) {
            case '+':
            case '-':
                valor = 1;
                break;
            case '*':
            case '/':
                valor = 2;
                break;
            case '^':
                valor = 3;
                break;
            default:
                break;
        }
        return valor;
    }
    /**
     * Método que regresa cadena de caracteres en formato postfija
     * @param expresion
     * @return String
     */
    public String cadena(String expresion){
        String posfija = "";
        PilaADT <Character> pila = new PilaA();
        
        int i = 0;
        Character c;
        
        while(i < expresion.length()){
            c = expresion.charAt(i);
            if((i == 0 && expresion.charAt(i) == '-') || Character.isDigit(c) || c == '.' || (c == '-' && !Character.isDigit(expresion.charAt(i-1)))){
                posfija += '(';
                posfija += c;
                int j = i + 1;
                while(j < expresion.length() && (Character.isDigit(expresion.charAt(j)) || expresion.charAt(j) == '.')){
                    posfija += expresion.charAt(j);
                    j++;
                }posfija += ')';
                i = j - 1;
            }
            else if(!pila.isEmpty()){
                if(c == '('){
                    pila.push(c);
                }else if(c == ')'){
                    while(pila.peek() != '('){
                        posfija += pila.pop();
                    }
                    pila.pop();
                }else if(pila.peek() == '(' || pesoOp(c) > pesoOp(pila.peek())){
                    pila.push(c);
                }else if(pesoOp(c) <= pesoOp(pila.peek())){
                    posfija+= pila.pop();
                    pila.push(c);
                }
            }else{
                    pila.push(c);
                }i++;  
        }while(!pila.isEmpty()){
            posfija += pila.pop();
        }
        return posfija;       
    }
       
}