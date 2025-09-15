package org.example.filestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application1 {

  public static void main(String[] args) {
    /* 필터 스트림 (보조 스트림) : 기반 스트림에 추가되어 "성능 향상", "기능 추가"의 역할을 한다.
     * BufferedReader/Writer : 버퍼 공간을 이용하여 데이터를 쌓아두다가 입출력하여
     * 입출력 횟수를 줄이고 성능을 향상 시킨다
     */

    BufferedWriter bw = null;

    try {
      bw = new BufferedWriter(new FileWriter("testBuffered.txt"));
      bw.write("안녕하세요.\n");
      bw.write("안녕하세요.\n");

      /* 버퍼를 이용하는 경우 버퍼가 가득 차면 자동으로 내보내기를 하지만
      * 가득 차지 않은 경우 flush()로 내보내기를 해야 출력이 이루어진다 */
      bw.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (bw != null) {
        try {
          bw.close();
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }
      }
    }


    /* BufferedReader : readLine() 이라는 메소드를 추가로 제공하고 있으며
    버퍼의 한 줄을 읽어와서 문자열로 반환한다.
    * */
    try (BufferedReader br = new BufferedReader(new FileReader("testBuffered.txt"))) {

      String temp;
      while ((temp = br.readLine()) != null) {
        System.out.println(temp);
      }

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
