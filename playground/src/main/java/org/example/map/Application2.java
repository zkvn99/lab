package org.example.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

  public static void main(String[] args) {
    /* pProperties : 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용 */
    Properties properties = new Properties();

    properties.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
    properties.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
    properties.setProperty("user", "student");
    properties.setProperty("password", "student");

    System.out.println(properties);

    try {
      properties.store(new FileOutputStream("driver.dat"), "jdbc driver");
      properties.store(new FileWriter("driver.txt"), "jdbc driver");
      properties.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
    } catch (IOException e) {
      e.printStackTrace();
    }

    Properties properties2 = new Properties();

    try {
      properties2.load(new FileInputStream("driver.dat"));
//      properties2.load(new FileReader("driver.txt"));
//      properties2.loadFromXML(new FileInputStream("driver.xml"));

      /* Properties의 모든 키 값 목록을 대상 스트림으로 내보내기 함 */
      properties2.list(System.out);
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println(properties.getProperty("driver"));
    System.out.println(properties.getProperty("url"));
    System.out.println(properties.getProperty("user"));
    System.out.println(properties.getProperty("password"));
  }
}
