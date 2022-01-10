/*
 * EntradaSalida.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * nº matricula:210311
 * 
 * Fecha: 5/10/2020
 */ 

class EntradaSalida {   
  
  static boolean esMultiplo(int n,int m){
//    PRE: m =/= 0 y m,n pertenecen a |Z
//    POST: devuelve true si n es multiplo de m
    return n%m==0;
  }//de esMultiplo 
  
 public static void main(String[] args){
    //prueba esMultiplo con imputs:
   System.out.println("escribe el multiplo:");
   int x = StdIn.readInt();
   System.out.println("escribe el divisor:");
   int y = StdIn.readInt();
   System.out.println( x + " es multiplo de " + y + "?" + 
                     (esMultiplo(x,y)?" Si lo es.":" No lo es.")); 
 }//de main
} // de EntradaSalida



