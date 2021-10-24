class Recursión{
  //PRE: x>=0, x pretenece a Z
  static int factorial(int x){
    if(x<2) return 1;
    else return x*factorial(x-1);
  }
  //PRE: x,y>=0,  pretenecen a Z
  //PRE: x<=y
  static int productoEntre(int x, int y){
    if (x==y)return x;
    else return x*productoEntre(x+1,y);
  }
  public static void main(String[]args){
    int x = StdIn.readInt();
    System.out.println(factorial(x));
    int y = StdIn.readInt();
    System.out.println(productoEntre(x,y));
  }
}