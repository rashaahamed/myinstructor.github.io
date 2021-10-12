// Reading files

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.charset.*;

public class ReadFile {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("source", "quotes.txt");
    Charset charset = Charset.forName("UTF-8");
    String pattern = "\\s*(\\s|,|\\.)\\s*";
    String line = null;

    try (BufferedReader br = Files.newBufferedReader(path, charset)) {
      while ((line = br.readLine()) != null) {
        for (String word : line.split(pattern))
          System.out.println(word);
      }
    }
  }
}
