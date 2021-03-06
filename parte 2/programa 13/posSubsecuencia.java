import java.util.Arrays;
class posSubsecuencia {
  
  
  /**
   * PRE: true
   * POST: si subsec aparece en sec devuelve la posicion en que comienza en este ultimo, en
   *       otro caso devuelve -1
  */
  static int posSubsecuencia(int[] sec, int[] subsec){
    if (sec.length==0||subsec.length==0)return -1;
    int res=-1;
    for (int i=0;i<(sec.length-subsec.length+1)&&(res==-1);i++){
      if (sec[i]==subsec[0]){
        res=i++;
        for(int j=1;j<subsec.length&&(res!=-1);j++){
          if (sec[i++]!=subsec[j])res=-1;
        }//de for
      }//de if
    }//de for
    return res;
  }
  
  
  ////////////////////////////////////////ZONA DE METODOS PRIVADOS PARA PRUEBAS ----- NO TOCAR
  
  private static void do_check3(int[] secuencia, int[] subsec, int solucion){
    try{
      
      int solAlumno=posSubsecuencia(secuencia, subsec);
      
      if (solAlumno!=solucion){
        System.out.println("Error: el codigo buscarSubsecuencia del alumno produce un resultado incorrecto.");
        System.out.println("El resultado esperado para los argumentos: " + 
                           Arrays.toString(secuencia) + ", " + Arrays.toString(subsec));    
        System.out.println("deberia ser " + solucion);
        System.out.println("pero el resultado obtenido es " + solAlumno);
        throw new Error();
      }
    } catch (Exception e){
      System.out.println("**** El c?digo buscarSubsecuencia del alumno ha lanzado una excepci?n: " + e.toString());
      throw new Error();
    }}
    
    
    
