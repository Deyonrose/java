import java.util.Arrays;
import java.util.Scanner;

public class AlphabetWarGame {

    static int leftSideValue = 0;
    static int rightSideValue = 0;
    
    
    static void readInput(){
        System.out.println("Enter the alphabet to start the game");
        Scanner userInput = new Scanner(System.in);
        String k = userInput.nextLine();
       
        System.out.println("the user input is " + k);
        convertString(k);
        userInput.close();
        

    }
    static void convertString(String k){
         char alphaArray[];
         alphaArray = new char[k.length()];
          for(int i=0;i<k.length();i++){
            
            alphaArray[i] = k.charAt(i);
            
          }
          System.out.println(Arrays.toString(alphaArray));
          checkWinner(alphaArray);
    }
    

    static void checkWinner(char alphaArray[]){
        for(int i=0;i<alphaArray.length;i++){
            if(alphaArray[i] == 'w' || alphaArray[i] == 'p' || alphaArray[i] == 'b' || alphaArray[i] == 's'){
                if(alphaArray[i] == 'w'){
                    leftSideValue += 4;
                }else if(alphaArray[i] == 'p'){
                    leftSideValue += 3;
                }else if(alphaArray[i] == 'b'){
                    leftSideValue += 2;
                }else if(alphaArray[i] == 's'){
                    leftSideValue += 1;
                }
            }else if(alphaArray[i] == 'm' || alphaArray[i] == 'q' || alphaArray[i] == 'd' || alphaArray[i] == 'z'){
                if(alphaArray[i] == 'm'){
                    rightSideValue += 4;
                }else if(alphaArray[i] == 'q'){
                    rightSideValue += 3;
                }else if(alphaArray[i] == 'd'){
                    rightSideValue += 2;
                }else if(alphaArray[i] == 'z'){
                    rightSideValue += 1;
                }

            }
        }

        if(leftSideValue>rightSideValue){
            System.out.println("Left side is the winner");

        }else if(leftSideValue<rightSideValue){
            System.out.println("Right side is the winner");

        }else {
            System.out.println("both are tie");
        }
        // System.out.println("the array is " + new String(alphaArray));

    }

    public static void main (String args[]){
        readInput();
        // checkWinner();
    }

}
