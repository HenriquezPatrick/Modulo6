/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaspoo;

import javax.swing.JOptionPane;

/**
 *
 * @author colom
 */
public class EJER4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        String ciudades[] = new String[20];
        String coudad="" ;
        ciudades[0] = " LA CEIBA";
        ciudades[1] = " SAN PEDRO SULA";
        ciudades[2] = " COMAYAGUA";
        ciudades[3] = "FRANCICSCO MORAZAN";
        ciudades[4] = "HUOATON TEXAS";
        ciudades[5] = "LOS ANGELES";
        ciudades[6] = "CALIFORNIA";
        ciudades[7] = "NUEVA YOR";
        ciudades[8] = "PARIS";
        ciudades[9] = "LONDRES";
        ciudades[10] = "BACELONA";
        ciudades[11] = "SEVILA";
        ciudades[12] = "MADRID";
        ciudades[13] = "NUEVA YORK";
        ciudades[14] = "CHICAGO";
        ciudades[15] = "SAN SALVADOR";
        ciudades[16] = "SANTA ROSA DE COPAN";
        ciudades[17] = " NUEVA JERSEY";
        ciudades[18] = "ATLANTA";
        ciudades[19] = "CULIACAN ";
       
        
        String cadena="Informacion del Arreglo\n";
        for(int i=0;i<ciudades.length;i++)
        {
            cadena=cadena+"["+i+"] "+"["+ciudades[i]+"]\n";
        }
         System.out.println(""+cadena);
        /*
        
        for(int i=0;i<ciudades.length;i++)
        {
           nombreCiudades= JOptionPane.showInputDialog("INGRESE EL NOMBRE DE LA CIUDAD Nº " + i);
           
        }
        
        llenarConNum (ciudades,nombreCiudades);
        
       nombreCiudades= imprimir(ciudades);
         
    }
    
    public static void llenarConNum(String arr[], String n)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=n;
        }
    }
   
   
   
    */
    }
       public static String imprimir(String a[])
    {
        String cadena="Informacion del Arreglo\n";
        for(int i=0;i<a.length;i++)
        {
            cadena=cadena+a[i]+" ";
        }
        return cadena;
       
    }
 public void mensaje(String img)
    {
    javax.swing.JOptionPane.showInputDialog(img, this);
    }
    
}
