package hello.core.discount;

import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountAmount = 10;

    @Override
    public int discount(Member member, int price) {
        return 0;
    }
}
