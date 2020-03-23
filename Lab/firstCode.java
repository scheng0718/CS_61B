public class firstCode {
	public static void main(String [] args) {
		int size=27;			//declare an integer variable named size and give it the value 27
		String name ="Fido";	//declare a string of character of variable nameed "name" and assign the value "Fido"
		Dog myDog = new Dog(name,size);  //decalre a new Dog variable "myDog" and make new dog using "name" and "size"
		int x=size -5;			//substract 5 from size 27, and assign it to a variable x
		if (x<15) {				//If value of x (22) is less than 15, tell the dog to bark times								
			myDog.bark(8);
		}

		while (x>3) {			//keep looping as long as x is greater than 3
			x-=1;				//execute the loop from 22,21,20...til the value is equal to 3
			myDog.play();		//tell the Dog to play
		}

		int[] numList = {2,4,6,8}; //declare a list of integers variable "nuLinst" and put 2,4,6,8 into the list
		System.out.print("Hello"); //print out hello
		System.out.println("Dog: "+name); 	//next line, print out Dog: Fido

		System.out.println(numList[1]);		//print out the second number in the listm which is 4
		if (numList[3] ==8) {				//if the final number of the list is 8
			System.out.println("potato");	//print out the potato
		}

	}
}
