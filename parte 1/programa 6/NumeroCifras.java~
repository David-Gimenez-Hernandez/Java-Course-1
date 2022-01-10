/* David Giménez Hernández
 * 210311*/

public class NumeroCifras{
  static int numeroCifras(double n){
    //PRE: cierto
    //POS: devuelve numcifras € |Z
    double x= Math.abs(n); 
    double r= Math.log10(x);
    return (x==0?1:(int)r+1);
  }//de numeroCifras
  public static void main(String[] args){
    //pruebas:
    
    boolean prueba1= (numeroCifras(2)==1);
    boolean prueba2= (numeroCifras(-10)==2);
    boolean prueba3= (numeroCifras(2782.32323)==4);
    boolean prueba4= (numeroCifras(0)==1);
    boolean prueba5= (numeroCifras(-10.44)==2);
    boolean prueba6= (numeroCifras(2782.320)==4);
    boolean programaCorrecto = (prueba1&&prueba2&&prueba3
                                  &&prueba4&&prueba5&&prueba6);
    System.out.println("funciona todo?" + 
                      (programaCorrecto?" funciona todo":" Algo falla"));
  }//de main
}//de NumeroCifras
//------------------------
//programa Area triangulo:
//------------------------
//class AreaTriangulo{
//  static double areaTriangulo(double base, double altura){
//    //precondición: en este caso ninguna
//    //poscondición: la función me devuelve el área
//    //solución: areatriangulo(b,h)=b*h/2
//    return (Math.abs(base)*Math.abs(altura))/2;
//  }//de areaTriangulo
//  public static void main(String[] args){
//    double base=5.6;
//    double altura=-4;
//    System.out.println(areaTriangulo(base,altura));
//    //pruebas:
//    boolean prueba1= (areaTriangulo(2,5)==5);
//    boolean prueba2= (areaTriangulo(2,-10)==10);
//    boolean prueba3= (areaTriangulo(2,5.2)==5.2);
//    boolean programaCorrecto = (prueba1&&prueba2&&prueba3);
//    System.out.println("funciona todo?" + 
//                       (programaCorrecto?"funciona todo":"Algo falla"));
//  }//de main
//}//de AreaTriangulo
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