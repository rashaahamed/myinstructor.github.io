// The File class

import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class MyFiles {
  public static void main(String[] args) throws IOException {
    Path one = Paths.get("source/java.txt");
    Path two = Paths.get("source/java.txt");

    System.out.println(Files.exists(one));
    System.out.println(one.getFileName());
    System.out.println(Files.isSameFile(one, two));
    System.out.println(Files.size(one));
    System.out.println(Files.getOwner(one));
    System.out.println(Files.getLastModifiedTime(one));
  }
}
