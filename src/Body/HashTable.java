/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Body;




public class HashTable {
    static int hashTableSize = 5;
    static Lista hashTable []= new Lista[hashTableSize];
    
    public HashTable () {
        for (int i = 0; i < hashTableSize; i++) {
             hashTable[i] = new Lista() ;
        }
       
    }

    
    
    public void insertar(String key, Nodo pointerArbol){
        int index = hashFunction(key);
        hashTable[index].insertar(key,pointerArbol);
    }
    
    public static int hashFunction(String string) {
        int hashResponse = string.hashCode()%hashTableSize;
        if(hashResponse<0) hashResponse = -hashResponse;
        return hashResponse;
    }
        
    public void mostrarHashTable(){
        for (int i = 0; i < hashTableSize; i++) {
            System.out.println(i);
            NodoHT aux = hashTable[i].head;
            while(aux!= null){
                System.out.println("val: "+aux.val);
                aux = aux.next;
            }
            System.out.println();
        }
    }
    
    public NodoHT accederAlHashTable(String key){
        int index = hashFunction(key);

        NodoHT aux = hashTable[index].head;
        while(aux!= null & aux.key!=key)aux = aux.next;
        
        if(aux!=null)       return aux;
        else                return null;
    }
    
    public String[] buscarPorNombre(String nombre){
        String []nombresEncontrados = new String[0];
        for (int i = 0; i < hashTableSize; i++) {
            NodoHT aux = hashTable[i].head;
            while(aux!= null){
                if(aux.val.contains(nombre)){
                    nombresEncontrados = generar_arreglo_nombres(nombresEncontrados,aux.val);
                }
                aux = aux.next;
            }
        }
        
        return nombresEncontrados;
    }
    
    public String[] generar_arreglo_nombres(String[] nombresEncontrados, String nuevoNombre){
        String []nuevosNombresEncontrados = new String[nombresEncontrados.length+1];
        for (int i = 0; i < nombresEncontrados.length; i++) {
            nuevosNombresEncontrados[i] = nombresEncontrados[i];
        }
        nuevosNombresEncontrados[nombresEncontrados.length]= nuevoNombre;
        return nuevosNombresEncontrados;
    }
    
    
    
}
