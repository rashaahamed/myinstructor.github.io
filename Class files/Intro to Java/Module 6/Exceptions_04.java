// Exceptions
// Try-with-resources

import java.io.*;

public class Exceptions {
  public static void main(String[] args) throws IOException {
    File file = new File("source/text.txt");

    // catch and finally are not manadatory in try-with-resources
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
      String content = "Hey, I am a try-with-resources";
      bw.write(content);
    }
  }
}
