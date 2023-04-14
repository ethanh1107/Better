class Main {
  public static void main(String[] args) {
    int num = 10000;
    subtracting(num);
  }
  public static void subtracting( int number ){
    if( number != 5000){
      System.out.println(number);
      number --;
      subtracting(number);
    }
  }
}