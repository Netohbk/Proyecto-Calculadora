/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pilas;

/**
 *
 * @author Ernesto Palma
 * * Definición de la interface de Pila con 4 declaraciones de métodos para cada implementación
 * @param <T>
 */
public interface PilaADT <T>{
    
    /**
     * Método que agrega elementos
     * @param elem
     */
    public void push(T elem);

    /**
     * Método que elimina elementos
     * @return
     */
    public T pop();
    
    /**
     * Método que indica si está vacía
     * @return
     */
    public boolean isEmpty();
    
    /**
     * Método que regresa elemento del tope 
     * @return
     */
    public  T peek();
    
    /**
     * Método que elimina elementos bajo un parámetro entero
     * @param n 
     */
    public void multiPop(int n);
}
