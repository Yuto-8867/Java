import java.util.Scanner;

class practice4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("名前 :");
    String firstName = scanner.next();
    System.out.print("名字 :");
    String lastName = scanner.next();
    System.out.print("年齢 :");
    int age = scanner.nextInt();
    System.out.println("私の名前は" + fullName(firstName,lastName) + "です");
    System.out.println("私の年齢は" + age + "です");
    if(age >= 20) {
      System.out.println("成年者です");
    }else {
      System.out.println("未成年です");
    }
  }

  public static String fullName(String firstName,String lastName) {
    return firstName + " " + lastName;
  }
}
