/*
 * EjemplosInOut.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * n� matricula:210311
 * 
 * Fecha: 8/10/2020
 */ 


// Implementa en java el codigo de las siguientes funciones
// y completa el main incluyendo pruebas para cada una de ellas

class Seleccion {   
  
  /**
   * FUNCION min (Entero a, Entero b) --> Entero
   * POST: Calcula el menor entre a y b.
   * POST: (resultado IN {a,b}) /\ 
   *       (resultado <= a) /\ (resultado <= b)
   */ 
  static int min (int a, int b)
  {
    if (a<=b) 
      return a;
    else
      return b;
  } // de min


  /**
   * FUNCION max (Entero a, Entero b) --> Entero
   * PRE: cierta
   * POST: Calcula el mayor entre a y b.
   * POST: (resultado IN {a,b}) /\ 
   *       (resultado >= a) /\ (resultado >= b)
   */ 
    static double max (double a, double b)
  {
    if (a>=b) 
      return a;
    else
      return b;
    } // de max
    
    
    /**
     * FUNCION max3 (Entero a, Entero b, Entero c) --> Entero
     * PRE: cierta
     * POST: Calcula el mayor entre a, b y c.
     */ 
    static double max3 (double a, double b,double c){
      
      return max(max(a,b),c);
    } // de max
    
    /**
     FUNCION posicionMayor (Entero posA, valorA, posB, valorB) 
     --> Entero
   PRE: posA>0, posB>0, posA=/=posB  
   POST: Dados dos valores enteros valorA y valorB y sus 
         posiciones respectivas, posA y posB, devolver 
         la posicion del que sea mayor de los dos valores.
           valorA >= valorB  --> posA
           eoc               --> posB
   EJEMPLOS: posicionMayor(1,4,2,8) --> 2
             posicionMayor(1,4,2,-8) --> 1
   */ 
    static double posicionMayor (double posA, double valorA, double posB, double valorB)
    {
//      if (valorA>=valorB) 
//          return posA;
//        else
//          return posB;
        return (max(valorA,valorB)==valorA)?posA:posB;
    } // de posicionMayor
  
  /**
   FUNCION abs (Entero a) --> Entero
   PRE: cierta
   POST: Calcula el valor absoluto de a.
  */ 
    static double abs (double a)
    {
//        return Math.abs(a);
        return (max(a,0)==0)?(-a):a;
    } // de abs
  
  /**
   FUNCION ternaria (Booleano cond, Entero a, Entero b) --> Entero
   PRE: cierta
   POST: Si cond es true devuelve a, en otro caso devuelve b
   EJEMPLOS: ternaria(true,1,2) --> 1
   ternaria(false,1,2) --> 2
   */ 
    static double ternaria (boolean cond, double a, double b)
    {
      return (cond)?a:b;
    } // de ternaria
    /**
     FUNCION delta (Booleano p) 
     POST: Si p es cierto devuelve 1 y si es falso devuelve 0
     POST: p   --> 1
     eoc --> 0
     */ 
    static double delta (boolean p)
    {
      return p?1:0;
    } // de delta
    
  public static void main(String [] args){
    // Incluye aquí las pruebas que hagas para comprobar 
    // que cada función devuelve los resultados esperados
    //  para un conjunto representativo de casos
    
//    // PRUEBAS: min
    boolean prueba1= (min(4,2)==2);
    boolean prueba2= (min(-10,5)==-10);
    boolean prueba3= (min(3,2)==2);
    boolean programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona min?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
//    // PRUEBAS: max
    prueba1= (max(4,2)==4);
    prueba2= (max(-10,5)==5);
    prueba3= (max(3,2)==3);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona max?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
//    // PRUEBAS: max3
    prueba1= (max3(4,2,1)==4);
    prueba2= (max3(-10,5,2)==5);
    prueba3= (max3(3,2,2)==3);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona max3?" + 
                       (programaCorrecto?" Funciona ":" Algo falla")); 
//    // PRUEBAS: posicionMayor
    prueba1= (posicionMayor(4,2,1,4)==1);
    prueba2= (posicionMayor(10,-5,2,4)==2);
    prueba3= (posicionMayor(3,2,2,5)==2);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona posicionMayor?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));  
//    // PRUEBAS: abs
    prueba1= (abs(4)==4);
    prueba2= (abs(-10)==10);
    prueba3= (abs(-3.33)==3.33);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona abs?" + 
                       (programaCorrecto?" Funciona ":" Algo falla")); 
//    // PRUEBAS ternaria: 
    prueba1= (ternaria(true,4,3)==4);
    prueba2= (ternaria(false,3.33,4.4)==4.4);
    prueba3= (ternaria(true,-3.33,3)==-3.33);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona ternaria?" + 
                       (programaCorrecto?" Funciona ":" Algo falla")); 
//    // PRUEBAS delta: 
    prueba1= (delta(true)==1);
    prueba2= (delta(false)==0);
    prueba3= (delta(true)==1);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona delta?" + 
                       (programaCorrecto?" Funciona ":" Algo falla")); 

  } // de main
} // de Seleccion



