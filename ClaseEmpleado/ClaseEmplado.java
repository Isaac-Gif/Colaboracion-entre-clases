
package ClaseEmpleado;

import Trabajador.Trabajador;

/**
 @author Isaac Hernandez
 */
public class ClaseEmplado {
     public String Nombre;
     
    public String PagarEmpleado(Trabajador trabajador){
        
        double pago = AplicarDescuentosAntesDePago(trabajador);
        return "Empleado " + trabajador.Nombre +" pagado:" + pago;
        
    }
    
    public Double AplicarDescuentosAntesDePago(Trabajador trabajador){
        float salario = trabajador.Salario;

        return salario - salario * 0.1 - salario*0.075 - salario*0.105;
    }
}
    


