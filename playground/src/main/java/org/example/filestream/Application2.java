package org.example.filestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application2 {

  public static void main(String[] args) {
    /* InputStreamReader, OutputStreamWriter : 형변환 보조 스트림
     * 기반 스트림이 byte 스트림이고 보조 스트림이 char 스트림인 경우 변환을 위해 사용
     */

    /* 표준 스트림
     * 자바에서는 콘솔, 키보드 같은 표준 입출력 장치로부터 데이터를 입출력하기 위해
     * System.in, System.out, System.err와 같은 형태로 표준 스트림을 제공하고 있다.
     * 자주 사용되는 자원에 대해 미리 생성해둔 스트림
     */

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.print("문자열 입력 : ");
      String value = br.readLine();
      System.out.println("입력 받은 문자열 : " + value);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    /* 출력을 위해 동일한 방식을 사용 가능 */
    try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
      bw.write("출력 테스트");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
