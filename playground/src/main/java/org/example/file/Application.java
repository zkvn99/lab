package org.example.file;

import java.io.File;
import java.io.IOException;

public class Application {

  public static void main(String[] args) {

    /* 대상 파일이 존재하지 않더라도 인스턴스 생성 가능 */
    File file = new File("test.txt");

    try {
      // 파일 생성 후 성공 실패 여부가 반환, 파일이 존재하면 false
      boolean createSuccess = file.createNewFile();
      System.out.println("createSuccess : " + createSuccess);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    System.out.println("file.length() : " + file.length());
    System.out.println("file.getPath() : " + file.getPath());
    System.out.println("file.getParent() : " + file.getParent());
    System.out.println("file.getAbsolutePath() : " + file.getAbsolutePath());

    boolean deleteSuccess = file.delete();
    System.out.println("deleteSuccess : " + deleteSuccess);
  }
}
