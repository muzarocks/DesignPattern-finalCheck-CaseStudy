package ObserverPatternPractice;

public class AdminTeamMemberTwo implements INotificationObserver{

	@Override
	public void eventNotification() {
		// TODO Auto-generated method stub
		
		System.out.println("Admin2 : Notified through email");
		System.out.println("Admin2 : Notified through whatsapp");
		System.out.println("Admin2 : Notified through sms");
		
	}

}
