/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class Matriz {
    int [][] notas= new int [3][4];
    float [] notasmedias=new float[3];
    float [] mediamodulo=new float[4];
                
    
    public void cargarMatriz(){
          for(int f =0 ; f<notas.length;f++){
                        for(int c=0; c<notas[f].length;c++){
                            notas[f][c]=pedirNota();
                        }
          }
    }
        
    
    public int pedirNota(){
    int resultado;
    do{
    resultado= Integer.parseInt(JOptionPane.showInputDialog("notas:  "));
    }while (resultado<1|| resultado>10);
    return resultado;
    }
    
    
    /*public void amosarMatriz(){
    for(int f=0; f<notas.length;f++){
        System.out.print("|");
        for(int c=0;c<notas[f].length;c++){
            System.out.println(notas[f][c]+ "   ");
        }
      System.out.print("|\n");  
    }
    
}*/
    public void visualizar(){
        for(int f = 0;f<notas.length;f++){
            System.out.print("|");
            for(int c=0; c<notas[f].length;c++){
                System.out.print(notas[f][c]+" ");
            }
            System.out.println("|\n");
        }
    }

    public void calcularMediaNota (){
        
        float acumulador;
        for(int f=0;f<notas.length;f++){
            acumulador=0;
            for(int c=0;c<notas.length;c++){
              acumulador= acumulador +notas[f][c];
                 
            } 
           
            notasmedias[f]=acumulador/notas[f].length;
        }
      
    }
    public void amosarLista(){
        for(int i=0; i<notasmedias.length;i++)
            System.out.println(notasmedias[i]);
    }
        
    public void calcularMediaModulo(){
        float acumulador;
        for (int c=0;c<4;c++){
            acumulador=0;
            for(int f=0;f<3;f++){
                acumulador= acumulador +notas[f][c];//as columnas son as que iteran a fila sempre vai ser a mesma
            }           
        
        mediamodulo [c]=acumulador/3;
        }       
    }
    public void amosarModulo(){
        for(int i=0;i<mediamodulo.length;i++)
            System.out.println(mediamodulo[i]);
    }
        
}               
    

