import java.math.BigDecimal;

public class JieCheng{
  public static void main(String [] args){
    BigDecimal sum = new BigDecimal(0.0);
    BigDecimal factorial = new BigDecimal(1.0);

    int i = 2;
    while (i <= 20) {
      factorial = factorial.multiply(new BigDecimal(1.0 / i));
      sum = sum.add(factorial);
      i++;
    }
    System.out.println(sum);
    sum = sum.add(new BigDecimal(1.0));
    System.out.println(sum);
  }
}
