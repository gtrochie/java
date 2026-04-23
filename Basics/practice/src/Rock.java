import java.util.Random;
import java.util.Scanner;

public class Rock {
    public static void main(String[] args) throws Exception {
    
        System.out.println("WELCOME TO THE GAME: \n Game Rules: \n 1.rock smashes scissor \n 2.scissor cuts paper \n 3.paper covers rock");
        System.out.println();
        
        String playerOne;
        String computer;
        String [] choices = {"rock", "paper", "scissor"};
        Random random = new Random();
        
        boolean isPlaying = true;
        char gamePlay;
        Scanner scanner = new Scanner(System.in);

        while (isPlaying){
            System.out.print("do yo want to play(y/n)?: ");
            gamePlay = scanner.next().charAt(0);
            
            if (gamePlay == 'n'){
                System.out.println("Game Over");
                isPlaying = false;
            }
            else if (gamePlay == 'y'){
                System.out.print("player 1: (rock,paper,scissor): ");
                playerOne = scanner.next().toLowerCase();
                
                computer = choices[random.nextInt(choices.length)];
                System.out.println("computer choice: " + computer);

                if (playerOne.equals(computer)){
                    System.out.println("It's a tie");
                }
                else if (playerOne.equals("rock") && computer.equals("scissor")){
                    System.out.println("playerOne won");
                }
                else if (playerOne.equals("scissor") && computer.equals("paper")){
                    System.out.println("playerOne won");
                }
                else if (playerOne.equals("paper") && computer.equals("rock")){
                    System.out.println("playerOne won");
                }
                else {
                    System.out.println("computer won");
                }
            }
            else {
                System.out.println("invalid choice");
            }
        }
        scanner.close();
    }
}
    

