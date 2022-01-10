import java.util.Arrays;
class EsPermutacion {

  //PRE: arr almacena enteros en el intervalo [inf,sup] 
  //POST: devuelve un array en el que para cada elemento del intervalo aparece 
  //      su numero de repeticiones en el array argumento
  static int[] numRepeticionesElementosRango(int[] arr, int inf, int sup){
    int[]res = new int[sup+1-inf];
    if (arr.length==0) return res;
//    int j=0;
//    for(int i=inf; i<=sup;i++){
//      int cont=0;
//      for (int k=0; k<arr.length;k++){
//        cont+=(arr[k]==i)?1:0;
//      }//de for
//      res[j++]=cont;
//    }//de for
    for(int i=0; i<arr.length;i++){
      res[arr[i]-inf]++;
    }//de for
    return res;
  }//de numRepeticionesElementosRango
  
  //PRE: los arrays almacenan digitos de 0 a 9
  //POST: devuelve true si array2 es una permutacion de arr1 y false en caso contrario
  static boolean esPermutacion(int[] arr1, int[] arr2){
    if (arr1.length!=arr2.length)return false;
    if (arr1.length==0)return true;
    int inf =arr1[0];
    int sup =arr1[0];
    for(int i=1;i<arr1.length;i++){
      inf=(arr1[i]<inf)?arr1[i]:inf;
      sup=(arr1[i]>sup)?arr1[i]:sup;
    }//de for 
    int[] res1=numRepeticionesElementosRango(arr1, inf, sup);
    int[] res2=numRepeticionesElementosRango(arr2, inf, sup);
    boolean res=true;
    for(int i=0;i<res1.length&&res;i++){
      res=(res1[i]==res2[i]);
    }//de for 
    return res;
  }
  
  
  ///////////////////////ZONA METODOS PRIVADOS PARA PRUEBAS -----------  NO TOCAR

  private static void do_check(int[] arr, int inf, int sup, int[] solucion){
    try{
      int[] solAlumno = numRepeticionesElementosRango(arr,inf,sup);
      if (! Arrays.equals(solAlumno,solucion)){
        System.out.println("Error: el codigo numRepeticionesElementosRango del alumno produce un resultado incorrecto");
        System.out.println("El resultado esperado para los argumentos  " + Arrays.toString(arr) + ",  " + inf + ",  " + sup);
        System.out.println("deberia ser " + Arrays.toString(solucion));
        System.out.println("pero el resultado obtenido es " + Arrays.toString(solAlumno));
        throw new Error();
        
      }
    } catch (Exception e){
      System.out.println(e.toString());
      throw new Error("Error en test: el codigo numRepeticionesElementosRango del alumno produce una excepcion");
    }
  }

  
  private static void do_check1(int[] arr1, int[] arr2, boolean solucion){
    try{
      boolean solAlumno = esPermutacion(arr1,arr2);
      if (solAlumno!=solucion){
        System.out.println("Error: el codigo esPermutacion del alumno produce un resultado incorrecto");
        System.out.println("El resultado esperado para los arrays  " + Arrays.toString(arr1) + "," + Arrays.toString(arr2));
        System.out.println("deberia ser " + solucion);
        System.out.println("pero el resultado obtenido es " + solAlumno);
        throw new Error("");
        
      }
    } catch (Exception e){
      System.out.println(e.toString());
      throw new Error("Error en test: el codigo esPermutacion del alumno produce una excepcion");
    }
  }
  
  
  
  
  public static void main(String[] args) { 

    ///////////////////////////////////// PRUEBAS numRepeticionesElementosRango
    {
      int[] arr={};
      int inf = 11;
      int sup = 18;
      int[] sol={0,0,0,0,0,0,0,0};
      do_check(arr,inf,sup,sol);
    }
    {
      int[] arr={};
      int inf = 11;
      int sup = 11;
      int[] sol={0};
      do_check(arr,inf,sup,sol);
    }
    {
      int[] arr={};
      int inf = 11;
      int sup = 12;
      int[] sol={0,0};
      do_check(arr,inf,sup,sol);
    }
    {
      int[] arr={8,10,8,7,13,8,9};
      int inf = 7;
      int sup = 13;
      int[] sol={1,3,1,1,0,0,1};
      do_check(arr,inf,sup,sol);
    }
    {
      int[] arr={-12,-8,-7,-11,-12,-7};
      int inf = -13;
      int sup = -7;
      int[] sol={0,2,1,0,0,1,2};
      do_check(arr,inf,sup,sol);
    }
    {
      int[] arr={3,4,0,1,0,-1,-2,-2,3,4};
      int inf = -2;
      int sup = 5;
      int[] sol={2,1,2,1,0,2,2,0};
      do_check(arr,inf,sup,sol);
    }
    System.out.println("Test numRepeticionesElementosRango superado correctamente.");
    


    /////////////////////////////////////////////// PRUEBAS esPermutacion
    {
      int[] arr1 = {};
      int[] arr2={};
      boolean solucion = true;
      do_check1(arr1, arr2, solucion);
    }
    {
      int[] arr1 = {1,2,3};
      int[] arr2={};
      boolean solucion = false;
      do_check1(arr1, arr2, solucion);
    }
    {
      int[] arr1 = {1,2,3,4,5};
      int[] arr2={5,4,3,2,1};
      boolean solucion = true;
      do_check1(arr1, arr2, solucion);
    }
    {
      int[] arr1 = {1,2,3,4,5};
      int[] arr2={1,2,3,4};
      boolean solucion = false;
      do_check1(arr1, arr2, solucion);
    }
    {
      int[] arr1 = {1,1,1,1};
      int[] arr2={1,1,1};
      boolean solucion = false;
      do_check1(arr1, arr2, solucion);
    }
    {
      int[] arr1 = {1,2,3,4};
      int[] arr2={4,3,2,1};
      boolean solucion = true;
      do_check1(arr1, arr2, solucion);
    }
    {
      int[] arr1 = {1,2,3,4,5,6,7,8,9};
      int[] arr2={1,2,9,8,3,4,5,6,7};
      boolean solucion = true;
      do_check1(arr1, arr2, solucion);
    }
    System.out.println("Test esPermutacion superado correctamente");   
 }
}