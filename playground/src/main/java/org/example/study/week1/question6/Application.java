package org.example.study.week1.question6;

public class Application {

  public static void main(String[] args) {

    UserService userService = new UserService();
    try {
      userService.registerUser("kim", 15);
      userService.registerUser("lee", 201);
    } catch (InvalidAgeException exception) {
      System.out.println("예외 처리 : " + exception.getMessage());
    } finally {
      System.out.println("완료");
    }

    FileService fs = new FileService();

    try {
      String data = fs.readUserData("users.txt");
      System.out.println("파일 내용:\n" + data);
    } catch (FileReadException e) {
      System.out.println("파일 예외 처리: " + e.getMessage());
    }

    try {
      callForceThrow(fs);
    } catch (FileReadException e) {
      System.out.println("위임된 예외 처리: " + e.getMessage());
    }
  }

  private static void callForceThrow(FileService fs) throws FileReadException {
    fs.forceThrow();
  }
}
