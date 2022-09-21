package calculadora;

import pilas.PilaA;

/**
 *Clase para evaluar que una sintaxis matematica este bien escrita
 * @author jeronimo
 */
public class EvaluacionSintaxis {
    /**
     * Determina si una expresion matematica tiene los parametros balanceados
     * 
     * @param formula String de la expresion que queremos evaluar
     * @return <ul>
     * <li>true: si los parentesis estan balanceados
     * <li>false: si los parentesis no estan balanceados
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
            else{
                if(c==')'){
                    if(pila.isEmpty()){
                        res=false;
                    }
                    else{
                        pila.pop();
                    }
                }
            }
            i++;
        }
        return res;
    }
    /**
     * Metodo que nos permite determinar si un character es un operador ('+','/','-','*')
     * 
     * @param c el caracter que queremos evaluar
     * @return <ul>
     *<li>true: si el character es '+','/','-','*';
     *<li>false: si el character no es '+','/','-','*';
     *</ul>
     */
    public boolean esOperador(char c){
        boolean res= false;
        
        if (c=='*' || c=='/' || c=='+' || c=='-'){
            res= true;
        }
        return res;
    }
    /**
     * Metodo para revisar que no existan dos operados juntos en una expresion
     * 
     * @param formula String que representa la expresion que queremos evaluar 
     * @return <ul>
     * <li>true: si no hay dos operadores juntos en la expresion
     * <li>flase: si hay dos operados juntos en la expresion
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
            if(esOperador(c) && esOperador(c2)){
                res= false;
            }
            i++;
        }
        return res;
    }
    /**
     * Metodo para revisar que no existan dobles decimales
     * 
     * @param formula String que representa la expresion que queremos evaluar 
     * @return <ul>
     * <li>true: si no hay doble decimal
     * <li>flase: si hay doble decimal
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
     * Metodo para revisar que no existan parentesis sin operador
     * 
     * @param formula String que representa la expresion que queremos evaluar 
     * @return <ul>
     * <li>true: si no hay parentesis sin operador
     * <li>flase: si hay parentesis sin operador
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
            if(c=='(' && !esOperador(c2)){
                res= false;
            }
            i++;
        }
        return res;
    }
    /**
     * Metodo para evaluar que la expresion este bien escrita 
     * 
     * @param formula String que representa la expresion que queremos evaluar 
     * @return <ul>
     * <li>true: si esta bien escrita
     * <li>flase: si no esta bien escrita
     * </ul>
     */
    public boolean expresionValida(String formula){
        boolean res= false;
        
        if(parentesisBalanceados(formula)&&noDobleOperador(formula)&&noDobleDecimal(formula)&&noOperadorAntesDeParentesis(formula)){
            res=true;
        }
        return res;
    }
}

