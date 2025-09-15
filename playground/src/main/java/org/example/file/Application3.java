package org.example.file;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Application3 {

  public static void main(String[] args) {
    /*
      FileOutputStream
      File 이라는 외부 자원으로 1 byte 단위로 출력하는 스트림
     */

    /*
     경로 문제없이 파일이 존재하지 않을 경우에는 파일 자동생성,
     존재하지 않는 경로 포함 시 FileNotFoundException 발생
     생성자의 2번째 인수로 append true를 전달하면 이어쓰기, 기본은 덮어쓰기로 동작
     */
    try (FileOutputStream fos = new FileOutputStream("testOutputStream.txt", true)) {

      fos.write(97);

      byte[] bytes = new byte[] {98, 99, 100, 101, 102, 10};
      fos.write(bytes);

      fos.write(bytes, 1, 3);

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
