package week2.report1;

interface DiscountCondition {
  public boolean isSatisfiedBy(Screening screening, int audienceCount);

  public Money calculateFee(Money fee);
}