package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 정액 할인

    @Override
    public int discount(Member member, int price) {
        // VIP인 경우에만 1000원 할인
        // Enum 타입은 ==을 사용하는 게 맞음(=== 대신을 말하는 듯)
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
