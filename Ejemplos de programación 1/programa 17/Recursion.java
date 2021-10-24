/*
 * Recursion.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * nº matricula:210311
 *
 * Fecha: 14/10/2020
 */ 


// Implementa en java el codigo de las siguientes funciones
// y completa el main incluyendo pruebas para cada una de ellas

class Recursion{
  //FUNCION: factorial(Entero x) --> Entero
  //PRE: x>=0
  //POS: factorial(x) devuelve el factorial de x
  static int factorial(int x) {
    if (x<2) return 1;
    else return x * factorial(x-1);
  }//de factorial


  // FUNCION: productoEntre(Entero x, Entero y) --> Entero
  // PRE: x<=y
  // POS: productoEntre(x,y) devuelve el producto de enteros
  // entre x e y
  static int productoEntre(int x, int y){
    if (x==y)return x;
    else return x*productoEntre(x+1,y);
  }//de productoEntre
  
  
  // FUNCION: factorial1(Entero x) --> Entero
  // PRE: x>=0
  // POS: factorial1(x) devuelve el factorial de x
  // Implementarlo como una llamada a productoEntre
  static int factorial1(int x){
    if (x==0) return 1;
    else return productoEntre(1,x);
  }// de factorial1
  
  
  // FUNCION: sumaEntre(Entero x, Entero y) --> Entero
  // PRE: x<=y
  // POS: sumaEntre(x,y) devuelve el suma de enteros
  // entre x e y
    static int sumaEntre(int x, int y){
    if (x==y)return x;
    else return x+sumaEntre(x+1,y);
  }//de sumaEntre

  // FUNCION: sumaEntre1(Entero x, Entero y) --> Entero
  // PRE: cierto
  // POS: sumaEntre1(x,y) devuelve el suma de enteros
  // entre x e y
    static int sumaEntre1(int x, int y){
    if (x<=y)return sumaEntre(x,y);
    else return sumaEntre(y,x);
    }//de sumaEntre1
    
    
  // FUNCION: sumaCuadradosEntre(Entero x, Entero y) --> Entero
  // PRE: cierto
  // POS: sumaCuadradosEntre(x,y) devuelve el suma de los 
  // cuadrados de los enteros entre x e y
    static int sumaCuadradosEntre(int x, int y){
    if (x==y)     return (int)Math.pow(x,2);
    else if (x>y)return (int)Math.pow(x,2)+sumaCuadradosEntre(x-1,y);
    else          return (int)Math.pow(x,2)+sumaCuadradosEntre(x+1,y);
    }//de sumaCuadradosEntre
    
    
  // FUNCION: productoCubosEntre(Entero x, Entero y) --> Entero
  // PRE: cierto
  // POS: productoCubosEntre(x,y) devuelve el producto de los 
  // cubos de los enteros entre x e y
    static int productoCubosEntre(int x, int y){
    if (x==y)     return (int)Math.pow(x,3);
    else if (x>y)return (int)Math.pow(x,3)*productoCubosEntre(x-1,y);
    else          return (int)Math.pow(x,3)*productoCubosEntre(x+1,y);
    }//de sumaCuadradosEntre
    
    
  
  static boolean esPar(int x){  //funcion auxiliar
    return (x % 2) == 0;
  } // de esPar
  

  // FUNCION: sumaCuadradosParesEntre(Entero x, Entero y) --> Entero
  // PRE: cierto
  // POS: sumaCuadradosParesEntre(x,y) devuelve la suma de los 
  // cuadrados de los enteros pares entre x e y
  static int sumaCuadradosParesEntre(int x, int y){
    if (esPar(x)){
      if(x==y)    return (int)Math.pow(x,2);
      else if(x<y)return (int)Math.pow(x,2)+sumaCuadradosParesEntre(x+1,y);
      else        return (int)Math.pow(x,2)+sumaCuadradosParesEntre(x-1,y);
    }// de if
    else{
      if(x==y)    return 0;
      else if(x<y)return sumaCuadradosParesEntre(x+1,y);
      else        return sumaCuadradosParesEntre(x-1,y);
    }// de else
  }//de sumaCuadradosParesEntre
  
 
  // FUNCION: sumaCuadradosParesEntre1(Entero x, Entero y) --> Entero
  // PRE: cierto
  // POS: sumaCuadradosParesEntre1(x,y) devuelve la suma de los 
  // cuadrados de los enteros pares entre x e y
  static int sumaCuadradosParesEntre1(int x, int y){
  return sumaCuadradosParesEntre(x,y);
  }//de sumaCuadradosParesEntre1
  
  
  //FUNCION: numeroCifras(|Z x) -> /Z     
  //PRE: x >=0
  //POS: devuelve el numero de cifras de x
  static int numeroCifras(int x){
    if (x<10) return 1;
    else return 1+numeroCifras(x/10);
  }//de numeroCifras
  
  
  //FUNCION: numeroCifras1(|Z x) -> /Z     
  //PRE: cierto
  //POS: devuelve el numero de cifras de x
  static int numeroCifras1(int x){
    return numeroCifras(Math.abs(x));
  }// de numeroCifras1
  
