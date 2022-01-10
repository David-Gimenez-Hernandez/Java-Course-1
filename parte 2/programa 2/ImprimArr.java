class ImprimArr{
  
  
  static void imprimArr(int[] arr){
    for (int i=0; i<arr.length;i++){
      System.out.println(arr[i]);
    }//de for
  }//de imprimArr
  
  
  static void imprimArrInvert(int[] arr){
    for (int i=(arr.length-1); i>=0;i--){
      System.out.println(arr[i]);
    }//de for
  }//de imprimArrInvert
  
  
  static int sumaArr(int[] arr){
    int res=0;
    for (int i=(arr.length-1); i>=0;i--){
      res+=arr[i];
    }//de for
    return res;
  }//de sumaArr
  
  
  static boolean esPar(int n){
    return (n%2)==0;
  }//de esPar
  
  
  static int sumaArrPares(int[] arr){
    int res=0;
    for (int i=(arr.length-1); i>=0;i--){
      res+= (esPar(i)?arr[i]:0);
    }//de for
    return res;
  }//de sumaArrPares
  
  
  static int minimArr(int[] arr){
    //PRE: arr.length >=1
    int res=arr[0];// inicializo res a cualquier valor del array
    for (int i=(arr.length-1); i>=0;i--){
      res= (arr[i]<res)?arr[i]:res;// verifico que ningun valor es menor que res y si encuentro uno lo sustituyo
    }//de for
    return res;
  }//de minimArr
  
  
  static int minimArrRecurs(int[] arr){
    if (arr.length == 0) return arr[0];
    return arr[1];
  }//de minimArrRecurs
  
  
  static boolean ArrMayorQueInt(int[] arr, int x){
    boolean res=false;
    for (int i=(arr.length-1); (i>=0)&&!res;i--){
      res= (arr[i]>x);// si el elemento es mayor me salgo del array
    }//de for
    return res;
  }//de ArrMayorQueInt
  
  
  static boolean TodoArrMayorQueInt(int[] arr, int x){
    boolean res=true;
    for (int i=(arr.length-1); (i>=0)&&res;i--){
      res= (arr[i]>x);// si el elemento es mayor continuo recorriendo el array
    }//de for
    return res;
  }//de TodoArrMayorQueInt
  
  
  public static void main(String[] args){
    int[] arr = {1,2,-3,4};
    System.out.println("Pruebas:");
    System.out.println("------------");
    imprimArr(arr);
    System.out.println("------------");
    imprimArrInvert(arr);
    System.out.println("------------");
    System.out.println(sumaArr(arr));
    System.out.println("------------");
    System.out.println(sumaArrPares(arr));
    System.out.println("------------");
    System.out.println(minimArr(arr));
    System.out.println("------------");
    System.out.println(ArrMayorQueInt(arr,6));
    System.out.println("------------");
    System.out.println(TodoArrMayorQueInt(arr,-4));
    System.out.println("------------");
  }//de main
}// de ImprimArr