import java.util.Arrays;
class Traspuesta{
  
  /////////////// Dada una matriz, devolver otra matriz que sea su traspuesta
  
  static int[][] traspuestaR(int[][] mat){
    if (mat.length==0)return new int[0][0];
    int[][] res = new int[mat[0].length][mat.length];
    return traspuestaRAux(mat, res, 0,0);
  } 
  static int[][] traspuestaRAux(int[][] mat,int[][] res,int i,int j){
    if (j==mat.length) return res;
    if (i==mat[0].length) return traspuestaRAux(mat, res,0,j+1);
    res[i][j]=mat[j][i];
    return traspuestaRAux(mat, res,i+1,j);
  }//de traspuestaRAux
  
  
  
  
  /////////// ZONA METODOS PRUEBAS - NO TOCAR
 private static void do_check(int[][] mat, int[][] solucion){
  try{
   int[][] solAlumno = traspuestaR(mat);
   if (!Arrays.deepEquals(solAlumno,solucion)){
    System.out.println("Error: el codigo de traspuestaR del alumno produce un resultado incorrecto");
    System.out.println("El resultado esperado para la matriz  " + Arrays.deepToString(mat) + ",");
    System.out.println("deberia ser " + Arrays.deepToString(solucion));
    System.out.println("pero el resultado obtenido es " + Arrays.deepToString(solAlumno));
    throw new Error("");
    
   }
  } catch (Exception e){
   System.out.println(e.toString());
   throw new Error("Error en test: el codigo traspuestaR del alumno produce una excepcion");
  }
 }
  
  
  
  
  public static void main(String[] args){
   {
    int[][] arr = {};
    int[][] solucion = {};
    do_check(arr, solucion);
  }

  {
   int[][] arr= new int[0][0];
   int[][] solucion = new int[0][0];
   do_check(arr, solucion);
  }
  {
    int[][] arr = {{3,1,2}};
    int[][] solucion = {{3},{1},{2}};
    do_check(arr, solucion);
  }
  {
   int[][] arr = {{1}};
   int[][] solucion = {{1}};
   do_check(arr, solucion);
  }
  {
    int[][] arr = {{1},{2}};
    int[][] solucion = {{1,2}};
    do_check(arr, solucion);
  }
  {
   int[][] arr = {{1,3,2,4}};
   int[][] solucion = {{1},{3},{2},{4}};
   do_check(arr, solucion);
  }
  {
   int[][] arr = {{1,2,3},{4,5,6}};
   int[][] solucion = {{1,4},{2,5},{3,6}};
   do_check(arr, solucion);
  }
  {
   int[][] arr = {{1,2},{3,4},{3,6},{7,8}};
   int[][] solucion = {{1,3,3,7}, {2,4,6,8}};
   do_check(arr, solucion);
  }
  System.out.println("Test traspuestaR finalizado correctamente.");
   
  } 
}