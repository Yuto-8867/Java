class Person {

  public static int count = 0;
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return firstName + " " + lastName;
  }

  public double bmi() {
    return weight / height / height;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("私の年齢は" + this.age + "です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public static void printCount() {
    System.out.println("合計は" + Person.count + "人です");
  }
}
