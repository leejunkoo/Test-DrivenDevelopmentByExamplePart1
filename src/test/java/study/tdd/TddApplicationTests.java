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

    void times(int multiplier) {
      amount *=  multiplier;
    }
  }

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    Assertions.assertEquals(10, five.amount);
  }

}
