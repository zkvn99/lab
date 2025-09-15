package org.example.filestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

  public static void main(String[] args) {
    /* DataInputStream/DataOutputStream
    데이터 입출력 보조 스트림 (Java의 데이터 타입 단위로 입출력)
     */

    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.txt"))) {
      dos.writeUTF("홍길동");
      dos.writeInt(95);
      dos.writeChar('A');

      dos.writeUTF("유관순");
      dos.writeInt(85);
      dos.writeChar('B');

      dos.writeUTF("장보고");
      dos.writeInt(75);
      dos.writeChar('C');
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    try (DataInputStream dis = new DataInputStream(new FileInputStream("score.txt"))) {

      /* 파일에 기록된 순서대로 읽어오지 않는다면 의미 없는 데이터를 읽음 */
      while(true) {
        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
      }
    } catch (EOFException e) {
      /* read 자료형() 메소드는 파일에서 더 이상 긁어올 값이 없는 경우
      * EOF를 발생시킨다*/
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
