
package com.mycompany.programaentrenador;

import javax.swing.JOptionPane;


public class Estadisticas {
    int matriz[][] = new int[11][3];
    String jugadorMejor;
    String jugadorMenor;
    int pasesCorrectos;
    int pasesNormales;
    int pasesEquivocados;
    int suma = 0;
    int estadisticas[]= new int[11];
    public void solicitarDatos(){ //metodo. 
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la estadística: "));
            }
        }  
    }
    
     public void calcularMejorRendimiento(){ //metodo.
       for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 3; j++) {
                int valor =  matriz[i][j];
                suma = suma + valor;   
            }
            estadisticas [i]= suma;    
       }
       int jugador= 0;
     int rendimientoAlto = estadisticas[0];
      for (int x =0; x<11; x++){
         int dato = estadisticas[x];
          if(rendimientoAlto<dato){
              jugador = x;
               
          } 
      }
     JOptionPane.showMessageDialog(null,   "El jugador con rendimiento alto es: " + jugador);
     
  }   
    public void calcularPeorRendimiento(){ 
       for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 3; j++) {
                int valor =  matriz[i][j];
                suma = suma + valor;   
            }
            estadisticas [i]= suma;    
       }
       int jugador= 0;
     int rendimientoBajo = estadisticas[0];
      for (int x =0; x<11; x++){
         int dato = estadisticas[x];
          if(rendimientoBajo>dato){
              jugador = x;
               
          } 
      }
     JOptionPane.showMessageDialog(null,   "El jugador con rendimiento bajo es: " + jugador);  
        
    }  
    }

        
                