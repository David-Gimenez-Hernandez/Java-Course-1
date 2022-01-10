class Matrices1{
  //son arrays rellenos de arrays(cada elemento es una fila de la matriz)
  //Arrays.deepToString es un Array.toString que lo hace en doble profundidad, sief
  static void imprimeMatriz(int[][] matriz){
    for (int i = 0;i<matriz.length;i++){
      for(int j=0;j<matriz[0].length;j++){
        System.out.print(matriz[i][j]);
      }//de for
      System.out.println();
    }//de for
  }//de imprimeMatriz
  
  static void imprimeMatrizRec(int[][] matriz){
    imprimeMatrizRecAux(matriz,0,0);
  }
  static void imprimeMatrizRecAux(int[][] matriz, int i, int j){
   if(i<matriz.length&&j<matriz[0].length){
        System.out.print(matriz[i][j]);
        if (j==matriz[0].length-1){
          System.out.println();
          i++;
          j=-1;
        }//de if
        imprimeMatrizRecAux(matriz,i,++j);
      }//de if
  }//de imprimeMatriz
  
  static int[][] matrizIdentidad(int n){
    int matriz[][] = new int[n][n];
     for (int i = 0;i<matriz.length;i++){
      for(int j=0;j<matriz[0].length;j++){
        matriz[i][j]=(i==j)?1:0;
      }//de for
    }//de for
     return matriz;
  }//de matrizIdentidad
  
  
  public static void main(String[] args){
  int[][] matriz = {{3,5,1},{2,8,4}};
  //int[filas][columnas]= new int[num filas][num columnas];
  int i = matriz[0][1];// i es 5, fila cero, columna 1
  int[][] matriz2 ={{1,4,7,2},{2,8,9,3},{0,8,3,0}};
  imprimeMatrizRec(matriz2);
  imprimeMatrizRec(matrizIdentidad(3));
  }//de main
}//de Matrices1