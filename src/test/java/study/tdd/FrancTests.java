package study.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FrancTests {

  class Franc {
    private int amount;

    Franc(int amount) {
      this.amount = amount;
    }

    Franc times(int multiplier) {
      return new Franc(amount * multiplier);
    }

    public boolean equals(Object object) {
      Franc dollar = (Franc) object;
      return amount == dollar.amount;
    }
  }

  @Test
  public void testMultiplication() {
    Franc five = new Franc(5);
    Assertions.assertEquals(new Franc(10), five.times(2));
    Assertions.assertEquals(new Franc(15), five.times(3));
  }

  @Test
  public void testEquality() {
    Assertions.assertEquals(new Franc(5), new Franc(5));
    Assertions.assertNotEquals(new Franc(5), new Franc(6));
  }

}
