
package com.mycompany.programaentrenador;


public class ProgramaEntrenador {

    public static void main(String[] args) {
        Estadisticas estadisticas = new Estadisticas();
        estadisticas.solicitarDatos();
        estadisticas.calcularMejorRendimiento();
        estadisticas.calcularPeorRendimiento();
        
    }      
}
