package com.vanita.lamdaexamples.javabrains;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting myLambdaGreeting = () -> System.out.println("Hello World ..");
		greeter.greet(myLambdaGreeting);
		
		
		//Anonymous Inner class
		Greeting anonymous = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World Anonymous..");
			}
		};
		greeter.greet(anonymous);
	}
}
