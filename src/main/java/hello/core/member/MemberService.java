package hello.core.member;

import hello.core.member.Member;
import hello.core.order.Order;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
