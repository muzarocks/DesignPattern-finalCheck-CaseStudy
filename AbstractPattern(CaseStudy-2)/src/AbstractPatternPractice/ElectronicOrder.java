package AbstractPatternPractice;

public class ElectronicOrder extends Order{

	public ElectronicOrder(String channel, String productType)
	{
		super(channel,productType);
	}
	
	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		
		System.out.println(getProductType()+" has been ordered through "+getChannel());
		
	}

}
