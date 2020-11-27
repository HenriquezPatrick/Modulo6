/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaspoo;

/**
 *
 * @author colom
 */
public class EJER1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Clase = "HOLA, SOY DE LA CLASE DE PROGRAMACION ORIENTADA A OBJETOS";
        imprimir(Clase);
        javax.swing.JOptionPane.showMessageDialog(null, Clase);
    }
    
     public static String imprimir(String nom)
    {
        String cadena="Informacion del Arreglo\n";
       
            cadena=cadena+nom+" ";
        
        return cadena;
    }
    
    
    
    
    
    
    
    
    
    
}
