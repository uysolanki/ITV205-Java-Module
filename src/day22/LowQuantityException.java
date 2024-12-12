package day22;

public class LowQuantityException extends RuntimeException
{
	String errorMessage;
	public LowQuantityException(String errorMessage)
	{
	super(errorMessage);
	}
}
