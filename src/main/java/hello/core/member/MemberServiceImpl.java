package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // 이걸 선언만 하고 선택을 안해주면 null point exception 오류가 발생할 것, 반드시 구현 객체를 선택해줘야 함
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 다형성에 의해서 인터페이스가 아닌 MemoryMemberRepository에 있는 save, findById 메소드가 호출됨
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
