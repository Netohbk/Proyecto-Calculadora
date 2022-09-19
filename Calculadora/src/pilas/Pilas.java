/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

/**
 *
 * @author Ernesto Palma
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaADT p1 = new PilaA();
        /*PilaA<Double> p2 = new PilaA();
        //System.out.println("\n elemento quitado:_ "+ pi.pop());
        
        try{
            System.out.println("\n elemento quitado:_ "+ pi.pop());
        }catch(Exception e){
            System.out.println("\nNo se pudo procesar la instrucción" + e);
        }
        
        p1.push("er,");
        p1.push("eewr,");
        p1.push("ersfs,");
        p1.push(33);
        p1.push('e');*/
        p1.multiPop(29);
        System.out.println(p1.toString());
    }
    
}
