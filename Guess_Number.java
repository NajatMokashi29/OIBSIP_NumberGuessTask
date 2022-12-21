import java.util.Random;
import java.util.Scanner;

class Guess_No {

  void guess_no() {
    Scanner sc = new Scanner(System.in);
    int score = 0;
    int gnum, count = 1;

    Random rand = new Random();
    int rnum = rand.nextInt(100);

    System.out.println("enter the guess number");
    gnum = sc.nextInt();

    if (rnum == gnum) {
      System.out.println("the number guessed correctly");
    } else if (gnum != rnum) {
      while (gnum != rnum) {
        if (rnum > gnum) {
          System.out.println("the number is greater than " + gnum);
          System.out.println("enter the  number greater than " + gnum);
          System.out.println("try again :");
          gnum = sc.nextInt();
          count++;
        } else if (rnum < gnum) {
          System.out.println("the number is less than" + gnum);
          System.out.println("enter the  number less than " + gnum);
          System.out.println("try again :");
          gnum = sc.nextInt();
          count++;
        }
      }
      if (gnum == rnum) {
        System.out.println(
          "Number Guessed correctly  in " + count + "attempts"
        );
      }
    }
    switch (count) {
      case 1:
        score = 50;
        System.out.println("Score :" + score);
        break;
      case 2:
        score = 40;
        System.out.println("Score :" + score);
        break;
      case 3:
        score = 30;
        System.out.println("Score :" + score);
        break;
      case 4:
        score = 20;
        System.out.println("Score :" + score);
        break;
      case 5:
        score = 10;
        System.out.println("Score :" + score);
        break;
      default:
        score = 0;
        System.out.println(
          "Score : " + 0 + " because number is not guessed within 5....\n"
        );
        break;
    }
  }
}

class Guess_Number {

  public static void main(String[] args) {
    Guess_No g = new Guess_No();
    g.guess_no();
  }
}
