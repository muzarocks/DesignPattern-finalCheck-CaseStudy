package AbstractPatternPractice;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		OrderFactory orderFactory1 = new ECommerceWebsiteOrderFactory();
		
		OrderFactory orderFactory2 = new TeleCallerAgentsOrderFactory();
		
		orderFactory1.orderElectronic(); // This will order electronic goods through Ecommerce website channel
		
		orderFactory2.orderFurniture(); // This will order furniture through teleCaller Agents

		
	}

}
