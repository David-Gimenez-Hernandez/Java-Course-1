/*
 * Escalonada.java
 * 
 * Nombre y Apellidos: David Gimenez Hernandez
 * nº matricula:210311
 * 
 * Fecha: 14/10/2020
 */ 

// Implementa en java el codigo de las siguientes funciones
// y completa el main incluyendo pruebas para cada una de ellas

class Escalonada{
 
/* Representacion grafica del valor que
 * devuelve la funcion "escalonada"
 * 
 * 5 |
 * 4 |   [----)
 * 3 |               [-------
 * 2 |---)
 * 1 |         [-----)
 * 0 |
 * ---------------------------
 * 0 | 1 2 3 4 5 6 7 8 9 10
 * 
 * FUNCION: escalonada (Entero x) --> Entero
 * PRE: cierto
 * POS: devuelve el resultado mostrado en el grafico
 */
  static int escalonada(int n){
    if (n>=0){
      switch(n){
        case 0:
        case 1:return 2;
        case 2:
        case 3:
        case 4:return 4;
        case 5:
        case 6:
        case 7:return 1;
        default:return 3;
      }
    }
    else return 2;
  }
  
  public static void main (String[] args){
    boolean prueba1= (escalonada(4)==4);
    boolean prueba2= (escalonada(-10)==2);
    boolean prueba3= (escalonada(5)==1);
    boolean programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona escalonada?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    int x = StdIn.readInt();
    System.out.println(escalonada(x));
 } // de main
} // de Escalonada