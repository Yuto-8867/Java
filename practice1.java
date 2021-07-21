class Practice1 {
  public static void main(String[] args) {

    String name = "Yuto";
    int age = 26;
    double height = 179.8;
    double weight = 89.8;
    double bmi = weight / height / height;

    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("BMI" + bmi + "です");
  }
}