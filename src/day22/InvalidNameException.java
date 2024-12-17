package day22;

public class InvalidNameException extends RuntimeException
{
	String errorMessage;
	public InvalidNameException(String errorMessage)
	{
	super(errorMessage);
	}
}
