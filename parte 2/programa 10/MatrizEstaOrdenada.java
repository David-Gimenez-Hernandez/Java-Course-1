import java.util.Arrays;

public class MatrizEstaOrdenada {


 //PRE: 
 //POST: Devuelve true si la matriz esta ordenada "de izquierda a derecha y de arriba abajo"
 static boolean matrizEstaOrdenada(int[][] matriz){
   if ((matriz.length==0)||(matriz[0].length==0))return true;
   boolean res = true;
   for (int i=0;i<matriz.length-1&&res;i++){      //primero comparamos la primera fila y columna
     res=(matriz[i][0]<matriz[i+1][0]);
   }//de for
   for(int i=0;i<matriz[0].length-1&&res;i++){
     res=(matriz[0][i]<matriz[0][i+1]);
   }//de for
   for (int i=1;i<matriz.length&&res;i++){       //luego comparamos el resto respecto a su anterior fila y columna
      for(int j=1;j<matriz[0].length&&res;j++){
        res=(matriz[i][j]>matriz[i-1][j])&&(matriz[i][j]>matriz[i][j-1]);
      }//de for
   }//de for
   return res;
 } 
 
 




//////////////////////////////////////////////////////////NO TOCAR - ZONA METODOS PRUEBAS 
 private static String matrizToString(int[][] mat){
  if (mat==null)
   return "null";
  else {
   String result="{";
   String separador="";
   for (int numfil=0; numfil<mat.length ; numfil++){
    result+=separador + Arrays.toString(mat[numfil]);
    separador=", ";
   }
   result+="}";
   return result;
  }
 }
 private static void do_check(int[][] arr, boolean solucion){
  try{
   boolean solAlumno = matrizEstaOrdenada(arr);
   if (solAlumno!=solucion){
    System.out.println("Error: el codigo matrizEstaOrdenada del alumno produce un resultado incorrecto");
    System.out.println("El resultado esperado para la matriz  " + matrizToString(arr) + ",");
    System.out.println("deberia ser " + solucion);
    System.out.println("pero el resultado obtenido es " + solAlumno);
    throw new Error("");
    
   }
  } catch (Exception e){
   System.out.println(e.toString());
   throw new Error("Error en test: el codigo matrizEstaOrdenada del alumno produce una excepcion");
  }
 }
 
 
 public static void main(String[] args) {

  {
    int[][] arr = {};
   boolean solucion = true;
   do_check(arr, solucion);
  }

  {
   int[][] arr= new int[0][0];
   boolean solucion = true;
   do_check(arr, solucion);
  }
  {
    int[][] arr = {{3,1,2}};
   boolean solucion = false;
   do_check(arr, solucion);
  }
  {
   int[][] arr = {{1}};
   boolean solucion = true;
   do_check(arr, solucion);
  }
  {
   int[][] arr = {{1,2,3}};
   boolean solucion = true;
   do_check(arr, solucion);
  }
  {
   int[][] arr = {{1,3,2,4}};
   boolean solucion = false;
   do_check(arr, solucion);
  }
  
  {
   int[][] arr = {{1,2,3},{4,5,6}};
   boolean solucion = true;
   do_check(arr, solucion);
  }
  {
   int[][] arr = {{1,2,3},{2,7,6}};
   boolean solucion = false;
   do_check(arr, solucion);
  }
  
  {
   int[][] arr = {{1,2},{3,4},{5,6},{7,8}};
   boolean solucion = true;
   do_check(arr, solucion);
  }
  {
   int[][] arr = {{1,2},{3,4},{3,9},{7,8}};
   boolean solucion = false;
   do_check(arr, solucion);
  }
  {
   int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
   boolean solucion = true;
   do_check(arr, solucion);
  }
  {
   int[][] arr = {{1,2,3,4,5},{6,7,9,8,10},{11,12,13,14,15},{16,17,18,19,20}};
   boolean solucion = false;
   do_check(arr, solucion);
  }
  System.out.println("Test matrizEstaOrdenada finalizado correctamente.");
 }
}