/*
 * Enigma.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * n? matricula:210311
 *
 * Fecha: 19/10/2020
 */ 

// Escribe a continuaci?n la Postcondici?n de la funci?n enigma.
// Es decir, explica en castellano lo que devuelve la funci?n 
// enigma para cada argumento que reciba
/* Enigma(entero queso) queso pertenece a los enteros
 * PRE: cierto
 * POS: comprueba si alguna de las cifras del valor introducido 
 *      no es divisible entre 3 y si eso sucede devuelve false.
 *      Si sucede lo contrario, devuelve true
 * 
 */

class Enigma{
  
  static boolean caos (int blanco, int negro)  {
    return (blanco%negro==0);
  } // de caos
  
  static boolean enigma (int queso) {
    boolean patata=true;
    for (int perro=queso; (perro>0) && patata; perro=perro/10){
      if (!caos(perro%10,3))
        patata=false;
    } // de for
    return patata;
  } // de enigma
  
  public static void main(String[] args) {  
    System.out.println("enigma(6)= " + enigma(6));
    System.out.println("enigma(46)= " + enigma(46));
    System.out.println("enigma(936)= " + enigma(936));
    System.out.println("enigma(34367)= " + enigma(34367));
    System.out.println("enigma(39963639)= " + enigma(39963639));
  } // de main
  
} // de Enigma
