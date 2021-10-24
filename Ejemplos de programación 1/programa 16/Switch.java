/*
 * Switch.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * nº matricula:210311
 *
 * Fecha: 14/10/2020
 */ 

class Switch{

// Estudia el comportamiento de funcionSwitch1, funcionSwitch2 y
// funcionSwitch3 cuando se le llama con distinto valores
  
  static int funcionSwitch1(int n){     
    switch (n) {
      case 0:
      case 1: 
      case 2: return -1; 
      case 3:
      case 4: 
      case 5: 
      case 6: return 44;
      default: return 1000;
    }
  } // de funcionSwitch1
  // En este caso el switch funciona correctamente debido a
  //la peculiaridad de java de que a partir de que un caso sea
  //verdadero empieza a ejecutar el programa. En esta función, cada vez
  //que cambia el valor que se devuelve, se pone un return, que a la vez
  //que devuelve un valor se comporta como un break para parar
  //su ejecución y que el resultado no sea erróneo.
  
  
  static int funcionSwitch2(int n){  //???
    int res;
    switch (n) {
      case 0:
      case 1: 
      case 2: res=-1; 
      case 3:
      case 4: 
      case 5: 
      case 6: res=44;
      default: res=1000;
    } // de switch
    return res;
  } // de funcionSwitch2
// En este caso el switch funciona incorrectamente debido a
//la peculiaridad de java de que a partir de que un caso sea
//verdadero empieza a ejecutar el programa. En esta función, cada vez
//que cambia el valor que se devuelve, se adjudica otro valor a la variable
//por lo que todos los casos devolverán el último valor que se le
//asigna, haciendo que la ejecución sea errónea. 
  
  
  
  static int funcionSwitch3(int n){  
    int res;
    switch (n) {
      case 0:
      case 1: 
      case 2:res=-1;break;
      case 3:
      case 4: 
      case 5: 
      case 6:res=44;break;
      default: res=1000;
    } // de switch
    return res;
// En este caso el switch funciona correctamente debido a
//la peculiaridad de java de que a partir de que un caso sea
//verdadero empieza a ejecutar el programa. En esta función, cada vez
//que cambia el valor que se devuelve, se pone un break para parar
//su ejecución y que el resultado no sea erróneo.
    
    
  } // de funcionSwitch3
  
  
// Implementa en java el codigo de las siguientes funciones
  
  /**
   * FUNCION precioCine (Entero edad) --> String
   * PRE: cierta
   * POST: Devuelve "Gratis" si edad es menor de 16 o si la edad es
   * mayor o igual a 65 y "8 euros" e.o.c. 
   */ 
  static String precioCine(int edad){
  if (edad<16 || edad>=65) return "Gratis";
  else return "8 euros";
  }
  
  /**
   * FUNCION precioCirco (Entero edad) --> Entero
   * PRE: cierta
   * POST: Devuelve el precio del circo segÃºn la edad del espectador.
   * Es gratis para niÃ±os hasta 2 aÃ±os, cuesta 4 euros para niÃ±os 
   * hasta 6 aÃ±os y 10 euros para mayores de 6 aÃ±os
   * IndicaciÃ³n: hacedlo con un switch
   */ 
  static int precioCirco(int edad){
    switch (edad){
      case 0:
      case 1:
      case 2: return 0;
      case 3: 
      case 4:
      case 5:
      case 6: return 4;
      default:return 10;
    }
  }
  
  /**
   * FUNCION procedimientoAvion(Entero edad)
   * PRE: cierta
   * POST: Escribe en pantalla una cadena de caracteres explicando
   * la forma en la que viaja una persona.
   * Si tiene hasta 2 aÃ±os viaja en cuna, entre 3 y 5 aÃ±os viaja 
   * encima de un adulto y a partir de 6 aÃ±os ocupa asiento.
   * Indicacion: hacedlo con un switch
   */ 
  static String procedimientoAvion(int edad){
    switch (edad){
      case 0:
      case 1:
      case 2: return "viaja en cuna";
      case 3: 
      case 4:
      case 5: return "viaja encima de un adulto";
      default:return "ocupa asiento";
    }
  }
  
  
  public static void main (String[] args){
    System.out.print("Introduce la edad del espectador>");
    int edad = StdIn.readInt();
    
    System.out.println(funcionSwitch1(edad));
    System.out.println(funcionSwitch2(edad));
    System.out.println(funcionSwitch3(edad));
    

   System.out.println("El precio del cine es: "+
                       precioCine(edad));
   System.out.println("El precio del circo es: "+ 
                       precioCirco(edad) + " euros");
    System.out.print("¿Como viaja en avion? " + procedimientoAvion(edad)); 
  } // de main
} // de SwitchSolucion
