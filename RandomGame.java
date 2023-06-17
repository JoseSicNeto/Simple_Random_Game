package random;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
														//Class Your_Value = Asks for a Number.
class Your_Value {
	int num;
	Scanner type_it = new Scanner(System.in);
	public int Type() {
        while (true) {									//Check Until You Enter a Numeric Value.
        	try{
        		System.out.print("Enter the Value: "); 
        		num = type_it.nextInt();
        		break;
        	}catch(InputMismatchException e) {						//Exception For Value not Numeric.
        		System.out.println("\nThis Value is Not Numeric.");
        		type_it.next();
        	}
        }
        return num;	
    }
	public void CloseScan() {
		type_it.close();
	}
}
														//Class Generator_Value = Generate a Target Value (1 to 1000).

class Generator_Value {
    public int Value() {
        Random random = new Random();
        int target = random.nextInt(1000) + 1; 
        return target;
    }
}
														//Class Comparator = Compares the Entered Value to the Target Value.

class Comparator {
	public void CompareValues(int num, int target) {	//Get the Values of the Other Classes.
		while (num != target) {							//Loops Until it Hits the Target Value.
			if (num > target) {
				System.out.println("Entered Value was Less than your Target. Try again");
			} else {						 
				System.out.println("Entered Value was Greater than your Target. Try again");
	        }

			Your_Value value = new Your_Value();	//Calls a Module from Another Class.
	        num = value.Type();
	        }
		System.out.println();															//Skip a Line			 
		System.out.println("Congratulations! You Hit the Target Value: " + target);
	}
}
														//Class RandomGame = Run Program.

public class RandomGame {	
	public static void main(String[] args) {
		Start();		
		}
													//Introduction.
	public static void Start() {				
		System.out.println("DESCOVER THE TARGET VALUE");
		System.out.println(); 
		
		Your_Value value = new Your_Value();	
		int num = value.Type();
			
		Generator_Value random = new Generator_Value();		//Calls Methods of the Classes.
       	int target = random.Value();
        
		Comparator comparator = new Comparator();
       	comparator.CompareValues(num, target);
       	value.CloseScan();
	}
}