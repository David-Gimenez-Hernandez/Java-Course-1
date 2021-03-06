class Arrays5{
  static boolean esCapicua(int[] arr){
    boolean res = true;
    for(int i=0;i<(arr.length-1)/2 && res;i++){
      res=(arr[i]==arr[arr.length-1-i]);
    }//de for
    return res;
  }//de esCapicua
  
  static boolean esCapicuaRec(int[] arr){
    return esCapicuaRecAux(arr,0);
  }//de esCapicuaRec
  static boolean esCapicuaRecAux(int[] arr, int i){
    return (i>=(arr.length-1)/2)||((arr[i]==arr[arr.length-1-i])&& esCapicuaRecAux(arr,i+=1));
  }//de esCapicuaRecAux
  
  
  
  static int[] arrSeguidoInverso(int[] arr){
    int[] res = new int[arr.length*2];
    for(int i=0;i<arr.length-1;i++){
      res[i]=arr[i];
      res[res.length-1-i]=arr[i];
    }//de for
    return res;
  }//de arrSeguidoInverso
  
  
  static int[] arrSeguidoInversoRec(int[] arr){
    int[] res= new int[arr.length*2];
    return arrSeguidoInversoRecAux(arr,0,res);
  }//de arrSeguidoInversoRec
  static int[] arrSeguidoInversoRecAux(int[] arr, int i, int[]res){
    if (i==arr.length) return res;
    res[i]=arr[i];
    res[res.length-1-i]=arr[i];
    return arrSeguidoInversoRecAux(arr,i++,res);
  }//de arrSeguidoInversoAux 
  
//  
//  static int[] menoresQue(int[] arr, int elem){
//    int cont = 0;
//      for(int i=0;i<arr.length-1;i++){
//        (arr[i]<elem)?cont++:;
//      }//de for
//      int[] res = new int[cont];
//      int j = 0;
//      for(int i=0;i<arr.length-1;i++){
//        if (arr[i]<elem) res[j++]=arr[i];
//      }//de for
//      return res;
//  }//de menoresQue
  
  
  
  
  static boolean estaEnArrOrd(int[] arr, int elem){
    boolean res = false; 
 for(int i=0;(i<arr.length)&&(arr[i]<=elem)&&!res;i++){
     res = (arr[i]==elem);
    }//de for
 return res;
  }//de estaEnArrOrd
    
  
  static int[] anadirElem(int[] arr, int elem){
    int[] res = new int[arr.length+1];
    int i =0;
    for(;(i<arr.length)&&(arr[i]<=elem);i++);
    for(int j=0;(j<i);j++){
      res[j] = arr[j];
    }//de for
    res [i++]= elem;
    for(int j=i;(j<res.length);j++){
      res[j] = arr[j-1];
    }//de for
    return res;
  }//de anadirElem
  
  
  static void anadirElemSinModif(int[] arr, int elem){
    //PRE: arr es un array de enteros ordenado(con los espacios vacios al final)
    //POS: introduce un elemento en su lugar en orden no decreciente si hay espacio.
    if (elem==0) System.out.println("No pueden introducirse ceros");
    else if ((arr.length==0)||arr[arr.length-1]!=0) System.out.println("No hay espacios disponibles");
    else {  
//      int i =0;
//      for(;(i<arr.length)&&(arr[i]<=elem);i++);
//      for(int j=arr.length-1;(j>i);j--){
//        arr[j]=arr[j-1];
//      }//de for
      int i =arr.length-1;
      for(;(i>=0)&&((arr[i]==0)||(arr[i]>elem));i--){
        arr[i]=arr[i-1];
      }//de for
      arr[i]=elem;
    }//de else
  }//de anadirElemSinModif
  
  
    static void printIntArray(int[] arr){
      System.out.print("[");
      int i=0;
      for(; i<arr.length-1;i++){
        System.out.print(arr[i] + ",");
      }//de for
      System.out.println(arr[i]+"]");
    }//de printIntArray
    
  public static void main(String[] args){
    int[] arr = {1,2,3,2,1};
    System.out.println(esCapicuaRec(arr));
    int[] arr2 = {};
    System.out.println(esCapicuaRec(arr2));
    int[] arr3 = {1,2,3,5,6,7,8,9,0};
    printIntArray(arr3);
    anadirElemSinModif(arr3,4);
    printIntArray(arr3);
  }//de main
}//de Arrays5