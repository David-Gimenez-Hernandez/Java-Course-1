/* David Gim�nez Hern�ndez
 * 210311*/
public class Estado1{
  public static void main(String[] args){
    int x=2;
    int y=3;
    int z=0;
    System.out.println("x = "+ x);
    System.out.println("y = "+ y);
    System.out.println("z = "+ z);
    boolean resultado=false;
    x=(++y*x)-(++z);
    System.out.println("x = "+ x);
    System.out.println("y = "+ y);
    System.out.println("z = "+ z);
    resultado = !((z>0)|| ((y==3) && (x>2)));
    System.out.println("resultado = "+ resultado);
  }//de main
}//de Estado1
//-------------------
//teor�a 2�mitad clase:
//-------------------
//int x = 1;
//    int y = 10;
//    System.out.println("x = "+ x);
//    System.out.println("y = "+ y);
//    //x++;//x=x+1 // ++x // es una asignaci�n (igual con --)
//    y=x++; //se puede poner una asignaci�n dentro de otra pero
//           //se hacen en orden, y=x y luego x++
//    y=++x; // se hace al rev�s: x++ -> y=x
//    y+=x; // y=y+x (se puede usar con todas las operaciones)
//    System.out.println("x = "+ x);
//    System.out.println("y = "+ y);
//-------------------
//c�digo 1�mitad clase:
//-------------------
//public class Estado1{
//  public static void main(String[] args){
//    int x = 1;
//    int y = 2;
//    int z = 3;
//    boolean resultado = false;
//    System.out.println("x = "+ x);
//    System.out.println("y = "+ y);
//    System.out.println("z = "+ z);
//    System.out.println("resultado = "+ resultado);
//    x=x+2;
//    y=x+1;
//    System.out.println("x = "+ x);
//    System.out.println("y = "+ y);
//    resultado = true;