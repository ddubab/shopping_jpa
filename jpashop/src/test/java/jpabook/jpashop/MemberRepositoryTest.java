package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    public void testMember() {
//        Member member = new Member();
//        member.setUsername("memberA");
//        //Long savedId = memberRepository.save(member);
//
//        //Member findMember = memberRepository.find(savedId);
//
//        Assertions.assertEquals(findMember.getId(), savedId);
//        Assertions.assertEquals(member, findMember);
//        Assertions.assertEquals(findMember.getUsername(), member.getUsername());
    }

}