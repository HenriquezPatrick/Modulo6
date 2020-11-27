/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaspoo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author colom
 */
public class EJER2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num1=0,num2=0,suma=0,resta=0,multiplicacion=0,division=0,cont=1,selec=0,selec2=0;
         String leer;
         
        // TODO code application logic here
        Object botones [] = {"Si","No"};
        ImageIcon imagen = new ImageIcon("Imagenes/1.png");
        ImageIcon imagen1 = new ImageIcon("Imagenes/3.jpg");
        ImageIcon imagen2 = new ImageIcon("Imagenes/4.jpg");
        Object botones1 [] = {"suma","resta","multiplicacion","division"};
        JOptionPane.showMessageDialog(null,"OPERACIONES ARITMETICAS");
        while (cont == 1)
        {
             
             
             
             leer=JOptionPane.showInputDialog("Ingrese un numero");
             num1=Integer.parseInt(leer);
             
             leer=JOptionPane.showInputDialog("Ingrese un numero");
             num2=Integer.parseInt(leer);
             selec2 = JOptionPane.showOptionDialog(null,  "Que operacion desea realizar","Pregunta",JOptionPane.YES_NO_CANCEL_OPTION ,JOptionPane.QUESTION_MESSAGE ,imagen1, botones1, botones1[0]);
             
             switch (selec2)
             {
                 case 0:
                 suma= num1+num2;
                  JOptionPane.showMessageDialog(null, "La suma es: " +suma);
                  
                 break;
                 case 1:
                 resta= num1-num2;
                  JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                  
                 break;
                 case 2:
                 multiplicacion= num1*num2;
                  JOptionPane.showMessageDialog(null, "La multiplicacion es: "+multiplicacion);
                  
                 break;
                 case 3:
                 division= num1/num2;
                  JOptionPane.showMessageDialog(null, "La division es: "+division);
                  
                 break;
                 
                
        }
        
     
         
         selec = JOptionPane.showOptionDialog(null,  "¿Desea continuar?","Pregunta",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, imagen2, botones, botones[0]);
         if (selec==0)
         {
             cont= 1;
         }
         else
         {
             cont=2;
         }   
     }

   }
    }
    

