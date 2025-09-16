package org.example.generic;

public class Application {

  public static void main(String[] args) {

    /* 제네릭 프로그래밍
     * 데이터 형식에 의존없이 여러 다른 데이터 타입을 가질 수 있는 기술 > 재사용성
     * 1. 컴파일 시 타입 검사를 통한 타입 안정성 확보
     * 2. 반환 값 타입 변환 코드 생략
     */

    /* 타입을 Integer로 생성 */
    GenericTest<Integer> gt1 = new GenericTest<>();
    gt1.setValue(1);
    System.out.println(gt1.getValue());

    /* 타입을 String으로 생성 */
    GenericTest<String> gt2 = new GenericTest<>();
    gt2.setValue("hello");
    System.out.println(gt2.getValue());

    /* 제네릭 없이 생성 */
    GenericTest gt3 = new GenericTest();
    gt3.setValue("generic");
    String str = (String) gt3.getValue();
  }
}
