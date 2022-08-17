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
  }

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    Assertions.assertEquals(10, product.amount);
    product = five.times(3);
    Assertions.assertEquals(15, product.amount);
  }

}
