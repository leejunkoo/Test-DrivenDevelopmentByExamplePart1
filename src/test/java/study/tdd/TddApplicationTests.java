package study.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

  class Dollar {
    int amount;

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
    Dollar product = five.times(2);
    Assertions.assertEquals(10, product.amount);
    product = five.times(3);
    Assertions.assertEquals(15, product.amount);
  }

  @Test
  public void testEquality() {
    Assertions.assertEquals(new Dollar(5), new Dollar(5));
    Assertions.assertNotEquals(new Dollar(5), new Dollar(6));
  }

}
