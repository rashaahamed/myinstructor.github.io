// Reading files

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.charset.*;

public class ReadFile {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("source", "continents.txt");
    Charset charset = Charset.forName("UTF-8");
    String word = null;

    try (BufferedReader br = Files.newBufferedReader(path, charset)) {
      while ((word = br.readLine()) != null) {
        System.out.println(word);
      }
    }
  }
}
