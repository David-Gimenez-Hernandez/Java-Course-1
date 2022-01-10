/*
 * AreaCorona.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * nº matricula:210311
 * 
 * Fecha: 8/10/2020
 */ 

class AreaCorona {
  static final double PI=3.141653; 
  static double areaCirculo(double r1){
//    PRE: r1 >0 
//    POST: devuelve el area del circulo de r = "r1" 
    return (Math.pow(r1,2)*PI);
  }
  static double areaCorona1(double r1,double r2){
//    PRE: r1 > r2 >0 
//    POST: devuelve el area de la corona entre un circulo de r = "r1" y uno de r = "r2"
    return areaCirculo(r1)-areaCirculo(r2);
  }//de areaCorona1 
  static double areaCorona2(double r1,double r2){
//    PRE: r1>0 /\ r2 >0 
//    POST: devuelve el area de la corona entre un circulo de r = "r1" y uno de r = "r2"
    if (r1<r2){
     return areaCorona1(r2,r1);}
    else {
      return areaCorona1(r1,r2);}
  }//de areaCorona2 
  
  public static void main(String[] args){
    //prueba areaCorona con imputs:
   System.out.println("escribe el primer radio:");
   double r1 = StdIn.readDouble();
   System.out.println("escribe el segundo radio:");
   double r2 = StdIn.readDouble();
   System.out.println(  " El resultado de areaCorona1 es:" + 
                     areaCorona1(r1,r2)); 
      System.out.println(  " El resultado de areaCorona2 es:" + 
                     areaCorona2(r1,r2)); 
 }//de main
} // de AreaCorona



