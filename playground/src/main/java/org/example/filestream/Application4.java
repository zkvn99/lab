package org.example.filestream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application4 {

  public static void main(String[] args) {
    /* ObjectInputStream/ObjectOutputStream
    객체 단위 입출력 보조 스트림
     */

    Member[] members = {
        new Member("user01", "pass01", 25, '여'),
        new Member("user02", "pass02", 30, '남'),
        new Member("user03", "pass03", 35, '여')
    };

    try (ObjectOutputStream oos
                = new ObjectOutputStream(new FileOutputStream("member.txt"))) {

//      for (Member member : members) {
//        oos.writeObject(member);
//      }
      oos.writeObject(members);

    } catch (IOException e) {
      e.printStackTrace();
    }

    Member[] members2 = new Member[10];

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.txt"))) {

//      for (int i = 0; i < members2.length; i++) {
//        members2[i] = (Member) ois.readObject();
//      }
      members2 = (Member[]) ois.readObject();

    } catch (EOFException e) {
      System.out.println("파일 다읽음");
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    for (Member member : members2) {
      System.out.println(member);
    }
  }
}
