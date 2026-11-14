package com.springboot.order.dto;

import com.springboot.member.entity.Member;
import lombok.Getter;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import java.util.List;

@Getter
public class OrderPostDto {
    @Positive
    private long memberId;

    @Valid
    private List<OrderCoffeeDto> orderCoffees;

    public Member getMember() {
        Member member = new Member();
        member.setMemberId(memberId);
        return member;
    }
}
