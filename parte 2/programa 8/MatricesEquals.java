import java.util.Arrays;

public class MatricesEquals {


 public static boolean matricesEquals(int[][] arr1, int[][] arr2){
   boolean res = ((arr1.length==arr2.length)&&((arr1.length==0)||(arr1[0].length==arr2[0].length)));
    for (int i=0;i<arr2.length&&res;i++){
      for(int j=0;j<arr1[0].length&&res;j++){
        res=(arr1[i][j]==arr2[i][j]);
      }//de for
    }//de for
    return res;
  }//de matricesEquals
 
 
 public static boolean matricesEqualsRec(int[][] arr1, int[][] arr2){
   boolean res = ((arr1.length==arr2.length)&&((arr1.length==0)||(arr1[0].length==arr2[0].length)));
   return res?matricesEqualsRecAux(arr1,arr2,0,0,res):res;
  }//de matricesEquals
 public static boolean matricesEqualsRecAux(int[][] arr1, int[][] arr2,int i, int j, boolean res){
   if(i<arr1.length&&j<arr1[0].length&&res){
        res=(arr1[i][j]==arr2[i][j]);
        if (j==arr1[0].length-1){
          i++;
          j=-1;
        }//de if
        return matricesEqualsRecAux(arr1,arr2,i,++j,res);
      }//de if
   else return res;
  }//de matricesEquals





//////////////////////ZONA CODIGO PARA PRUEBAS  -   NO TOCAR NADA A PARTIR DE AQUI 
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
 private static void do_check(int[][] arr1, int[][] arr2, boolean solucion){
  try{
   boolean solAlumno = matricesEqualsRec(arr1,arr2);
   if (solAlumno!=solucion){
    System.out.println("Error: el codigo equals del alumno produce un resultado incorrecto");
    System.out.println("El resultado esperado para las matrices \n" + matrizToString(arr1) + "\n" + matrizToString(arr2));
    System.out.println("deberia ser " + solucion);
    System.out.println("pero el resultado obtenido es " + solAlumno);
    throw new Error("");
    
   }
  } catch (Exception e){
   System.out.println(e.toString());
   throw new Error("Error en test: el codigo equals del alumno produce una excepcion");
  }
 }
 
 
 public static void main(String[] args) {
  {
   int[][] arr1 = {};
   int[][] arr2={};
   boolean solucion = true;
   do_check(arr1, arr2, solucion);
  }
  {
   int[][] arr1 = {};
   int[][] arr2={{}};
   boolean solucion = false;
   do_check(arr1, arr2, solucion);
  }
  {
   int[][] arr1 = {};
   int[][] arr2={{3}};
   boolean solucion = false;
   do_check(arr1, arr2, solucion);
  }
  {
   int[][] arr1 = {{1},{2},{1}};
   int[][] arr2={};
   boolean solucion = false;
   do_check(arr1, arr2, solucion);
  }
  {
   int[][] arr1 = {{1,2,3,4,5}};
   int[][] arr2={{1,2,3,4,5}};
   boolean solucion = true;
   do_check(arr1, arr2, solucion);
  }
  {
   int[][] arr1 = {{1,2,3,4,5}};
   int[][] arr2={{1,2,3,4,5,6}};
   boolean solucion = false;
   do_check(arr1, arr2, solucion);
  }
  {
   int[][] arr1 = {{1,2},{3,4},{5,6}};
   int[][] arr2={{1,2},{3,4},{5,6}};
   boolean solucion = true;
   do_check(arr1, arr2, solucion);
  }
  {
   int[][] arr1 = {{1,2,1,2},{3,4,3,4},{5,6,5,6}};
   int[][] arr2={{1,2,1,2},{3,4,3,4},{5,6,5,6}};
   boolean solucion = true;
   do_check(arr1, arr2, solucion);
  }
  
  {
   int[][] arr1 = {{1,2},{3,4},{5,2}};
   int[][] arr2={{1,2},{3,4},{5,6}};
   boolean solucion = false;
   do_check(arr1, arr2, solucion);
  }
  {
   int[][] arr1 = {{1,2,3},{3,4,5},{5,6,7}};
   int[][] arr2={{4,2,3},{3,4,5},{5,6,7}};
   boolean solucion = false;
   do_check(arr1, arr2, solucion);
  }
  {
   int[][] arr1 = {{1},{2},{3},{4},{5}};
   int[][] arr2={{1},{2},{3},{4},{5}};
   boolean solucion = true;
   do_check(arr1, arr2, solucion);
  }
  {
   int[][] arr1 = {{1},{2},{3},{4},{5}};
   int[][] arr2={{1,1},{2,2},{3,3},{4,4},{5,5}};
   boolean solucion = false;
   do_check(arr1, arr2, solucion);
  }
  System.out.println("Test matricesEquals finalizado correctamente.");
 }

}