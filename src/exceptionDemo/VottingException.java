package exceptionDemo;

public class VottingException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	VottingException(String message) {
		super(message);

	}
}
