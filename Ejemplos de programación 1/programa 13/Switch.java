class Switch1 {
  static int funcionIfComoSwitch(int n){
    if (n==1 || n==1|| n==2)return -1;
    else if (n==3|| n==4 || n==5 || n==6) return 44;
    else return 1000;
  }
  static int funcionIfComoSwitch2(int n){
    int resultado;
    if (n==1 || n==1|| n==2)resultado= -1;
    else if (n==3|| n==4 || n==5 || n==6) resultado= 44;
    else resultado= 1000;
    return resultado;
  }
  static int switch1(int n){
    switch(n){
      case 0:return -1;
      case 1:return -1;
      case 2:return -1;
      case 3:return 44;
      case 4:return 44;
      case 5:return 44;
      case 6:return 44;
      default:return 1000;
    }
  }
  static int switch2(int n){
    switch(n){
      case 0:
      case 1:
      case 2:return -1;
      case 3:
      case 4:
      case 5:
      case 6:return 44;
      default:return 1000;
    }
  }
  static int switch3(int n){
    int res;
    switch(n){
      case 0:
      case 1:
      case 2:res= -1;break;
      case 3:
      case 4:
      case 5:
      case 6:res= 44;break;
      default:res= 1000;
    }
    return res;
  }
  
  public static void main (String[] args ){
    int n = StdIn.readInt();
    System.out.println(funcionIfComoSwitch(n));
    System.out.println(funcionIfComoSwitch2(n));
    System.out.println(switch1(n));
    System.out.println(switch2(n));
    System.out.println(switch3(n));
  }
}