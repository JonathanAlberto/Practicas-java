package poo;


public class coche {
    private int rueda; //Con Private se encapsula la propiedad lo que evita que se le puedan hacer modificaciones externas de otra clase al ser invocada
    private int motor;
    private int peso;
    private int largo;
    private int ancho;
    
    public coche(){ //Metodo constructor: inicializa los valores de la clase
        rueda=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso=500;
    }
    
    public Integer dameRueda(){
        return rueda;
    }
    
    public String ObtenerPeso(){ //Metodo Get que nos retorna un valor
     return "El color es: " + peso;   
    }
    
    public void EnviarPeso(int peso){ //Metodo set que 
        this.peso=peso;
    }
}
