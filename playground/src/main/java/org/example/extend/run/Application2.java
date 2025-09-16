package org.example.extend.run;

import org.example.extend.Bunny;
import org.example.extend.MethodFarm;
import org.example.extend.Rabbit;
import org.example.extend.Snake;

public class Application2 {

  public static void main(String[] args) {
    /* 메소드 매개변수 제네릭 제약을 사용 가능 */
    MethodFarm methodFarm = new MethodFarm();

    /* 별도의 제약 없이 인자를 전달 가능 */
    methodFarm.animalType(new Bunny(), new Bunny());
    methodFarm.animalType(new Snake(), new Snake());

    /* extends Mammal 제약이 적용 */
//    methodFarm.mammalType(new Snake());
    methodFarm.mammalType(new Rabbit());

    /* extends Reptile 제약이 적용 */
    methodFarm.reptileType(new Snake());
//    methodFarm.reptileType(new Rabbit());
  }
}
