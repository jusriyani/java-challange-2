import java.util.Scanner; //import the Scanner class
public class InputNilai {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int score;

    //enter your score and press enter
    System.out.println("*********************");
    System.out.println("Enter your score" + ":");
    score = sc.nextInt();
    
    //view the score description
    System.out.println("Here are the Grade" + "\n");
    System.out.println("A" + "\t" + ": " + "91 - 100" + "\n" 
    + "B" + "\t" + ": " + "76 - 90" + "\n" 
    + "C" + "\t" + ": " + "51 - 75" + "\n"
    + "D" + "\t" + ": " + "26 - 50" + "\n"
    + "E" + "\t" + ": " + "0 - 25" + "\n");

    //condtion
    if(score >= 0 && score <= 25){
        System.out.println("You got E");
    }else if(score >= 26 && score <= 50){
        System.out.println("You got D");
    }else if (score >= 51 && score <= 75){
        System.out.println("You got C");
    }else if (score >= 76 && score <= 90){
        System.out.println("You got B");
    }else if (score >= 91 && score <= 100){
        System.out.println("You got A");
    }else if (score >=100){
        System.out.println("You enter the invalid score");
    }
    System.out.println("*********************");
    }
}