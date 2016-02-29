public class YanghuiTriangle{
  public static void main(String [] args){
    int triangle[][] = new int[10][];

    for (int i = 0; i < triangle.length; i++ ) {
      triangle[i] = new int[i + 1];
      for (int j = 0;j < i + 1 ;j++ ) {
        if (j == 0 || j == i) {
          triangle[i][j] = 1;
        }else {
          triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
        }
        System.out.print(triangle[i][j] + "\t");
      }
      System.out.println("\n");
    }
  }
}
