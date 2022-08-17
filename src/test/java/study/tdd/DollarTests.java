package study.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import study.tdd.domain.Dollar;

@SpringBootTest
class DollarTests {

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
