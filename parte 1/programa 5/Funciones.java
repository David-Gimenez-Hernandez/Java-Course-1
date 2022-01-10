/* David Giménez Hernández
 * 210311*/
public class Funciones{
//  public static int suma(int x, int y){
//    return x+y;
//  }//de suma
  public static double areaTriangulo(double base, double altura){
    return (base*altura)/2;
  }//de areaTriangulo
  public static void main(String[] args){
//    int x=2;
//    int y=3;
//    System.out.println(suma(6,x+y));
    double base=5.6;
    double altura=4;
    System.out.println(areaTriangulo(base,altura));
  }//de main
}//de Funciones
//------------------------
//programa Estado1:
//------------------------
//    int x=2;
//    int y=3;
//    int z=0;
//    System.out.println("x = "+ x);
//    System.out.println("y = "+ y);
//    System.out.println("z = "+ z);
//    boolean resultado=false;
//    x=(++y*x)-(++z);
//    System.out.println("x = "+ x);
//    System.out.println("y = "+ y);
//    System.out.println("z = "+ z);
//    resultado = !((z>0)|| ((y==3) && (x>2)));
//    System.out.println("resultado = "+ resultado);
//-------------------
//teoría 2ªmitad clase:
//-------------------
//int x = 1;
//    int y = 10;
//    System.out.println("x = "+ x);
//    System.out.println("y = "+ y);
//    //x++;//x=x+1 // ++x // es una asignación (igual con --)
//    y=x++; //se puede poner una asignación dentro de otra pero
//           //se hacen en orden, y=x y luego x++
//    y=++x; // se hace al revés: x++ -> y=x
//    y+=x; // y=y+x (se puede usar con todas las operaciones)
//    System.out.println("x = "+ x);
//    System.out.println("y = "+ y);
//-------------------
//código 1ªmitad clase:
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