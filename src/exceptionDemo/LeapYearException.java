package exceptionDemo;

public class LeapYearException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LeapYearException(String msg)
	{
		super(msg);
	}
}
