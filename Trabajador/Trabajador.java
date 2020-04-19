
package Trabajador;

import ClaseEmpleado.ClaseEmplado;
/**
 * @author Isaac Hernandez
 */
   //Trabajador.java
/*
 * Relación de agregación
 */
public class Trabajador {   
    
    public int Identificacion;
    public String Nombre;
    public float Salario;
    public  Empleado Empleado;
    
    public Trabajador(String nombre,float salario, Empleado empleado) {
        
        Nombre = nombre;
        Salario = salario;
        Empleado = empleado;
    }
    
    private double ObservarPaga(){
        return Empleado.AplicarDescuentosAntesDePago(this);
    }

    private static class Empleado {

        public Empleado() {
        }

        private double AplicarDescuentosAntesDePago(Trabajador aThis) {
          


    


