
package poo;

public class usocoche {
    public static void main (String arg[]){
        coche Nissan= new coche();
        System.out.println("El Coche Cuenta Con: "+Nissan.dameRueda());
                //Se establece la comunicacion con la clase coche
        Nissan.ObtenerPeso();//Se Obtiene el valor con el metodo get
        Nissan.EnviarPeso(1000);//Se envia un nuevo valor 
        Nissan.ObtenerPeso(); //Se obtiene el nuevo valor del peso
        
    }
}
