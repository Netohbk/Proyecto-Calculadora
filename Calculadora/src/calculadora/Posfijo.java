/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.HashMap;
import pilas.PilaA;
import pilas.PilaADT;

/**
 *
 * @author m-gla
 */
public class Posfijo {
    
    public String cadena(String expresion){
        String posfija = "";
        PilaADT <Character> pila = new PilaA();
        HashMap <Character, Integer> operadores = new HashMap <>();
        operadores.put('+',1);
        operadores.put('-', 1);
        operadores.put('*',2);
        operadores.put('/', 2);
        operadores.put('^', 3);
        
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
                }else if(pila.peek() == '(' || operadores.get(c) > operadores.get(pila.peek())){
                    pila.push(c);
                }else if(operadores.get(c) <= operadores.get(pila.peek())){
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

