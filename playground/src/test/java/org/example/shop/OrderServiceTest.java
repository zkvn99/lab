package org.example.shop;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* OrderService 에 대한 단위 테스트 */
class OrderServiceTest {

  private OrderService orderService;

  @BeforeEach
  void setUp() {
    orderService = new OrderService();
  }

  @Test
  @DisplayName("정상 주문 생성")
  void placeOrder_success() {
    // given
    List<OrderItem> items = List.of(
        new OrderItem("짜장면", 2, 10000),
        new OrderItem("짬뽕", 1, 12000)
    );

    // when
    Order order = orderService.placeOrder(items);

    // then
    assertNotNull(order);
    assertEquals(2, order.getItems().size());
    assertEquals(32000, order.totalPrice());
    Assertions.assertThat(order.getCreatedAt()).isNotNull();
    Assertions.assertThat(order.getId()).isPositive();
  }

  @Test
  @DisplayName("검증 실패 : 비어있는 주문")
  void placeOrder_fail_empty() {
    // given
    List<OrderItem> items = List.of();

    // when & then
    IllegalArgumentException ex = assertThrows(
        IllegalArgumentException.class,
        () -> orderService.placeOrder(items)
    );

    assertTrue(ex.getMessage().contains("주문 항목이 비어있습니다."));
  }

  @Test
  @DisplayName("검증 실패 : 수량/가격 규칙 위반")
  void placeOrder_fail_rule() {
    //given
    List<OrderItem> items = List.of(
        new OrderItem("짜장면", 0, 10000),
        new OrderItem("짬뽕", 1, -1)
    );

    // when & then
    Assertions.assertThatThrownBy(
        () -> orderService.placeOrder(items)
    ).isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("수량")
        .hasMessageContaining("가격");
  }
}