  //FUNCION: sumaCifras(|Z x) -> /Z     
  //PRE: x >= 0
  //POS: devuelve la suma de las cifras de x
  static int sumaCifras(int x){
    if (x<10) return x;
    else return x%10 + sumaCifras(x/10);
  }// de sumaCifras
    
  
    //FUNCION: sumaCifrasPares(|Z x) -> /Z     
  //PRE: numero >= 0
  //POS: devuelve la suma de las cifras pares de x
  static int sumaCifrasPares(int x){
    if (esPar(x)){
      if(x<10)    return x;
      else        return x%10 + sumaCifrasPares((x/10));
    }// de if
    else{
      if(x<10)    return 0;
      else        return sumaCifrasPares((int)(x/10));
    }// de else
  }//de sumaCifrasPares
  
  
  //FUNCION: sumaCifrasParesPosImpar(Entero numero) --> Entero
  // PRE: numero >= 0
  // POS: devuelve la suma de las cifras pares de numero 
  // que ocupen una posicion impar empezando por que la
  // ultima cifra de numero ocupa la posicion pos
  // ej:          1328794
  // posiciones   7654321
   //sumaCifrasParesPosImpar(1328794)= 4+2=6
  static int sumaCifrasParesPosImpar(int numero){
    return sumaCifrasParesPosImparAux(numero,1);
  }// de sumaCifrasParesPosImpar

   
  //FUNCION: sumaCifrasParesPosImparAux(Entero x,
  //                                 Entero pos) --> Entero
  //PRE: numero >= 0, pos>0
  //POS: devuelve la suma de las cifras pares de numero 
  // que ocupen una posicion impar empezando por que la
  // ultima cifra de numero ocupa la posicion pos
  // ej:          1328794
  // posiciones   7654321
  // sumaCifrasParesPosImparAux(1328794,1)= 4+2=6
  // sumaCifrasParesPosImparAux(132879,2)= 8
  // sumaCifrasParesPosImparAux(13,6)= 0
  static int sumaCifrasParesPosImparAux(int x, int pos){
    int nt = x/((int)Math.pow(10,(pos-1)));//tomamos nt como el numero truncado 
    if (esPar(nt)&&(!esPar(pos))){         //a la posicion que vamos a evaluar
      if(nt<10)  return nt;
      else       return nt%10 + sumaCifrasParesPosImparAux(x,pos+1);
    }// de if
    else{
      if(nt<10)  return 0;
      else       return sumaCifrasParesPosImparAux(x,pos+1);  
    }//de else
  }// de sumaCifrasParesPosImparAux
   
  
  //FUNCION: numeroElementos(Entero x, Entero y) -> Entero     
  //PRE: numero >= 0
  //POS: devuelve el numero de elementos del intervalo [x,y]
    static int numeroElementos(int x, int y){
    if (x==y)     return 1;
    else if (x>=y)return 1 + numeroElementos( x-1,y);
    else          return 1 + numeroElementos(x+1,y);
    }//de numeroElementos
    
    
  // Supongamos que existe una funcion booleana que nos
  // dice si un numero es magico o no.... la implementaciÃ³n
  // nos da igual, podemos implementarla como queramos
  static boolean esMagico(int x){
    return esPar(x) && (x > 5);
  }//de esMagico 

  
  //FUNCION: numeroElementosMagicos(Entero x, Entero y) -> Entero     
  //PRE: cierto
  //POS: devuelve el numero de elementos que cumplen 
  // esMagico de los del intervalo [x,y]
  static int numeroElementosMagicos(int x, int y){
    if (esMagico(x)){
      if (x==y)     return 1;
      else if (x>y)return 1 + numeroElementosMagicos( x-1,y);
      else          return 1 + numeroElementosMagicos(x+1,y);
    }//de if
    else {
      if (x==y)     return 0;
      else if (x>y)return numeroElementosMagicos( x-1,y);
      else          return numeroElementosMagicos(x+1,y); 
    }// de else
  }//de numeroElementosMagicos
  
  
  //FUNCION: todosMagicos(Entero x, Entero y) -> Booleano     
  //PRE: cierto
  //POS: devuelve cierto si todos los numeros del intervalo
  // [x,y] son magicos
  static boolean todosMagicos(int x, int y){
   return numeroElementosMagicos(x,y)==(Math.abs(x-y)+1);
  }//de todosMagicos



  //FUNCION: hayMagico(Entero x, Entero y) -> Booleano     
  //PRE: cierto
  //POS: devuelve cierto si hay al menos un nomero en el
  //intervalo [x,y] que sea magico
  static boolean hayMagico(int x, int y){
   return numeroElementosMagicos(x,y)!=0;
  }//de todosMagicos
  
  
  
