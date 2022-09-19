/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author Ernesto Palma
 * * Definición de la clase PilaA que implementa la interface PilaADT
 */
public class PilaA <T> implements PilaADT<T>{
    private int tope;
    private T[] pila;
    private final int MAX=20;
    
    /**
     * Constructor por omisión
     */
    public PilaA(){
        pila = (T[]) new Object[MAX];
        tope=-1;
    }
    
    /**
     * Constructor de la clase con parámetros
     * @param max 
     */
    public PilaA(int max){
        tope=-1;
        pila = (T[]) new Object[max];
    }
    
    @Override
    public void push(T elem) {
        if(tope == pila.length-1)
            expande();
        tope++;
        pila[tope]=elem;
    }
    
    private void expande(){
        T pilaGrande[] = (T[]) new Object[pila.length*2];
        for(int i=0; i <= tope; i++)
            pilaGrande[i]= pila[i];
        pila=pilaGrande;
    }

    @Override
    public T pop() {
        if(this.isEmpty())
            throw new ExcepcionColeccionVacia("Error: la pila está vacía");
        T resul = pila[tope];
        pila[tope] = null;
        tope--;
        return resul;
    }

    @Override
    public boolean isEmpty() {
        return tope == -1;
    }

    @Override
    public T peek() {
        if(this.isEmpty())
            throw new ExcepcionColeccionVacia("Error: la pila está vacía");
        return pila[tope];
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        PilaADT<T> aux=new PilaA();
        while(!this.isEmpty()){
            aux.push(this.pop());
            sb.append(aux.peek());
        }
        while(!aux.isEmpty()){
            this.push(aux.pop());
        }
        return sb.toString();
    }

    @Override
    public void multiPop(int n) {
        int cont=n;
        try{
            this.pop();
        }catch(Exception e){
            
        }
        while(!this.isEmpty() && cont>0){
            this.pop();
            cont--;
        }
    }
}
