/*
 * Arbol.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * nº matricula:210311
 *
 * Fecha: 19/10/2020
 */ 


// Implementa en java el código de los siguientes procedimientos
class Arbol{
  
  //PROCEDIMIENTO: imprime(Entero n) 
  //PRE: x>=3
  //POS: Imprime en pantalla un árbol de asteriscos de n filas
  //     de copa y su correspondiente base que quede proporcionada
  
  static void imprimeEspacio(int n){
    for (int i =1;i<=(n);i++){
      System.out.print(" ");
    }// de for
  }// de imprimeEspacio
  
  
  static void imprimeAsterisco(int n){
    for (int i =1;i<=(n);i++){
      System.out.print("*");
    }// de for
  }// de imprimeEspacio 
  
  
  static void base(int n){
 
    int f = (int)(0.5*(double)n-0.5);        // altura del tronco proporcional a la anchura de la copa
    int e = f+1;                             // nº de espacios antes del tronco proporcional a su altura
    int a = 2*n-2*e-1;  //((n-e)-1)*2 + 1;   // anchura del tronco proporcional al nº de espacios antes de él
    
    for (int i=1; i<=f;i++){
      imprimeEspacio(e);
      imprimeAsterisco(a);
      System.out.println();
    }//de for
  }// de base
  
  
  static void copa(int n){
    for (int i=1;i<=n;i++){
      imprimeEspacio(n-i);    // espacios disminuyen de 1 en 1 desde n
      imprimeAsterisco(2*i-1);// asteriscos aumentan de 2 en 2 pero empiezan en 1
      System.out.println();
    }//de for
  }// de copa
  
  
  static void arbol(int n){
    copa (n);
    base(n);
    
    }//de arbol
  
   

  public static void main (String[] args) {
    System.out.print("Introduce un tamaño > ");  
    int n=StdIn.readInt();
    arbol(n); //imprime un arbol de n filas de copa
  }// de main
} // de Arbol   


