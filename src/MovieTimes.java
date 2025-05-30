import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MovieTimes {
   public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
   // Create LinkedList
      LinkedList<String> movies = new LinkedList<>();
      // Create HashSet
      LinkedHashSet<String> moviesTitle = new LinkedHashSet<>();
      // read file name from user
      Scanner input = new Scanner(System.in);
      String fileName = input.next();
      try
      {
          // create an object of Scanner
          Scanner file = new Scanner(new File(fileName));
          // iterate each line in the file
          while (file.hasNextLine())
          {
              // read file until has next line
              String data = file.nextLine();
              movies.add(data); // add movies lines to movies list
              String[] dataArray = data.split(","); // split row by ,
              moviesTitle.add(dataArray[1]); // add titles to moviesTitle list
          }
      }
      catch (FileNotFoundException e)
      {
          e.printStackTrace();
      }
      // format each line
      for (String title : moviesTitle)
      {
          // print title
          System.out.printf("%-44s |", title.substring(0, Math.min(title.length(), 44))); // format left justified
          // string by 44 characters
          String time = "";
          String ratings = "";
          for (String movie : movies)
          {
              String[] dataArray = movie.split(","); // split row by ,
              if (title.equals(dataArray[1]))
              {
                  time = time + dataArray[0] + " "; // append show times separated by space
                  ratings = dataArray[2];
              }
          }
          // print ratings
          System.out.printf(" %5s |", ratings.substring(0, ratings.length())); // format right justified string by 5
          // characters
          // print times
          System.out.printf(" %s", time.substring(0, time.length() - 1)); // format left justified string by 25
          // characters
          System.out.println();
      }
  }
}