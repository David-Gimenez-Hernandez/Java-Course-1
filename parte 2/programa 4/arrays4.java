import java.util.Arrays;
class arrays4{

  static int posElem(int[] arr,int x){
    if (arr.length==0)return -1;
    else return posElemAux(arr, 0, x);
  }//de posElem
  static int posElemAux(int[] arr, int i, int x){
    if (arr[i]==x)return i;
    return(i<arr.length-1)?posElemAux(arr,i+1,x):-1;
  }//de posElemAux
  
  
  static int SumParMax(int[] arr){
      if (arr.length==0 || arr.length==1)return 0;
      else return SumParMaxAux(arr, 1, arr[0]+arr[1]);
  }//de SumParMax
  static int SumParMaxAux(int[] arr, int i, int x){
    x= ((arr[i]+arr[i+1])>x)?(arr[i]+arr[i+1]):x;
    return(i<arr.length-2)?SumParMaxAux(arr,i+1,x):x;
  }//de posElemAux
  
  
  static void intercambia(int[]arr, int i1, int i2){
//    arr[i1]=(arr[i1]+arr[i2]);
//    arr[i2]=(arr[i1]-arr[i2]);
//    arr[i1]=(arr[i1]-arr[i2]);
     int aux = arr[i1];
     arr[i1]=arr[i2];
     arr[i2]=aux;
//    i=j+i;
//    j=i-j;
//    i=i-j;
  }//de intercambia
  
  
  static int[] copia(int[] arr){
    int[] res = new int[arr.length];
    for(int i=0;i<arr.length;i++){
      res[i]=arr[i];
    }//de for
    return res;
  }//de copia
  
  
  public static void main(String[] args){
    int[] arr= {1,2,3,4,5};
    System.out.println(posElem(arr,4));
    System.out.println(SumParMax(arr));
    int[] arr2 = copia(arr);
    intercambia(arr, 2, 4);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));
  }//de main
  
  
}//de arrays4