package com.mycompany.acuariowallaby;

import javax.swing.JOptionPane;

public class Rutina {
    Especie especies[] = new Especie [10];
          //arreglo
public void registrarEspecie() {
     for (int x =0; x<10; x++){
         JOptionPane.showInternalMessageDialog(null, "Se solicitan la información sobre la especie: "+x);
         String nombre= JOptionPane.showInputDialog(null,"Escriba el nombre");
         int cantidadPeces= Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cantidad de peces: ")); 
         String categoria= JOptionPane.showInputDialog(null,"Escriba la categoria de la especie: ");
         int precio= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio del pez: "));
         Especie especie = new Especie(nombre, cantidadPeces, categoria, precio);
         especies[x]= especie;
 }  
}   
 public void consultarEspecie(){
     String nombre= JOptionPane.showInputDialog(null,"Escriba el nombre de la especie: ");
      for (int x =0; x<10; x++){
          Especie especie = especies[x];
          if(nombre.equals(especie.nombre)){
              JOptionPane.showMessageDialog(null,   "Cantidad de peces: " + especie.cantidadPeces);
              JOptionPane.showMessageDialog(null,   "Categoria de peces: " + especie.categoria);
              JOptionPane.showMessageDialog(null,   "El precio del pez es: " + especie.precio);
              
          }
      }
      
      }
     
 public void consultarCategoria(){
       String categoria= JOptionPane.showInputDialog(null,"Escriba la categoria de la especie: ");
      for (int x =0; x<10; x++){
          Especie especie = especies[x];
          if(categoria.equals(especie.categoria)){
              JOptionPane.showMessageDialog(null,   "Nombre de la especie: " + especie.nombre);
              JOptionPane.showMessageDialog(null,   "Cantidad de peces: " + especie.cantidadPeces);
              JOptionPane.showMessageDialog(null,   "El precio del pez es: " + especie.precio);
              
          }
      }
      }
 
 public void especiePrecioAlto(){
     String nombre= "";
     int precioAlto = especies[0].precio;
      for (int x =0; x<10; x++){
          Especie especie = especies[x];
          if(precioAlto<especie.precio){
             nombre = especie.nombre;
              precioAlto = especie.precio;   
          } 
      }
     JOptionPane.showMessageDialog(null,   "La especie con precio más alto es: " + nombre);
     
 }
 public void especiePrecioBajo(){
       String nombre= "";
     int precioBajo = especies[0].precio;
      for (int x =0; x<10; x++){
          Especie especie = especies[x];
          if(precioBajo>especie.precio){
             nombre = especie.nombre;
              precioBajo = especie.precio;   
          } 
      }
     JOptionPane.showMessageDialog(null,   "La especie con valor más bajo es: " + nombre);
     
     
 }       
 
 }

    
    
    
    

     
    
    

