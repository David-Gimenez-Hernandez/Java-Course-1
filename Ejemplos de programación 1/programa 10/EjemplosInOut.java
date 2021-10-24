/*
 * EjemplosInOut.java
 * 
 * Nombre y Apellidos:David Gimenez Hernandez 
 * nº matricula:210311
 * 
 * Fecha: 8/10/2020
 */ 


class EjemplosInOut {   
  
 public static void main(String[] args){
   
   System.out.print("introduce un entero");
   int entero = StdIn.readInt();
   System.out.print("introduce un double");
   double doble = StdIn.readDouble();
   System.out.print("introduce un float");
   float real = StdIn.readFloat();
   System.out.print("introduce un booleano");
   boolean bool = StdIn.readBoolean();
   System.out.print("introduce una palabra");
   String palabra = StdIn.readString();
   System.out.print("introduce un caracter");
   char car = StdIn.readChar();
   car = StdIn.readChar();
   System.out.println("entero = "+entero);
   System.out.println("double = "+doble);
   System.out.println("float = "+real);
   System.out.println("Boolean = "+bool);
   System.out.println("palabra = "+palabra);
   System.out.println("caracter = "+car);
 }}
    