package Question1;
interface Sayable{
	String say(String message);
}

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable sayable=(message)->"Hell,"+message+"!";
		System.out.println(sayable.say("Vishal"));

	}

}
