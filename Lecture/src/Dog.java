public class Dog {
	public int weightInPounds;
	public static String binomen="Canis familiaris";
	//One integer constructor for dogs. When dogs class with a integer, the method will be called
	public Dog(int w){					//using consturctor to construct a object 
		weightInPounds = w;

	}

	public void makeNoise() {	//simply define what dog can do, namely make noise
		if (weightInPounds < 10) {
			System.out.println("Yip!");
		}
		else
			if (weightInPounds < 30) {
				System.out.println("bark!");
			}
			else {
				System.out.println("woooof!");
			}	
	}

	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.weightInPounds > d2.weightInPounds) 
			return d1;
		return d2;
	}

	public Dog maxDog(Dog d2)	{
		if (this.weightInPounds>d2.weightInPounds) {
			return this;
		}
		return d2;
	}
}


