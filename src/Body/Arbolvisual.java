/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Body;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;


/**
 *
 * @author adria
 */


public class Arbolvisual {
    
        /**
     * El grafo que representa el árbol genealógico.
     */
    public Graph graph;
    
    public String[]array = new String[0];
    public String[]aristas = new String[0];
  

    public Arbolvisual(){
        graph = new SingleGraph("Arbol Genealogico");
    }
//Agrega un nodo al grafo
    public void AgregarNodo (String Nodo){
        graph.addNode(Nodo);
        graph.getNode(Nodo).setAttribute("ui.label", Nodo);        
    }
 // Agrega la conexion entre dos nodos en el grafo.
    public void AgregarArista(String Nodo1, String Nodo2){  
        graph.addEdge(Nodo1 + Nodo2, Nodo1, Nodo2, false);    
    }
   

      public boolean Aristaexiste(String Nodo1, String Nodo2) {
          boolean permiso = false;
          
      
        for (int i = 0; i < aristas.length; i++) {
            if (aristas[i].equals(Nodo1 + Nodo2)|| aristas[i].equals(Nodo2+ Nodo1)){
                permiso = true;
            }
        }
        return permiso;
      }
      
        public void insertarAristas(String nodo, String Nodo2) {
        String[] newSons = new String[aristas.length + 1];
        for (int i = 0; i < aristas.length; i++) {
            newSons[i] = aristas[i];
        }
        newSons[aristas.length] = nodo + Nodo2;
        aristas = newSons;
        }
      
      
        public boolean Nodoexiste(String Nodo1) {
          boolean permiso = false;
          
      
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(Nodo1)|| array[i].equals(Nodo1)){
                permiso = true;
            }
        }
        return permiso;
      }
            
        public void insertarNodo(String nodo) {
        String[] newSons = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newSons[i] = array[i];
        }
        newSons[array.length] = nodo;
        array = newSons;
    }
        
        public void display(){
            graph.display();
        }
            
}