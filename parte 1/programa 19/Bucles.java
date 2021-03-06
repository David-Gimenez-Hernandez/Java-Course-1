/*
 * Bucles.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * n? matricula:210311
 *
 * Fecha: 19/10/2020
 */ 


// Implementa en java el c?digo de las siguientes funciones usando bucles
// y completa el main incluyendo pruebas para cada una de ellas

class Bucles{

  
  // FUNCION: productoEntre(Entero a, Entero b) --> Entero
  // PRE: a<=b
  // POS: productoEntre(a,b) devuelve el producto de enteros
  // entre a y b
  static int productoEntre(int x, int y){
    int res = 1;
    while(x<=y){
      res *= x++;
    }// de while
    return res;
  }//de productoEntre
  
  
  // FUNCION: sumaEntre(Entero a, Entero b) --> Entero
  // PRE: x<=y
  // POS: sumaEntre(a,b) devuelve la suma de enteros
  // entre x e y
  static int sumaEntre(int x, int y){
    int res = 0;
    while(x<=y){
      res += x++;
    }
    return res;
  }//de sumaEntre
  
  
  // FUNCION: sumaHasta(Entero n) --> Entero
  // PRE: n>=0
  // POS: devuelve la suma de enteros positivos hasta n (inclusive)
  static int sumaHasta(int x){
    int res = 0;
    for(int i=1;i<=x;i++){
      res += i;
      // res = sumaEntre(1,x);
    }
    return res;
  }//de sumaEntre
  
  
  // FUNCION: sumaCubosEntre(Entero a, Entero b) --> Entero
  // PRE: cierto
  // POS: sumaCuadradosEntre(a,b) devuelve el suma de los 
  // cuadrados de los enteros entre a y b
static int sumaCubosEntre(int x, int y){
    int res = 0;
    while(x<=y){
      res += Math.pow(x++,3);
    }// de while
    return res;
  }//de sumaCubosEntre  
  

  static boolean esPar(int x){  //funci?n auxiliar
    return (x % 2) == 0;
  } // de esPar
  
  // FUNCION: sumaParesEntre(Entero a, Entero b) --> Entero
  // PRE: cierto
  // POS: sumaParesEntre(a,b) devuelve la suma de los 
  // n?meros pares en el intervalo [a,b]
static int sumaParesEntre(int x, int y){
    int res = 0;
    while(x<=y){
//      res+=(esPar(x)?x++:0*x++);//fuerzo el incremento de x en ambos casos
      if (esPar(x)) res+=x;
      x++;
    }// de while
    return res;
  }//de sumaParesEntre  
  

  
  //FUNCION: sumaCifras(Entero n) -> Entero     
  //PRE: n>=0
  //POS: devuelve la suma de las cifras de n
  static int sumaCifras(int x){
    int res = 0;
    while(x>0){
    res+=(x%10);
    x/=10;
    }// de while
    return res;
  }//de sumaCifras  


  
  //FUNCION: numeroCifras(Entero n) -> Entero     
  //PRE: n>=0
  //POS: devuelve el n?mero de cifras de n
  static int numeroCifras(int x){
    int res = 1;
    while(x>9){
      res++;
      x/=10;
    }// de while
    return res;
  }//de numeroCifras  
  
  
  //FUNCION: estaEntre(Entero n, Entero a, Entero b) -> Booleano     
  //PRE: cierto
  //POS: devuelve cierto si n est? en el intervalo [a,b]
  static boolean estaEntre(int n, int a, int b){
//   if (a<=n && n<=b) return true;
//   else return false;
    boolean res=false;
    for(int i=a; i<=b && !res; i++){
      res = (i==n);
    }// de for
    return res;
  }//de estaEntre 
  
  
  //FUNCION: todasCifrasPares(Entero n) -> Booleano     
  //PRE: cierto
  //POS: devuelve cierto si n todas las cifras de n son pares
  static boolean todasCifrasPares(int n){
    boolean res=true;
    for(int i=n; i>0 && res;i/=10){
      //if(!esPar(i%10))res = false; //esto es de paleto ;)
      res = esPar(i%10);
    }// de for
    return res;
  }//de todasCifrasPares   
  
  
  /*
   * FUNCION estaDigito (|Z buscado x |Z numero) ---> |B
   * PRE: buscado>=0 /\ buscado <=9
   * POST: resultado es cierto si buscado es un d?gito de numero
   * ej: estaDigito(340231, 3)= true
   *     estaDigito(327262, 1)=false
   */   
  static boolean estaDigito(int buscado, int numero){
    boolean res=false;
    for(int i=numero; i>0 && !res;i/=10){
      res = (buscado==(i%10));
    }// de for
    return res;
  }//de estaDigito  
  

  /*
   * FUNCION digitosIguales (|Z numero) ---> |B
   * PRE: true
   * POST: resultado es cierto si todos los digitos de numero son iguales
   * ej: digitosIguales(3)= true
   *     digitosIguales(55555)= true
   *     digitosIguales(327262)=false
   */ 
    static boolean digitosIguales(int n){
    boolean res=true;
    for(int i=n; i>0 && res;i/=10){
      res = !((i%10)!=(n%10));
    }// de for
    return res;
  }//de digitosIguales  
  
  
  // Procedimiento auxiliar que imprime si las pruebas funcionan/fallan
  static void imprimePrueba(boolean prueba, String nombrePrueba){
    System.out.println((prueba?"Funciona ":"Falla ") + nombrePrueba);
  } // de imprimerPrueba
  
