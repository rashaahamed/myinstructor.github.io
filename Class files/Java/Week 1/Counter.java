// The increment operator (post-unary)

public class Count {
  public static void main(String[] main) {
     int counter = 0;

     for (int i = 0; i < 5; i++) {
       counter++;
       // counter = counter + 1;
       // counter += 1;
     }

     System.out.println(counter); // 5
     System.out.println(counter++); // 5
     System.out.println(counter); // 6
  }
}
