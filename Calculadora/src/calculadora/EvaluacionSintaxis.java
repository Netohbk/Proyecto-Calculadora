package calculadora;

import pilas.PilaA;

/**
 *Clase para evaluar que una sintaxis matematica este bien escrita
 * @author jeronimo
 */
public class EvaluacionSintaxis {
    /**
     * Determina si la expresion tiene caracteres que no sean números, operadores, puntos o paréntesis
     * 
     * @param formula String de la expresión que queremos evaluar
     * @return <ul>
     * <li>true: si la expresión no tiene caracteres no aceptados
     * <li>false: si la expresion contiene caracteres no aceptados
     * </ul>
     */
    public boolean noCaracteresNoAceptados(String formula){
        boolean res= true;
        int i=0;
        Character c;
        
        while(i<formula.length() && res){
            c= formula.charAt(i);
            if(!esNumero(c)&&!esOperador(c)&& c!='(' && c!=')' && c!='.'){
                res=false;
            }
            i++;
        }
        return res;
    }
    /**
     * Determina si una expresión matemática tiene los parámetros balanceados
     * 
     * @param formula String de la expresión que queremos evaluar
     * @return <ul>
     * <li>true: si los paréntesis estan balanceados
     * <li>false: si los paréntesis no estan balanceados
     * </ul>
     */
    public boolean parentesisBalanceados(String formula){
        boolean res=true;
        Character c;
        PilaA<Character> pila= new PilaA();
        int i=0;
        
        while(i<formula.length() && res){
            c= formula.charAt(i);
            if(c=='('){
                pila.push(c);
            }
            else if(c==')'){
                if(pila.isEmpty()){
                    res=false;
                }
                else{
                    pila.pop();
                }
                
            }
            i++;
        }
        return res && pila.isEmpty();
    }
    /**
     * Método que nos permite determinar si un caracter es un número
     * 
     * @param c el caracter que queremos evaluar
     * @return <ul>
     *<li>true: si el character es un número
     *<li>false: si el character no es un número
     *</ul>
     */
     public boolean esNumero(char c){
        boolean res= false;
        
        if (c=='1' || c=='2' || c=='3' || c=='4'|| c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0'){
            res= true;
        }
        return res;
    }
    /**
     * Método que nos permite determinar si un character es un operador ('+','/','-','*','^')
     * 
     * @param c el caracter que queremos evaluar
     * @return <ul>
     *<li>true: si el character es '+','/','-','*','^';
     *<li>false: si el character no es '+','/','-','*','^';
     *</ul>
     */
    public boolean esOperador(char c){
        boolean res= false;
        
        if (c=='*' || c=='/' || c=='+' || c=='-' || c=='^'){
            res= true;
        }
        return res;
    }
    /**
     * Método que nos permite determinar si un character es un operador sin incluir al menos ('+','/','*','^')
     * 
     * @param c el caracter que queremos evaluar
     * @return <ul>
     *<li>true: si el character es '+','/','*','^';
     *<li>false: si el character no es '+','/','*','^';
     *</ul>
     */
    public boolean esOperadorSinMenos(char c){
        boolean res= false;
        
        if (c=='*' || c=='/' || c=='+' ||c=='^'){
            res= true;
        }
        return res;
    }
    /**
     * Método para revisar que no existan dos operados juntos en una expresión
     * 
     * @param formula String que representa la expresión que queremos evaluar 
     * @return <ul>
     * <li>true: si no hay dos operadores juntos en la expresión
     * <li>false: si hay dos operados juntos en la expresión
     * </ul>
     */
    public boolean noDobleOperador(String formula){
        boolean res= true;
        Character c;
        Character c2;
        //nunca debe llegar a formula.length ya que checamos dos valores, uno mayor al contador
        int i=0;
        
        while(i<formula.length()-1 && res){
            c= formula.charAt(i);
            c2= formula.charAt(i+1);
            if(esOperadorSinMenos(c) && esOperadorSinMenos(c2)){
                res= false;
            }
            i++;
        }
        return res;
    }
    /**
     * Método para revisar que no existan dobles decimales
     * 
     * @param formula String que representa la expresión que queremos evaluar 
     * @return <ul>
     * <li>true: si no hay doble decimal
     * <li>false: si hay doble decimal
     * </ul>
     */
    public boolean noDobleDecimal(String formula){
        boolean res= true;
        Character c;
        PilaA<Character> pila= new PilaA();
        int i=0;
        
        while(i<formula.length() && res){
            c= formula.charAt(i);
            if(c=='.'){
                if(pila.isEmpty()){
                    pila.push(c);
                }
                else{
                    res=false;
                    }
            }
            else{
                if(esOperador(c)&& !pila.isEmpty()){
                    pila.pop();
                }
            }
            i++;
        }
        return res;
    }
    /**
     * Método para revisar que no existan paréntesis sin operador
     * 
     * @param formula String que representa la expresión que queremos evaluar 
     * @return <ul>
     * <li>true: si no hay paréntesis sin operador
     * <li>false: si hay paréntesis sin operador
     * </ul>
     */
    public boolean noOperadorAntesDeParentesis(String formula){
        boolean res= true;
        Character c;
        Character c2;
        //empezamos en 1 ya que queremos revisar el del contador y el anterior
        int i=1;
        
        while(i<formula.length() && res){
            c= formula.charAt(i);
            c2= formula.charAt(i-1);
            if(c=='(' && !esOperador(c2) && c2!='('){
                res= false;
            }
            i++;
        }
        return res;
    }
    /**
     * Método para evaluar que la expresión este bien escrita 
     * 
     * @param formula String que representa la expresión que queremos evaluar 
     * @return <ul>
     * <li>true: si esta bien escrita
     * <li>false: si no esta bien escrita
     * </ul>
     */
    public boolean expresionValida(String formula){
        boolean res= false;
        
        if(parentesisBalanceados(formula) && noDobleOperador(formula) && noDobleDecimal(formula) && noOperadorAntesDeParentesis(formula) && noCaracteresNoAceptados(formula)){
            res=true;
        }
        return res;
    }
}

