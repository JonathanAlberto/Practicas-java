/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private double sueldo;
    private Date altacontrato;
    private static int IdSiguiente=0;
    private int Id;
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
        altacontrato = calendario.getTime();
        IdSiguiente++;
        Id=IdSiguiente;
    }
    /*Sobrecarga de constructores:
    Puedes agregar diferentes constructores pero ninguno de ellos debe recibir el mismo numero de parametros
    en este caso este nuevo constructor solo recibe un solo parametro a diferencia del primero q recibe 5
*/
    public Empleado(String nom){ 
        this(nom, 30000, 2000,01,01); //le enviamos al primer constructor
    }
    
    public String obtenerNombre(){  //getter
        return Id + " " + " " + nombre;
    }
    
    public double obtenerSueldo(){  //getter
        return sueldo;
    }
    
    public Date obtenerFechaContrato(){  //getter
        return altacontrato;
    }
    
    public void SubeSueldo(double porcentaje){
        double aumento =sueldo * porcentaje/100;
        sueldo+=aumento;
    }
}



 

//HERENCIA
class Jefatura extends Empleado{//Heredamos de la clase padre (Empleado) con la palabra reservada Extends
    private double incentivo;
    public Jefatura(String nom, double sue, int agno, int mes, int dia){//Recibimos parametros
    super(nom, sue, agno,mes,dia); //Con super hacemos referencia al constructor del padre, al cual se enviamos los parametros
}
    
    public void establecerIncentivo(double x){//metodo Setter
        incentivo=x;
    }
    
    //sobreescribimos el metodo de la clase padre
    //se olvida del metodo de la clase padre para esta clase y toma por predeterminado este
    public double obtenerSueldo(){
        double sueldo= incentivo+super.obtenerSueldo();//llamamos al metodo obtner sueldo de la clase padre
        return sueldo;
    }
}


