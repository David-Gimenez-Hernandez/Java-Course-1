import java.util.Arrays;

class Burbuja {
  
  static void burbuja(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if (arr[i]>arr[j]){
          arr[i]=arr[i]+arr[j];
          arr[j]=arr[i]-arr[j];
          arr[i]=arr[i]-arr[j];
        }//de if
      }// de for
    }//de for
  }//de burbuja
    
    
    
  //****************************************************  NO TOQUEIS NADA A PARTIR DE AQUI
  
  //********************************* METODOS PARA PRUEBAS
  
  private static void check(int[] arr, int[] solucion){
    try{
      int[] solAlumno=Arrays.copyOf(arr, arr.length);
      burbuja(solAlumno);
      if (!Arrays.equals(solAlumno,solucion)){
        System.out.println("Error: el codigo burbuja del alumno produce un resultado incorrecto.");
        System.out.println("El resultado esperado para el argumento: " + 
                           Arrays.toString(arr));    
        System.out.println("deberia ser " + Arrays.toString(solucion));
        System.out.println("pero el resultado obtenido es " + Arrays.toString(solAlumno));
        throw new Error();
      }
    } catch (Exception e){
      System.out.println(e.toString());
      throw new Error("Error en test: el codigo del alumno produce una excepcion");
    }
    
  }
  
  
  public static void main(String[] args) {
    
    
    {
      int[] arr = {};
      int[] solucion = {};
      check(arr,solucion);
    }
    {
      int[] arr = {8};
      int[] solucion = {8};
      check(arr,solucion);
    }
    
    {
      int[] arr = {1, 1};
      int[] solucion = {1, 1};
      check(arr,solucion);
    }
    
    {
      int[] arr = {1, 2};
      int[] solucion = {1, 2};
      check(arr,solucion);
    }
    
    {
      int[] arr = {1, 3,2};
      int[] solucion = {1,2, 3};
      check(arr,solucion);
    }
    
    {
      int[] arr = {2,3,1};
      int[] solucion = {1,2,3};
      check(arr,solucion);
    }
    
    {
      int[] arr = {3,2,1};
      int[] solucion = {1,2,3};
      check(arr,solucion);
    }
    
    {
      int[] arr = {2, 1,4,5,3};
      int[] solucion = {1,2,3,4,5};
      check(arr,solucion);
    }
    
    {
      int[] arr = {5,4,3,2,1};
      int[] solucion = {1,2,3,4,5};
      check(arr,solucion);
    }
    
    {
      int[] arr = {1,2,3,5,4};
      int[] solucion = {1,2,3,4,5};
      check(arr,solucion);
    }
    
    {
      int[] arr = {9,1,8,2,7,3,6,4,5};
      int[] solucion = {1,2,3,4,5,6,7,8,9};
      check(arr,solucion);
    }
    
    System.out.println("Test burbuja finalizado correctamente.");
  }
}