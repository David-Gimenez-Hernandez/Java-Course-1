/*
 * Primos.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * nº matricula:210311
 *
 * Fecha: 19/10/2020
 */ 


// Implementa en java el código de las siguientes funciones

class Primos {
  
  //FUNCION: esDivisor(Entero d, Entero m) --> Booleano
  //PRE: d>0
  //POS: devuelve cierto si d es divisor de m
  static boolean esDivisor(int d, int m) {
    return (m%d==0);
  } // de esDivisor
  

  //FUNCION: esPrimo(Entero n) --> Booleano
  //PRE: x>0
  //POS: devuelve cierto si n es primo y falso e.o.c.
  //     Se considera que el 1 no es primo.
  static boolean esPrimo (int n){
    boolean res = !(n==1); // caso n==1
    for (int i =2; (i<=Math.sqrt(n)) && res; i++){ //n es primo si no es divisible por otro 
      res = !(esDivisor(i,n));                             //primo entre 1 y su raiz(proposicion de Fermat).
    }// de for
    return res;
  }// de esPrimo
  
  
  
  //PROCEDIMIENTO: imprimePrueba (Boolean prueba, Cadena nombrePrueba)
  //PRE: cierta
  //POST: escribe "Funciona" si prueba es true y "Falla" si prueba el false
  //      seguido de nombrePrueba
  static void imprimePrueba(boolean prueba, String nombrePrueba){
    System.out.println((prueba?"Funciona ":"Falla ") + nombrePrueba);
  } // de imprimerPrueba
  
  public static void main(String[] args) {
    boolean prueba1 = esPrimo(31);
    boolean prueba2 = esPrimo(23);
    boolean prueba3 = !esPrimo(12);  // no es primo
    boolean prueba4 = esPrimo(3457);
    boolean prueba5 = !esPrimo(3456); // no es primo
    boolean prueba6 = esPrimo(775774537);
    boolean todasPruebasBien = prueba1 && prueba2 && prueba3 && 
      prueba4 && prueba5 && prueba6;
    System.out.println("esPrimo "+(todasPruebasBien?
                                     "funciona":
                                     "falla alguna prueba"));
    imprimePrueba(prueba1,"prueba1");
    imprimePrueba(prueba2,"prueba2");
    imprimePrueba(prueba3,"prueba3");
    imprimePrueba(prueba4,"prueba4");
    imprimePrueba(prueba5,"prueba5");
    imprimePrueba(prueba6,"prueba6");
  }
} // de Primos