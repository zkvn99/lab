package org.example.extend.run;

import org.example.extend.Bunny;
import org.example.extend.DrunkenBunny;
import org.example.extend.Rabbit;
import org.example.extend.RabbitFarm;
import org.example.extend.WildCardFarm;

public class Application3 {

  public static void main(String[] args) {
    /* wildcard 테스트 */
    WildCardFarm wildCardFarm = new WildCardFarm();

    /* 매개변수 타입에 제약이 없는 경우
    * 어떤 타입의 토끼를 보유한 토끼 농장이던 인자로 전달 가능 */
    wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
    wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
    wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

    /* 매개변수 타입이 바니이거나 바니 후손 토끼를 가진 농장만 인자로 전달 가능 */
//    wildCardFarm.extendType(new RabbitFarm<>(new Rabbit()));
    wildCardFarm.extendType(new RabbitFarm<>(new Bunny()));
    wildCardFarm.extendType(new RabbitFarm<>(new DrunkenBunny()));

    /* 매개변수 타입이 바니이거나 바니 상위 타입의 토끼를 가진 농장만 인자로 전달 가능 */
    wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
    wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
    wildCardFarm.superType(new RabbitFarm<>(new DrunkenBunny()));
//    wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
  }
}
