import java.util.Scanner;
import java.util.Arrays;
public class Performance {

   
    static int marks[];
    static int currentHighestNumber = 0;
    static int currentLowestMark=0;
    static int modeFrequency = 0;
    static int modeValue = 0;  

    static void readMarks(){
        int k=10;
        marks = new int[k];
        System.out.println("Enter the marks for "+k+" students");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<k;i++){    
            int inputValue = sc.nextInt();
            if(inputValue>0&&inputValue<=100){
              marks[i]=inputValue;
            }else{
              i--;
              System.out.println("Please add marks between 0 and 100");
            }
        }      
        sc.close();
        System.out.println(Arrays.toString(marks));
        System.out.println("Marks of the students");
        highestMarks();
        
    }

    static void highestMarks(){
        
        for(int i=0;i<marks.length;i++){
            if (currentHighestNumber < marks[i]){
                currentHighestNumber = marks[i];
            }
        }
       
        // System.out.println(Arrays.toString(marks));
        leastMark();
        
    }

    static void leastMark(){
        
        for(int i=0;i<marks.length;i++){        
            if((currentLowestMark > marks[i]) || (i == 0)){
                currentLowestMark = marks[i];
            }       
        }
        // System.out.println(Arrays.toString(marks));
        getModeAndFreq();
    }
   
    static void getModeAndFreq(){
            
        for(int i=0;i<marks.length;i++){        
            int count = 0;
            for(int j=i;j<marks.length;j++){
                if(marks[j] == marks[i]){
                  count++;
                }
            }
               
            if(count > modeFrequency || modeFrequency==0){
                modeFrequency = count;
                if(modeFrequency>1){
                     modeValue = marks[i];
                }
            }  
        } 
        display();
    }
    
    static void display(){
        System.out.println("Highest Mark - " + currentHighestNumber);
        System.out.println("Least mark - " + currentLowestMark);
        if(modeFrequency>1){
            System.out.println("Mode Frequency " + modeFrequency);
            System.out.println("Mode: " + modeValue);
        }else{
            System.out.println("Mode cannot be determined,add atleast two similar marks");
        }
    }
    
    
    public static void main(String args[]){
        readMarks();
    }
}
