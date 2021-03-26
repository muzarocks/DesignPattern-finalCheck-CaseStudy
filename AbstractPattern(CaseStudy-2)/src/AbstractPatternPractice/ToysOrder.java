package AbstractPatternPractice;

public class ToysOrder extends Order{

	public ToysOrder(String channel, String productType) {
		super(channel, productType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println(getProductType()+" has been ordered through "+getChannel());

	}

}
