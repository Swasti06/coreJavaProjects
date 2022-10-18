package ExceptionHandling;

public class InvalidAge extends RuntimeException {
	InvalidAge(String message){
		super(message);
	}

}