    public static void main(String[] args) { 
      
      // PRUEBAS buscarSubsecuecia
      {
        int[] sec = {2,3,4,5};
        int[] subsec = {3};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
  
      {
        int[] sec = {};
        int[] subsec = {2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      {
        int[] sec = {5, 4};
        int[] subsec = {};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      {
        int[] sec = {5, 4, 3,5};
        int[] subsec = {3};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      {
        int[] sec = {2, 4};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4};
        int[] subsec = {2, 4};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4};
        int[] subsec = {2, 4};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 2};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 2};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 2};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 2};
        int[] subsec = {3, 2};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 2};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 2};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 2};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 3, 3};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 3, 3};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 3, 3};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 3, 3};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 3, 3};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 3, 3};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 3, 3};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 3, 3};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 3, 3};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 3, 3};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4, 1};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4, 1};
        int[] subsec = {2, 4};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4, 1};
        int[] subsec = {4, 1};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4, 1};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4, 1};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4, 1};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4, 1};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4, 1};
        int[] subsec = {2, 4};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4, 1};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 4, 1};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1};
        int[] subsec = {4, 1};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1};
        int[] subsec = {3, 4, 1};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 4};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 4};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 4};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 4};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 4};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 4};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 4};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 4};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 4};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 4};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {1, 1, 2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {3, 1, 3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {3, 4, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {3, 1, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 2, 3, 3};
        int[] subsec = {2, 1, 3, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {1, 1};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {1, 1, 4};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {1, 1, 2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {3, 1, 3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {3, 4, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {3, 1, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 1, 4, 4};
        int[] subsec = {2, 1, 3, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {3, 1};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {1, 1, 2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {3, 1, 3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {3, 4, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {3, 1, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 3, 3, 1};
        int[] subsec = {2, 1, 3, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {3, 1};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {1, 1, 2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {3, 1, 3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {3, 4, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {3, 1, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 3, 1, 4};
        int[] subsec = {2, 1, 3, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {4, 1};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {1, 1, 2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {3, 1, 3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {3, 4, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {3, 1, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 4, 4, 1};
        int[] subsec = {2, 1, 3, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {1, 1, 2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {3, 1, 3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {3, 4, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {3, 1, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {2, 1, 3, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {3, 3, 1, 4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {4, 3, 2, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {2, 3, 4, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {1, 2, 2, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 2, 1, 3, 3};
        int[] subsec = {1, 1, 4, 3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {3, 1};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {1, 1, 2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {3, 1, 3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {3, 4, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {3, 1, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {2, 1, 3, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {3, 3, 1, 4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {4, 3, 2, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {2, 3, 4, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {1, 2, 2, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {2, 1, 2, 3, 1};
        int[] subsec = {1, 1, 4, 3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {4, 1};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {1, 1};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {1, 1, 2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {3, 1, 3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {3, 4, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {3, 1, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {4, 1, 1, 1};
        int[] subsec = {2, 1, 3, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {3, 1};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {3, 4, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {3, 4, 2};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {1, 1, 2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {3, 1, 3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {3, 4, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {3, 1, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {2, 1, 3, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {3, 3, 1, 4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {4, 3, 2, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {2, 3, 4, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {1, 2, 2, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 1, 3, 4, 2};
        int[] subsec = {1, 1, 4, 3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {4, 1};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {1, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {3, 4, 1};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {1, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {3, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {1, 1, 2, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {3, 1, 3, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {3, 4, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {3, 1, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {2, 1, 3, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {3, 3, 1, 4, 3};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {4, 3, 2, 1, 4};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {2, 3, 4, 2, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {1, 2, 2, 4, 2};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {3, 4, 1, 4, 1};
        int[] subsec = {1, 1, 4, 3, 1};
        int solucion = -1;
        do_check3(sec,subsec,solucion);
      }
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {1, 2};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 3};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 3};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 4};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {4, 5};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {5, 2};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 3};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 4};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {1, 2, 2};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 2};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 3};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 3, 3};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 3, 4};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 4, 5};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {4, 5, 2};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {5, 2, 3};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 3, 4};
        int solucion = 8;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {1, 2, 2, 2};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 2, 3};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 3, 3};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 3, 3, 4};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 3, 4, 5};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 4, 5, 2};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {4, 5, 2, 3};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {5, 2, 3, 4};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {1, 2, 2, 2, 3};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 2, 3, 3};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 3, 3, 4};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 3, 3, 4, 5};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 3, 4, 5, 2};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 4, 5, 2, 3};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {4, 5, 2, 3, 4};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {1, 2, 2, 2, 3, 3};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 2, 3, 3, 4};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 3, 3, 4, 5};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 3, 3, 4, 5, 2};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 3, 4, 5, 2, 3};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 4, 5, 2, 3, 4};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {1, 2, 2, 2, 3, 3, 4};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 2, 3, 3, 4, 5};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 3, 3, 4, 5, 2};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 3, 3, 4, 5, 2, 3};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {3, 3, 4, 5, 2, 3, 4};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {1, 2, 2, 2, 3, 3, 4, 5};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 2, 3, 3, 4, 5, 2};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 3, 3, 4, 5, 2, 3};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 3, 3, 4, 5, 2, 3, 4};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {1, 2, 2, 2, 3, 3, 4, 5, 2};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 2, 3, 3, 4, 5, 2, 3};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 3, 3, 4, 5, 2, 3, 4};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int[] subsec = {1, 2, 2, 2, 3, 3, 4, 5, 2, 3, 4};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 7};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 5};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 4};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 8};
        int solucion = 9;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {8, 7};
        int solucion = 10;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 6};
        int solucion = 11;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 4};
        int solucion = 12;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 5};
        int solucion = 13;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6, 7};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 7, 5};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 5, 4};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 4, 3};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 8};
        int solucion = 8;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 8, 7};
        int solucion = 9;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {8, 7, 6};
        int solucion = 10;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 6, 4};
        int solucion = 11;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 4, 5};
        int solucion = 12;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 5, 6};
        int solucion = 13;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6, 7};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6, 7, 5};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 7, 5, 4};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 5, 4, 3};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 4, 3, 8};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 8, 7};
        int solucion = 8;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 8, 7, 6};
        int solucion = 9;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {8, 7, 6, 4};
        int solucion = 10;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 6, 4, 5};
        int solucion = 11;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 4, 5, 6};
        int solucion = 12;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6, 7};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6, 7, 5};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6, 7, 5, 4};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 7, 5, 4, 3};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 5, 4, 3, 8};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 4, 3, 8, 7};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 8, 7, 6};
        int solucion = 8;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 8, 7, 6, 4};
        int solucion = 9;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {8, 7, 6, 4, 5};
        int solucion = 10;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 6, 4, 5, 6};
        int solucion = 11;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6, 7};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6, 7, 5};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6, 7, 5, 4};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6, 7, 5, 4, 3};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 7, 5, 4, 3, 8};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 5, 4, 3, 8, 7};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 4, 3, 8, 7, 6};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 8, 7, 6, 4};
        int solucion = 8;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 8, 7, 6, 4, 5};
        int solucion = 9;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {8, 7, 6, 4, 5, 6};
        int solucion = 10;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6, 7};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6, 7, 5};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6, 7, 5, 4};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6, 7, 5, 4, 3};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6, 7, 5, 4, 3, 8};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 7, 5, 4, 3, 8, 7};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 5, 4, 3, 8, 7, 6};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 4, 3, 8, 7, 6, 4};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 8, 7, 6, 4, 5};
        int solucion = 8;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 8, 7, 6, 4, 5, 6};
        int solucion = 9;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6, 7, 5};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6, 7, 5, 4};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6, 7, 5, 4, 3};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6, 7, 5, 4, 3, 8};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6, 7, 5, 4, 3, 8, 7};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 7, 5, 4, 3, 8, 7, 6};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 5, 4, 3, 8, 7, 6, 4};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 4, 3, 8, 7, 6, 4, 5};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 8, 7, 6, 4, 5, 6};
        int solucion = 8;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6, 7, 5, 4};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6, 7, 5, 4, 3};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6, 7, 5, 4, 3, 8};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6, 7, 5, 4, 3, 8, 7};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6, 7, 5, 4, 3, 8, 7, 6};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 7, 5, 4, 3, 8, 7, 6, 4};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 5, 4, 3, 8, 7, 6, 4, 5};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 4, 3, 8, 7, 6, 4, 5, 6};
        int solucion = 7;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6, 7, 5, 4, 3, 8};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6, 7, 5, 4, 3, 8, 7};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6, 7, 5, 4, 3, 8, 7, 6};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6, 7, 5, 4, 3, 8, 7, 6, 4};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 7, 5, 4, 3, 8, 7, 6, 4, 5};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int solucion = 6;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int solucion = 5;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int solucion = 4;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int solucion = 3;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int solucion = 2;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int solucion = 1;
        do_check3(sec,subsec,solucion);
      }
      
      {
        int[] sec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int[] subsec = {1, 4, 3, 2, 5, 6, 7, 5, 4, 3, 8, 7, 6, 4, 5, 6};
        int solucion = 0;
        do_check3(sec,subsec,solucion);
      }
      System.out.println("Test buscarSubsecuencia superado");
      
      
      
      
      
    }
    
    
  }