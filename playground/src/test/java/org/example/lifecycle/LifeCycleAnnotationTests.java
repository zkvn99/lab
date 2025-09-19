package org.example.lifecycle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifeCycleAnnotationTests {
  /* 테스트 메소드의 실행 전 후에 동작하는 어노테이션을 사용 */

  /* 테스트 수행 전 필요한 자원을 설정하는 역할의 메소드 */
  @BeforeAll
  static void beforeAll() {
    System.out.println("before all 동작");
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("before each 동작");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("after all 동작");
  }

  @AfterEach
  void afterEach() {
    System.out.println("after each 동작");
  }

  @Test
  void test1() {
    System.out.println("테스트 코드1");
  }

  @Test
  void test2() {
    System.out.println("테스트 코드2");
  }
}
