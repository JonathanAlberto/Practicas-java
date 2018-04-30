/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author Aspire 5
 */
public class usoEmpleado {


    public static void main(String[] args) {
     Empleado[] empleado=new Empleado[4];
     empleado[0]=new Empleado("Jose", 1500,2012,01,02);
     empleado[1]=new Empleado("Maria", 1500,2012,06,15);
     empleado[2]=new Empleado("Ivan", 1500,2013,05,07);
     empleado[3]=new Empleado("Juan");//Se llama al segundo constructor que solo recibe un parametro
     
     for(Empleado e: empleado){
         e.SubeSueldo(5);
     }
     
     for(Empleado x: empleado){
         System.out.println(x.obtenerNombre()+" "+ x.obtenerSueldo()+" "+x.obtenerFechaContrato());
     }
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


