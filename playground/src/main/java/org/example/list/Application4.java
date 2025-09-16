package org.example.list;

import java.util.Stack;

public class Application4 {

  public static void main(String[] args) {
    /* Stack */
    Stack<Integer> integerStack = new Stack<>();

    /* Vector를 상속했기 때문에 add 메소드를 사용할 수 있으니
    * Stack의 사용 방법에 맞도록 push 메소드를 통해 데이터를 추가하는 것을 권장
    * */
//    integerStack.add(1);
    integerStack.push(1);
    integerStack.push(2);
    integerStack.push(3);
    integerStack.push(4);
    integerStack.push(5);

    System.out.println("integerStack : " +  integerStack);

    /* stack에서 요소를 찾을 때 : search
    * 인덱스가 아닌 위에서부터 순번을 반환
    * 가장 상단에 쌓인 요소는 1을 반환 */
    System.out.println(integerStack.search(3));

    /* 스택에서 요소를 꺼내는 메소드
    * peek : 가장 마지막(상단)에 있는 요소 반환
    * pop : 가장 마지막(상단)에 있는 요소 제거 후 반환
    * */
    System.out.println("peek : " + integerStack.peek());
    System.out.println("integerStack : " + integerStack);

    System.out.println("pop : " + integerStack.pop());
    System.out.println("integerStack : " + integerStack);

    System.out.println("pop : " + integerStack.pop());
    System.out.println("pop : " + integerStack.pop());
    System.out.println("pop : " + integerStack.pop());
    System.out.println("pop : " + integerStack.pop());

    /* stack에 담긴 요소가 없으나 꺼내게 되면 java.util.EmptyStackException 발생 */
    System.out.println("pop : " + integerStack.pop());
  }
}
