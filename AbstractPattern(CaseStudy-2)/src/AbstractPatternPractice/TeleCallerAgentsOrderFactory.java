package AbstractPatternPractice;

public class TeleCallerAgentsOrderFactory implements OrderFactory {
	private String channelName = "TeleCallerAgent";
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
		order = new ElectronicOrder(channelName, "Electronic");
		order.processOrder();

	}

	@Override
	public void orderElectronic() {
		// TODO Auto-generated method stub
		order = new ToysOrder(channelName, "Toys");
		order.processOrder();

	}


}