  public static void main (String [] Args) {
    
    // PRUEBAS de productoEntre
    boolean prueba1 = (productoEntre(3, 6) == 360);
    boolean prueba2 = (productoEntre(7, 10) == 5040);
    boolean prueba3 = (productoEntre(6, 3) == 1);
    boolean todasPruebasBien = prueba1 && prueba2 && prueba3;
    System.out.println("productoEntre "+(todasPruebasBien?
                                     "funciona":
                                     "falla alguna prueba"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
    
    // PRUEBAS de sumaEntre
    prueba1 = (sumaEntre(3, 6) == 18);
    prueba2 = (sumaEntre(7, 10) == 34);
    prueba3 = (sumaEntre(6, 3) == 0);
    todasPruebasBien = prueba1 && prueba2 && prueba3;
    System.out.println("sumaEntre "+(todasPruebasBien?
                                       "funciona":
                                       "falla alguna prueba"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
    
    // PRUEBAS de sumaHasta
    prueba1 = (sumaHasta(0) == 0);
    prueba2 = (sumaHasta(3) == 6);
    prueba3 = (sumaHasta(6) == 21);
    todasPruebasBien = prueba1 && prueba2 && prueba3;
    System.out.println("sumaHasta "+(todasPruebasBien?
                                       "funciona":
                                       "falla alguna prueba"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
    
    prueba1= (sumaCubosEntre(1,2)==9);
    prueba2= (sumaCubosEntre(2,3)==35);
    prueba3= (sumaCubosEntre(0,1)==1);
    todasPruebasBien = (prueba1&&prueba2&&prueba3);
    System.out.println("sumaCubosEntre" + 
                       (todasPruebasBien?" Funciona ":" falla"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
    
    // PRUEBAS de sumaParesEntre
    prueba1 = (sumaParesEntre(3, 6) == 10);
    prueba2 = (sumaParesEntre(7, 10) == 18);
    prueba3 = (sumaParesEntre(6, 3) == 0);
    todasPruebasBien = prueba1 && prueba2 && prueba3;
    System.out.println("sumaParesEntre "+(todasPruebasBien?
                                     "funciona":
                                     "falla alguna prueba"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
    
    // PRUEBAS de sumaCifras
    prueba1 = (sumaCifras(341) == 8);
    prueba2 = (sumaCifras(72) == 9);
    prueba3 = (sumaCifras(7102) == 10);
    todasPruebasBien = prueba1 && prueba2 && prueba3;
    System.out.println("sumaCifras "+(todasPruebasBien?
                                        "funciona":
                                        "falla alguna prueba"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
    
//    // PRUEBAS de numeroCifras
    prueba1 = (numeroCifras(341) == 3);
    prueba2 = (numeroCifras(72) == 2);
    prueba3 = (numeroCifras(7102) == 4);
    todasPruebasBien = prueba1 && prueba2 && prueba3;
    System.out.println("numeroCifras "+(todasPruebasBien?
                                          "funciona":
                                          "falla alguna prueba"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
    
//    // PRUEBAS de estaEntre
    prueba1 = !estaEntre(2, 3, 6);
    prueba2 = estaEntre(7, 7, 10);
    prueba3 = estaEntre(10, 7, 10);
    boolean prueba4 = !estaEntre(10, 10, 7);
    todasPruebasBien = prueba1 && prueba2 && prueba3 && prueba4;
    System.out.println("estaEntre "+(todasPruebasBien?
                                       "funciona":
                                       "falla alguna prueba"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
//    imprimePrueba(prueba4,"prueba4");
    
//    // PRUEBAS de todasCifrasPares
    prueba1 = !todasCifrasPares(234);
    prueba2 = todasCifrasPares(2486);
    prueba3 = !todasCifrasPares(38);
    prueba4 = !todasCifrasPares(243);
    todasPruebasBien = prueba1 && prueba2 && prueba3 && prueba4;
    System.out.println("todasCifrasPares "+(todasPruebasBien?
                                              "funciona":
                                              "falla alguna prueba"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
//    imprimePrueba(prueba4,"prueba4");
    
//    PRUEBAS de estaDigito
    prueba1 = !estaDigito(2, 13837);
    prueba2 = estaDigito(7, 7);
    prueba3 = estaDigito(1, 71);
    prueba4 = estaDigito(1, 217);
    todasPruebasBien = prueba1 && prueba2 && prueba3 && prueba4;
    System.out.println("estaDigito "+(todasPruebasBien?
                                        "funciona":
                                     "falla alguna prueba"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
//    imprimePrueba(prueba4,"prueba4");
    
    
    // PRUEBAS de digitosIguales
    prueba1 = digitosIguales(3);
    prueba2 = digitosIguales(0);
    prueba3 = digitosIguales(55555);
    prueba4 = !digitosIguales(327262);
    todasPruebasBien = prueba1 && prueba2 && prueba3 && prueba4;
    System.out.println("digitosIguales "+(todasPruebasBien?
                                            "funciona":
                                            "falla alguna prueba"));
//    imprimePrueba(prueba1,"prueba1");
//    imprimePrueba(prueba2,"prueba2");
//    imprimePrueba(prueba3,"prueba3");
//    imprimePrueba(prueba4,"prueba4"); 
    
  }//de main
} //de Bucles