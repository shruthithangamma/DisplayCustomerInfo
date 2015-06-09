
public class NoSuchCustomerException extends Exception
{
	
	private int custNumber;

	public NoSuchCustomerException()
	{
	}	
		
		public NoSuchCustomerException(int custNumber)
		{
			super("The customer \t"+custNumber+"\t does not exist.");
			this.custNumber = custNumber;
		}

		public int getCustNumber() {
			return custNumber;
		}	
}
