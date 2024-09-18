package com.example.shop4.dto;

import com.example.shop4.entity.Member;
import com.example.shop4.entity.OrderStatus;
import com.example.shop4.entity.Payment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OrdersDto {
    private Long orderId; // 주문 ID
    private String buyerName; // 구매자 이름
    private String buyerPhone; // 구매자 전화번호
    private String buyerAddress; // 구매자 주소
    private String buyerPostCode; // 구매자 우편번호
    private BigDecimal orderPrice; // 주문 가격
    private OrderStatus orderStatus; // 주문 상태
    private LocalDateTime orderDate; // 주문 날짜
    private Member member; // 회원 정보
    private Payment payment; // 결제 정보
}