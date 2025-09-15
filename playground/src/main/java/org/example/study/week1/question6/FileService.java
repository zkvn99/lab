package org.example.study.week1.question6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

  public String readUserData(String path) throws FileReadException {
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      StringBuilder sb = new StringBuilder();
      String line;
      while ((line = br.readLine()) != null) {
        sb.append(line).append(System.lineSeparator());
      }
      return sb.toString();
    } catch (IOException e) {
      throw new FileReadException("파일 경로 [" + path + "]를 읽을 수 없습니다.", e);
    }
  }

  public void forceThrow() throws FileReadException {
    throw new FileReadException("의도적으로 던진 Checked 예외");
  }
}
