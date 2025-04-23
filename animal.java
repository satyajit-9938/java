public class animal {
    public void eat () {
		System.out.println("All animals are eatting");
	}
	  }
class dog extends Animal {
	public void bark () {
		System.out.println("Dog is barking");
	}
}
   class TestInheritance {
	public static void main(String[] args) {
       dog d = new dog();
       d.bark();
       d.eat();

	}

}
