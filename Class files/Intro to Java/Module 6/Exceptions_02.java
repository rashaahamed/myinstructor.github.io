// Exceptions

import java.util.*;
import java.text.*;

/*
 * The most commom checked exceptions are: ParseException, IOException,
 * FileNotFoundException, SQLException
 *
 * The most specific exception have to be caught first, otherwise a
 * compile-time error is generated
 */

public class Exceptions {
  public static void main(String[] args) {
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
      Date date = sdf.parse("01-10");
      System.out.println(date);
    } catch (ParseException e) {
      System.out.println("Specific exception: " + e);
    } catch (Exception e) {
      System.out.println("General exception: " + e);
    }
  }
}
