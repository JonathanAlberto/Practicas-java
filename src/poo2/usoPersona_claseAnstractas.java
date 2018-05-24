/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Jonatha
 */
public class usoPersona_claseAnstractas {

    public static void main (String [] arg){
        Persona[] perso = new Persona[3];
        perso[0]=new alumno("Jonathan","Sistemas");  
        perso[1]=new Empleado2("Jose",2000,2018,02,20);  
        perso[2]=new Empleado2("Miguel",3000,2010,8,10);  
        Empleado2 jefe_RH = (Empleado2) perso[2];
        jefe_RH.SubeSueldo(20);
           for(Persona e: perso){
               System.out.println(e.obtenNombre()+" "+ e.obtenDescripcion());
           }
    }   
}


abstract class Persona{  //Siempre que alla un metodo abstracto la clase tambien debe ser abstracta
    private String nombre;
   public Persona(String nom){
    nombre=nom;
   } 
   
   public String obtenNombre(){
       return nombre;
   }
   
   public abstract String obtenDescripcion(); //Expresamos el metodo sin desarrollarlo
}

class Empleado2 extends Persona{ //Aplicamos la herencia

    private double sueldo;
    private Date altacontrato;
    private static int IdSiguiente=0;
    private int Id;
    public Empleado2(String nom, double sue, int agno, int mes, int dia){
        super(nom); //Enviamos el nombre a la clase padre
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
        altacontrato = calendario.getTime();
        IdSiguiente++;
        Id=IdSiguiente;
    }

    public String obtenDescripcion(){  //Reescribimos el metodo abstracto de la clase padre
        return "El empleado "+ Id + " tiene un sueldo de "+ sueldo;
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

class alumno extends Persona{
    private String carrera;
    
    public alumno(String nom, String carr){
    super(nom);
    carrera=carr;
    }
    
    public String obtenDescripcion(){  //Reescribimos el metodo abstracto de la clase padre
        return "El Alumno esta estudiando la carrera de "+carrera;
    }
}