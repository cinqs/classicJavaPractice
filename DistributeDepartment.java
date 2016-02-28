import java.util.Scanner;

public class DistributeDepartment{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("input a name for the employee: ");
    String name = scan.nextLine();
    System.out.println("input the correspondent language: ");
    String lang = scan.nextLine();
    switch(lang){
      case "java":
        System.out.println("Voila, nous sommes une java");
        break;
      case "c++":
        System.out.println("Voila, c'est C++");
        break;
      default:
        System.out.println("c'est quoi?");
    }
  }
}
