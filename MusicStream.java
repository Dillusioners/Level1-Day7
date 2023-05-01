import java.util.*;

/*
    Author: LeeTuah
    Program: Music Streaming service
    For: SuperB league event
*/

public class MusicStream {
    // prints all the songs in the array
    public static void printSongs(String arr[]) throws InterruptedException{
        System.out.println("Great! We have some great songs to recommend you!");
        // iterates through the array
        for(int i = 0; i < 4; i++){
          System.out.println((i + 1) + ". " + arr[i]);
        }
        Thread.sleep(5000);
        System.exit(0);
    }
    public static void main(String args[]) throws InterruptedException{
      Scanner sc = new Scanner(System.in);
      String answer;
      
      // declaring all the songs
      String rapSongs[] = {"Ballin", "Rap God", "Goosebumps", "Save that sh*t"};
      String lofiSongs[] = {"ily", "Play Date", "Get you to the Moon", "Can we Kiss Forever?"};
      String otherSongs[] = {"MOONLIGHT", "Space Cadet", "Minecraft music discs", "See me falling"};
      System.out.println("#################################");
      System.out.println("  WELCOME TO DILLUSIONERS MUSIC");
      System.out.println("#################################");
      
      // asking user if he likes the songs
      System.out.print("Do you like rap?(Y/n): ");
      answer = sc.next();
      if(answer.charAt(0) == 'y'){
        printSongs(rapSongs);
      }
      
      System.out.print("Alright. Do you like lofi songs?(Y/n): ");
      answer = sc.next();
      if(answer.charAt(0) == 'y'){
        printSongs(lofiSongs);
      }
      sc.close();
      // runs when if he doesnot like any of the categories
      System.out.println("Based on your dislike for both rap and lofi categories, the following songs are chosen");
      printSongs(otherSongs);
    }
}
