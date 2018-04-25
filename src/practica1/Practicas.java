
package practica1;
//Practica de Arreglos bidimencionales

public class Practicas {

    public static void main(String[] args) {
       double [][] matrix = new double[6][5];
       double interes=0.1;
       double acumulado;
       for(int i = 0; i<6;i++){
           matrix[i][0]=10000;
           acumulado=10000;
           System.out.print(matrix[i][0]+" ");
           for(int x=1; x<5;x++){
              acumulado=acumulado+(acumulado*interes);
              matrix[i][x]=acumulado;
               System.out.print(matrix[i][x]+" ");
           }
           System.out.println();
           interes=interes+0.01;
       }
       
       System.out.println();
       
       for(int i = 0; i<5;i++){
           System.out.print(matrix[0][i]+" ");
           for(int x=1; x<6;x++){

               System.out.print(matrix[x][i]+" ");
           }
           System.out.println();
           interes=interes+0.01;
       }
    }
    }
    
    
    

