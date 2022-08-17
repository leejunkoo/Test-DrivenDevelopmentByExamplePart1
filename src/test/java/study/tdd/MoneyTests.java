package study.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import study.tdd.domain.Dollar;
import study.tdd.domain.Franc;

@SpringBootTest
class MoneyTests {

  @Test
  public void testEquality() {
    Assertions.assertEquals(new Dollar(5), new Dollar(5));
    Assertions.assertNotEquals(new Dollar(5), new Dollar(6));
    Assertions.assertEquals(new Franc(5), new Franc(5));
    Assertions.assertNotEquals(new Franc(5), new Franc(6));
    Assertions.assertNotEquals(new Franc(5), new Dollar(5));
  }

}
