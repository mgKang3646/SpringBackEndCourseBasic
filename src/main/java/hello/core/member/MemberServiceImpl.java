package hello.core.member;

import hello.core.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    @Autowired // 자동으로 스프링 컨테이너에서 의존관계 주입을 한다 ( ac.getBean(MemberRepository.class )
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    @Override
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
