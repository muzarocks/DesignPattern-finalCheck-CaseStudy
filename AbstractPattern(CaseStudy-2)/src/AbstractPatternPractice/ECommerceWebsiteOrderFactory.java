package AbstractPatternPractice;

public class ECommerceWebsiteOrderFactory implements OrderFactory {

	private String channelName = "EcommerceWebsite";
	private Order order;

	@Override
	public void orderFurniture() {
		// TODO Auto-generated method stub
		order = new FurnitureOrder(channelName, "Furniture");

		order.processOrder();
	}

	@Override
	public void orderToys() {
		// TODO Auto-generated method stub
		order = new ElectronicOrder(channelName, "Toys");
		order.processOrder();

	}

	@Override
	public void orderElectronic() {
		// TODO Auto-generated method stub
		order = new ToysOrder(channelName, "Electronic");
		order.processOrder();

	}

}
