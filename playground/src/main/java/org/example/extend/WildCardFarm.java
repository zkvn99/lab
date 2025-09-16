package org.example.extend;

public class WildCardFarm {
  /* 타입 변수가 선언 된 RabbitFarm 객체를 생성할 때 보다 유연하게 WildCard를 활용 */
  public void anyType(RabbitFarm<?> farm) {
    farm.getRabbit().cry();
  }

  public void extendType(RabbitFarm<? extends Bunny> farm) {
    farm.getRabbit().cry();
  }

  public void superType(RabbitFarm<? super Bunny> farm) {
    farm.getRabbit().cry();
  }
}
