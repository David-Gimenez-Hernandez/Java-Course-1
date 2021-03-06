/*
 * SolucionDirectaPruebas.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * n? matricula:210311
 * 
 * Fecha: 1/10/2020
 */ 


// Implementa en java el codigo de las siguientes funciones
// y completa el main incluyendo pruebas para cada una de ellas
class SolucionDirecta {   
  
  static boolean esMultiplo(int n,int m){
//    PRE: m =/= 0 y m,n pertenecen a |Z
//    POST: devuelve true si n es multiplo de m
    return n%m==0;
  }//de esMultiplo
  
  static boolean esPar(int n){
//    PRE: n pertenece a |Z
//    POST: devuelve true si n es par
    return esMultiplo(n,2);
  }//de esPar
  
  static boolean esImparYMultiplo3(int n){
//    PRE: n pertenece a |Z
//    POST: devuelve true si n es impar y multiplo de 3
    return (!esPar(n))&&esMultiplo(n,3);
  }//de esImparYMultiplo3
  
  static double pasarCmsAMetros(double cms){
//    PRE: cierto
//    POST: devuelve el equivalente en metros de cms
    return cms/100;
  }//de pasarCmsAMetros
  
   static double conversion(double u,double d,double c){
//    PRE: cierto
//    POST: el resultado es el equivalente a convertir 
//          u unidades, d decenas y c centenas a unidades
//          (si son negativos se restar?n)
    return u+(10*d)+(100*c);
  }//de conversion
   
   static double pasarASegundos(double h,double m,double s){
//    PRE: cierto
//    POST: el resultado es el equivalente a convertir 
//          s segundos, m minutos y h horas a segundos
//          (si son negativos se restar?n)
     return s+(60*m)+(3600*h);
   }//de pasarASegundos   
   
   static int ultimoDigito(int num){
//    PRE: num pertenece a |Z 
//    POST: el resultado es el ultimo digito de num
     int x = num/10; // se divide entre diez para quitar el ultimo digito
     return Math.abs(num-10*x);
   }//de ultimoDigito

   static int sinUltimoDigito(int num){
//    PRE: num pertenece a |Z 
//    POST: el resultado es num sin el ultimo digito
     int x = num/10; // se divide entre diez para quitar el ultimo digito
     return x;
   }//de sinUltimoDigito


   static boolean implicacion(boolean p, boolean q){
//    PRE: true
//    POST: devuelve el valor de la implicacion logica p->q
     return !(p&& !q);
   }//de implicacion
   
   static double cuadratica(double a, double b, double c, double x){
//    PRE: true
//    POST: el resultado es el equivalente a evaluar la 
//     funcion cuadratica a*x^2+b*x+c
     return (a*(Math.pow(x,2))+(b*x)+c);
   }//de cuadratica 
  
  
  static int numeroCifras(double n){
    //PRE: cierto
    //POS: devuelve numcifras ? |Z
    double x= Math.abs(n); 
    double r= Math.log10(x);
    return (x==0?1:(int)r+1);
  }//de numeroCifras
  
  static int redondeo(double n){
    //PRE: cierto
    //POS: devuelve el numero entero mas cercano a num
    return (int)Math.round(n);
  }//de numeroCifras
  
  static double decimales(double n){
    //PRE: cierto
    //POS: devuelve los decimales de n
    return n -(int)n;
  }//de numeroCifras
  
  
 public static void main(String[] args){
    //pruebas:
    //prueba esMultiplo:
    boolean prueba1= (esMultiplo(4,2)==true);
    boolean prueba2= (esMultiplo(-10,5)==true);
    boolean prueba3= (esMultiplo(3,2)==false);
    boolean programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona esMultiplo?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    //prueba esPar:
    prueba1= (esPar(4)==true);
    prueba2= (esPar(-10)==true);
    prueba3= (esPar(3)==false);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona esPar?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    //prueba esImparYMultiplo3:
    prueba1= (esImparYMultiplo3(-4)==false);
    prueba2= (esImparYMultiplo3(5)==false);
    prueba3= (esImparYMultiplo3(15)==true);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona esImparYMultiplo3?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    //prueba pasarCmsAMetros:
    prueba1= (pasarCmsAMetros(-4)==-0.04);
    prueba2= (pasarCmsAMetros(500.5)==5.005);
    prueba3= (pasarCmsAMetros(0.3)==0.003);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona pasarCmsAMetros?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    //prueba conversion:
    prueba1= (conversion(-4,0,0)==-4);
    prueba2= (conversion(500.5,-30,0)==200.5);
    prueba3= (conversion(0.3,2,1)==120.3);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona conversion?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    //prueba pasarASegundos:
    prueba1= (pasarASegundos(-4,0,0)==-14400);
    prueba2= (pasarASegundos(0.5,-3,90)==1710);
    prueba3= (pasarASegundos(0,1,0)==60);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona pasarASegundos?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    //prueba ultimoDigito:
    prueba1= (ultimoDigito(-403)==3);
    prueba2= (ultimoDigito(0)==0);
    prueba3= (ultimoDigito(447)==7);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona ultimoDigito?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
   
    //prueba sinUltimoDigito:
    prueba1= (sinUltimoDigito(-403)==-40);
    prueba2= (sinUltimoDigito(0)==0);
    prueba3= (sinUltimoDigito(447)==44);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona sinUltimoDigito?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    //prueba implicacion:
    prueba1= (implicacion(true,false)==false);
    prueba2= (implicacion(false,false)==true);
    prueba3= (implicacion(false,true)==true);
    boolean prueba4= (implicacion(true,true)==true);
    programaCorrecto = (prueba1&&prueba2&&prueba3&&prueba4);
    System.out.println("funciona implicacion?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    //prueba cuadratica:
    prueba1= (cuadratica(-403,4,3,3)==-3612);
    prueba2= (cuadratica(0,3,4,0)==4);
    prueba3= (cuadratica(44.5,44,32,3)==564.5);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona cuadratica?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    //prueba numeroCifras:
    
    prueba1= (numeroCifras(2)==1);
    prueba2= (numeroCifras(-10)==2);
    prueba3= (numeroCifras(2782.32323)==4);
    prueba4= (numeroCifras(0)==1);
    boolean prueba5= (numeroCifras(-10.44)==2);
    boolean prueba6= (numeroCifras(2782.320)==4);
    programaCorrecto = (prueba1&&prueba2&&prueba3
                          &&prueba4&&prueba5&&prueba6);
    System.out.println("funciona numeroCifras?" + 
                       (programaCorrecto?" Funciona":" Algo falla"));
    //prueba redondeo:
    prueba1= (redondeo(-0.7)==-1);
    prueba2= (redondeo(-3.33)==-3);
    prueba3= (redondeo(44.9)==45);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona redondeo?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    //prueba decimales:
    prueba1= (decimales(2.7)==2.7-2);
    prueba2= (decimales(3.33)==3.33-3);
    prueba3= (decimales(44.9)==44.9-44);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona decimales?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    int m = StdIn.readInt();
      System.out.println(m);
 }//de main
} // de SolucionDirectaPruebas



