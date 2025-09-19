package org.example.shop;

public class OrderItem {
  private final String name;    // 상품명
  private final int quantity;   // 구매수량
  private final int unitPrice;  // 개당가격

  public OrderItem(String name, int quantity, int unitPrice) {
    this.name = name;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getUnitPrice() {
    return unitPrice;
  }

  public int lineTotal() {
    return quantity * unitPrice;
  }

}
