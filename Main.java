import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Eleman sayısı giriniz: ");
    int n = input.nextInt();
    System.out.println("r değeri giriniz: ");
    int r = input.nextInt();
    int total = 1;
    int total2 = 1;
    int a= 1;
    long sonuc;

    for(int i=1 ; i<= n ; i++) {
      total = total * i;
    }
    for(int b=1 ; b<= r ; b++) {
      total2 = total2 * b;
    }

    for(int x=1 ; x<= (n-r) ; x++) {
      a = a * x;
    }
    sonuc = total / (total2 * a);
    System.out.println("Kombinasyon değeri: " + sonuc);

    
  }
}