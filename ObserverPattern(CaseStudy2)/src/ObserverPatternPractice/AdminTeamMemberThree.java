package ObserverPatternPractice;

public class AdminTeamMemberThree implements INotificationObserver {

	@Override
	public void eventNotification() {
		// TODO Auto-generated method stub
		System.out.println("Admin3 : Notified through email");
		System.out.println("Admin3 : Notified through whatsapp");
		System.out.println("Admin3 : Notified through sms");
	}

}
