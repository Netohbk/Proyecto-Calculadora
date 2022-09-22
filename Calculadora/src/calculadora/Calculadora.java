/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Ernesto Palma
 */
public class Calculadora {

    /**
     * * Pruebas de evaluación de expresión postfija 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EvaluacionPostfija ev = new EvaluacionPostfija();
        //HOLA ERNESTO
        //System.out.println(ev.evaluaPost("489-541-/+8*+705-/4*-"));
        //System.out.println(ev.evaluaPost("489-541-/+8*+75/4*-"));
        //System.out.println(ev.evaluaPost("(4.9)89-541-/+8*+75/4*-"));
        //System.out.println(ev.evaluaPost("(8.5)(7.2)(5.3)+(89.5)(8.5)/-*"));
        //System.out.println(ev.evaluaPost("(8.5)(7)(5)+(89.5)(8)/-*"));
        //System.out.println(ev.evaluaPost("(8.8985)(7.2)(5.3)+(89.5)(8.5)/-*"));
        Posfijo pos = new Posfijo();
        EvaluacionSintaxis ever = new EvaluacionSintaxis();
        //System.out.println(pos.cadena("((2.8+5)*3)/2*5/(5^25.5-32/6)"));
        //System.out.println(pos.cadena("((34/34)+4^6-(23-3+23)/23)"));
        String texto1="((56/45)+45+-43)";
        String texto2="((6*34.45^4)+(89/7*5)/85^2)/895452"; // caso límite
        String texto3="((6^4)-(89/7*5)";
        String texto4="((6*3^4)-(89/7*5)/85^2)/895452";
        String texto="9-6-(9*8+9/8^2)";
        if(ever.expresionValida(texto)){
            System.out.println(ever.expresionValida(texto2));
            System.out.println(pos.cadena(texto));
            System.out.println(ev.evaluaPost(pos.cadena(texto)));
        }
        else 
            System.out.println("Imbécil");
        
    }
    
}
