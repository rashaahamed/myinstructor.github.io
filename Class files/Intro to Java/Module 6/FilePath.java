// Paths

/*
 * A Path instance represents a path in the file system. A path can point to
 * either a file or directory
 */

import java.nio.*;
import java.nio.file.*;

public class FilePath {
  public static void main(String[] args) {
    // Path path = Paths.get("source/java.txt");
    Path path = Paths.get("source", "java.txt");

    System.out.println(path.toString());
    System.out.println(path.isAbsolute());
    System.out.println(path.getFileName());
    System.out.println(path.getNameCount());
    System.out.println(path.getName(0));
    System.out.println(path.getName(1));
  }
}
