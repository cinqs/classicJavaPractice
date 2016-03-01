public class NumberOfPs{
  public static void main(String [] args){
    String searchMe = "peter piper picked a " + "peck of pickled peppers";

    int max = searchMe.length();

    int numPs = 0;

    for (int i = 0; i < max; i++) {
      if (searchMe.charAt(i) != 'p') {
        continue;
      }

      numPs++;
    }

    System.out.println(numPs);
  }
}
