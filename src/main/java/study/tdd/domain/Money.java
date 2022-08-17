package study.tdd.domain;

public abstract class Money {
  protected int amount;
  protected String currenty;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currenty = currency;
  }

  public static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  public abstract Money times(int multiplier);

  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }

  public String currency() {
    return currenty;
  };
}
