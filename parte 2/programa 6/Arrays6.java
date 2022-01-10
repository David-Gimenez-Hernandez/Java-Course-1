class Arrays6{
  static int[] negativosPrimero(int[] arr){
    int[] res = new int[arr.length];
    int j=0;
    for(int i=0; i<arr.length;i++){
     res[i]=arr[i];
     if (arr[i]<0){
       res[i]=res[j];
       res[j]=arr[i];
       j++;
     }//de if
    }//de for
    return res;
  }//de negativosPrimero
  
  
static boolean equals(int[] arr1, int[] arr2){
  if (arr1.length != arr2.length ) return false;
  else if (arr1==arr2) return true;
  boolean res = true;
  for(int i=0; i<arr1.length&&res;i++){
    res=(arr1[i]==arr2[i])?true:false;
  }//de for
  return res;
  }//de negativosPrimero

static boolean equalsRec(int[] arr1, int[] arr2){
  if (arr1.length != arr2.length ) return false;
  else return (arr1==arr2)||equalsRecAux(arr1,arr2,0);
}//de equalsRec
static boolean equalsRecAux(int[] arr1, int[] arr2, int i){
  return (i==arr1.length)||((arr1[i]==arr2[i])&&equalsRecAux(arr1,arr2,++i));
}//de equalsRecAux
  
  
 static void printIntArray(int[] arr){
      System.out.print("[");
      int i=0;
      for(; i<arr.length-1;i++){
        System.out.print(arr[i] + ",");
      }//de for
      System.out.println(arr[i]+"]");
    }//de printIntArray
  
  
  public static void main(String[] args){
    int[] arr={1,-2,3,-5,3};
    printIntArray(arr);
    printIntArray(negativosPrimero(arr));
    int[] arr2 = {};
    int[] arr3 = {1,-2,3,-5,3};
    System.out.println(equals(arr,arr3));
    System.out.println(equalsRec(arr,arr3));
  }//de main
}//de Arrays6