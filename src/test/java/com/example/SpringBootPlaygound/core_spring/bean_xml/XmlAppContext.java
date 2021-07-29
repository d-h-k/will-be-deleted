package com.example.SpringBootPlaygound.core_spring.bean_xml;

import com.example.SpringBootPlaygound.core_spring.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class XmlAppContext {
    @Test
    void xmlAppContext() {
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService memberService = ac.getBean("memberservice", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

    }
}