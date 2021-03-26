package ObserverPatternPractice;

public class AdminTeamMemberOne implements INotificationObserver{

	@Override
	public void eventNotification() {
		// TODO Auto-generated method stub
		System.out.println("Admin1 : Notified through email");
		System.out.println("Admin1 : Notified through whatsapp");
		System.out.println("Admin1 : Notified through sms");

	}

}
