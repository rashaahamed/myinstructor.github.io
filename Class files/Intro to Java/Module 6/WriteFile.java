// Writing files

import java.io.*;
import java.nio.*;
import java.time.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.time.format.*;

public class WriteFile {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("source", "timestamp.txt");
    Charset charset = Charset.forName("UTF-8");

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss, dd/MM/yyyy");

    try (BufferedWriter bw = Files.newBufferedWriter(path, charset)) {
      String content = "Last update: " + dtf.format(now);
      bw.write(content);
    }
  }
}
