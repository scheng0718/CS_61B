public class DogLauncher {
	public static void main(String[] args) {
		Dog d = new Dog(20);			//instantiate a dog using the new keyword

		Dog d2 = new Dog(100);

		//Dog bigger = Dog.maxDog(d,d2);

		Dog bigger=d.maxDog(d2);

		bigger.makeNoise();
		//d.makeNoise();			//called d.makeNoise() instead of Dog.makeNoise()
		System.out.println(Dog.binomen);
		
	}
}
