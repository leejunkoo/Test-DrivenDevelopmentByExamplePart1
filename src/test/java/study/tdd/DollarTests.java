package study.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DollarTests {

  class Dollar {
    private int amount;

    Dollar(int amount) {
      this.amount = amount;
    }

    Dollar times(int multiplier) {
      return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
      Dollar dollar = (Dollar) object;
      return amount == dollar.amount;
    }
  }

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    Assertions.assertEquals(new Dollar(10), five.times(2));
    Assertions.assertEquals(new Dollar(15), five.times(3));
  }

  @Test
  public void testEquality() {
    Assertions.assertEquals(new Dollar(5), new Dollar(5));
    Assertions.assertNotEquals(new Dollar(5), new Dollar(6));
  }

}
