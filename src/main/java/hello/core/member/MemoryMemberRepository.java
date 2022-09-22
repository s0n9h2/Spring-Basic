package hello.core.member;

import java.util.HashMap;
import java.util.Map;

// 아직 확정되지 않은 상태에서 개발을 진행하기 위해 메모리를 사용하는 것이므로 테스트용으로만 사용해야 함
public class MemoryMemberRepository implements MemberRepository {
    // 저장소이기 때문에 Map 객체를 하나 만들어 줌
    // 원래는 동시성 이슈가 있을 수 있기 때문에 실무라면 concurrentHashMap을 사용해야 함
    private static Map<Long, Member> store = new HashMap<>();

    // 원래는 오류 처리가 필요하지만 예제이기 때문에 간단하게 작성
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
