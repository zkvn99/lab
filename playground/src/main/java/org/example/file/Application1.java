package org.example.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Application1 {

  public static void main(String[] args) {
    /* FileInputStream
    File 이라는 외부 자원과 연결되어 1바이트 단위로 입력 받는 스트림 */

    /* 스트림은 사용이 종료되면 반드시 반납되어야 한다. 반납되지 않으면 누수가 발생한다.
    * try with resource 구문은 try 블럭 종료 시 자동으로 자원을 반납한다. */
    try (FileInputStream fis = new FileInputStream("testInputStream.txt")) {

      /* read() : 파일에 기록된 값을 순차적으로 읽어옴
      * 더 이상 읽어올 값이 없을 경우 -1을 반환 */
//      int value;
//      while((value = fis.read()) != -1) {
//        System.out.println((char) value);
//      }

      /* byte 배열을 이용해서 한 번에 데이터를 읽어 올 수 있다. */
      byte[] bar = new byte[100];
      fis.read(bar);
      System.out.println(Arrays.toString(bar));

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
