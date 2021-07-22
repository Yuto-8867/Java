class Practice2 {
  public static void main(String[] args) {
    int[] numbers = {1,4,6,9,13,16};

    int oddSum = 0;
    int evenSum = 0;

    for(int number: numbers) {
      if(number % 2 == 0) {
        evenSum += number;
      }else {
        oddSum += number;
      }
    }

    System.out.println("奇数の合計は" + oddSum + "です");
    System.out.println("偶数の合計は" + evenSum + "です");
  }
}
