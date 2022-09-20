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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EvaluacionPostfija ev = new EvaluacionPostfija();
        //HOLA ERNESTO
        //System.out.println(ev.evaluaPost("489-541-/+8*+705-/4*-"));
        //System.out.println(ev.evaluaPost("489-541-/+8*+75/4*-"));
        //System.out.println(ev.evaluaPost("(4.9)89-541-/+8*+75/4*-"));
        //System.out.println(ev.evaluaPost("(8.5)(7.2)(5.3)+(89.5)(8.5)/-*"));
        System.out.println(ev.evaluaPost("(8.5)(7)(5)+(89.5)(8)/-*"));
        //System.out.println(ev.evaluaPost("(8.8985)(7.2)(5.3)+(89.5)(8.5)/-*"));
        
    }
    
}
