
// if inputArray=[3,0,4,6,3]

public static void mystery2(int[] inputArray) {
	int index=0;
	while (index<inputArray.length) {
		int targetIndex=mystery(inputArray, index);
		int temp=inputArray[targetIndex];
		inputArray[targetIndex]=inputArray[index];
		inputArray[index]=temp;
		index=index +1;
	}
}