  //FUNCION: hayCifra Par (|Z numero) -> B
  //PRE: numero >= 0
  //POS: devuelve cierto si numero tiene alguna cifra par
  static boolean hayCifraPar(int x){
    return sumaCifrasPares(x)!=0; //mal, no considera caso cifra = 0
    }// de hayCifraPar
    
  //FUNCION: sonTodas Cifras Pares (Z numero) -> B
  //PRE: numero >= 0
  //POS: devuelve cierto si todas las cifras de numero son pares
  // ej: sonTodas Cifras Pares (248)-> true
  // ej: sonTodas Cifras Pares (38) -> false
  static boolean sonTodasCifrasPares (int x){
    return sumaCifrasPares(x)==sumaCifras(x);  
    }// de sonTodasCifrasPares
  
  
  public static void main (String [] Args) {
    // Implementa las pruebas que necesites para asegurarte
    // de que las funciones implementadas son correctas
    boolean prueba1= (factorial(3)==6);
    boolean prueba2= (factorial(4)==24);
    boolean prueba3= (factorial(0)==1);
    boolean programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona factorial?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (productoEntre(2,4)==24);
    prueba2= (productoEntre(1,2)==2);
    prueba3= (productoEntre(0,5)==0);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona productoEntre?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (factorial1(3)==6);
    prueba2= (factorial1(4)==24);
    prueba3= (factorial1(0)==1);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona factorial1?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (sumaEntre(2,4)==9);
    prueba2= (sumaEntre(5,8)==26);
    prueba3= (sumaEntre(0,5)==15);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona sumaEntre?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (sumaEntre1(4,2)==9);
    prueba2= (sumaEntre1(5,8)==26);
    prueba3= (sumaEntre1(0,5)==15);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona sumaEntre1?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (sumaCuadradosEntre(2,4)==29);
    prueba2= (sumaCuadradosEntre(4,5)==41);
    prueba3= (sumaCuadradosEntre(5,4)==41);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona sumaCuadradosEntre?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (productoCubosEntre(1,2)==8);
    prueba2= (productoCubosEntre(2,1)==8);
    prueba3= (productoCubosEntre(2,2)==8);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona productoCubosEntre?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (sumaCuadradosParesEntre(1,2)==4);
    prueba2= (sumaCuadradosParesEntre(2,1)==4);
    prueba3= (sumaCuadradosParesEntre(-2,2)==8);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona sumaCuadradosParesEntre?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (numeroCifras(132879)==6);
    prueba2= (numeroCifras(1022)==4);
    prueba3= (numeroCifras(1428733)==7);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona numeroCifras?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (numeroCifras1(132879)==6);
    prueba2= (numeroCifras1(1022)==4);
    prueba3= (numeroCifras1(1428733)==7);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona numeroCifras1?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (sumaCifras(132879)==30);
    prueba2= (sumaCifras(102279)==21);
    prueba3= (sumaCifras(1428733)==28);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona sumaCifras?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (sumaCifrasPares(132879)==10);
    prueba2= (sumaCifrasPares(102279)==4);
    prueba3= (sumaCifrasPares(1428733)==14);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona sumaCifrasPares?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (sumaCifrasParesPosImpar(132879)==8);
    prueba2= (sumaCifrasParesPosImpar(102279)==2);
    prueba3= (sumaCifrasParesPosImpar(1428733)==2);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona sumaCifrasParesPosImpar?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (sumaCifrasParesPosImparAux(132879,2)==8);
    prueba2= (sumaCifrasParesPosImparAux(102279,2)==2);
    prueba3= (sumaCifrasParesPosImparAux(1428733,5)==2);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona sumaCifrasParesPosImparAux?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (numeroElementos(1,2)==2);
    prueba2= (numeroElementos(2,3)==2);
    prueba3= (numeroElementos(1,5)==5);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona numeroElementos?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (numeroElementosMagicos(1,2)==0);
    prueba2= (numeroElementosMagicos(3,2)==0);
    prueba3= (numeroElementosMagicos(1,6)==1);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona numeroElementosMagicos?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (todosMagicos(3,2)==false);
    prueba2= (todosMagicos(6,6)==true);
    prueba3= (todosMagicos(6,7)==false);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona todosMagicos?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
   
    prueba1= (hayMagico(1,2)==false);
    prueba2= (hayMagico(2,3)==false);
    prueba3= (hayMagico(1,6)==true);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona hayMagico?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (hayCifraPar(12)==true);
    prueba2= (hayCifraPar(13)==false);
    prueba3= (hayCifraPar(16)==true);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona hayCifraPar?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
    
    prueba1= (sonTodasCifrasPares(12)==false);
    prueba2= (sonTodasCifrasPares(2399992)==false);
    prueba3= (sonTodasCifrasPares(24446)==true);
    programaCorrecto = (prueba1&&prueba2&&prueba3);
    System.out.println("funciona sonTodasCifrasPares?" + 
                       (programaCorrecto?" Funciona ":" Algo falla"));
    
  }//de main
} //de Recursion
