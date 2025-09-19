package org.example.shop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/* 주문 서비스 : 주문 항목을 받아 Order를 만들고 List(메모리)에 저장 */
public class OrderService {

  /* 프로그램이 실행되는 동안만 주문을 보관하는 저장소 */
  private final List<Order> orders = new ArrayList<>();

  /* 주문 번호 카운팅용 변수 */
  private long sequence = 0;

  /* 주문 생성 : 검증 -> 번호 발급 -> 생성 시간 기록 -> 저장 */
  public Order placeOrder(List<OrderItem> items) {
    validate(items);

    sequence++; // 주문 번호 증가

    Order order = new Order(
        sequence, items, LocalDateTime.now()
    );

    orders.add(order);

    return order;
  }

  /* 전체 주문 목록 조회 */
  public List<Order> list() { return orders; }

  /* 입력 검증 전용 private 메소드 */
  private void validate(List<OrderItem> items) {
    if (items == null || items.isEmpty()) {
      throw new IllegalArgumentException("주문 항목이 비어있습니다.");
    }

    boolean invalid = items.stream()
        .anyMatch(i -> i.getQuantity() <= 0 || i.getUnitPrice() < 0);

    if (invalid) {
      throw new IllegalArgumentException("수량은 1 이상, 가격은 0 이상이어야 합니다.");
    }
  }
}
