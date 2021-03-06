class Arrays3{
  static boolean existeMayorQue(int[] arr, int elem){
    int i;
    for(i=0;(i<arr.length)&&(arr[i]<=elem);i++);
    return (i<arr.length);
  }//de existeMayorQue
  static boolean todosMayorQue(int[] arr, int elem){
    int i=0;
    for(;(i<arr.length)&&(arr[i]>=elem);i++);
    return !(i<arr.length);
  }//de TodosMayorQue
  
  //recursion sobre arrays:
  // necesitas un caso basico, y que el siguiente argumento este mas cerca de ese caso basico.
  //tipos: no de cola(tiene return x*f(x-1), tiene que retroceder y operar al acabar)
  //       de cola(tiene un return simple, no retrocede, se usa un parametro acumulador
  
  static int factorialDeCola(int n, int p){
    if (n==0)return p;
    p*=n;
    return factorialDeCola(n-1,p);
  }//de factorialDeCola
  
static int factorial(int n){
    return factorialDeCola(n,1); 
  }//de factorial

static boolean buscarEnArray(int[] arr, int n){
  return buscarEnArrayAux(arr,n,0);
}//de buscarEnArray

static boolean buscarEnArrayAux(int[] arr, int n, int i){
  if (i>=arr.length) return false;
  else if (arr[i]==n) return true;
  else return buscarEnArrayAux(arr,n,i+1);
}//de buscarEnArrayAux

static boolean todosMayorQueV2(int[] arr, int n){
  return todosMayorQueV2Aux(arr,n,0);
}//de todosMayorQue

static boolean todosMayorQueV2Aux(int[] arr, int n, int i){
//  if (i>=arr.length) return true;
//  else if (arr[i]<n) return false;
//  else return todosMayorQueV2Aux(arr,n,i+1);
  return !((i<arr.length)&&((arr[i]<n)|| todosMayorQueV2Aux(arr,n,i+1)));
}//de todosMayorQueAux

static boolean existeMayorQueV2(int[] arr, int n){
  return existeMayorQueV2Aux(arr,n,0);
}//de todosMayorQue

static boolean existeMayorQueV2Aux(int[] arr, int n, int i){
//  if (i>=arr.length) return false;
//  else if (arr[i]>n) return true;
//  else return existeMayorQueV2Aux(arr,n,i+1);
  return (i<arr.length)&&((arr[i]>n)|| todosMayorQueV2Aux(arr,n,i+1));
}//de todosMayorQueAux
  
static int minimoRC(int[] arr){
  return minimoRCAux(arr,0,arr[0]);
}//de minimoRC

static int minimoRCAux(int[] arr, int i, int x){
  int res = (arr[i]<x)?arr[i]:x;
  return (i<arr.length-1)?minimoRCAux(arr,i+1,res):res;
}//de minimoRCAux
    
  public static void main(String[] args){
  }//de main
}//de Arrays3