package ObserverPatternPractice;

public class Main {

	private static int ticketsBooked =0;
	

	public static void bookTickets()
	{
		ticketsBooked++;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AdminTeamMemberOne observer1 = new AdminTeamMemberOne();
		
		AdminTeamMemberTwo observer2 = new AdminTeamMemberTwo();
		
		AdminTeamMemberThree observer3 = new AdminTeamMemberThree();
		
		NotificationService notificationService = new NotificationService();

		notificationService.subscribe(observer1);
		notificationService.subscribe(observer2);
		notificationService.subscribe(observer3);
		
		//when more than 100 tickets will booked all team member will be notified
		for(int i=1; i<=101;i++)
		{
			bookTickets();
			
			if(ticketsBooked > 100)
			{
				notificationService.notifyAdmin();
			}
				
		}
		
		System.out.println("----------------------------------------------");
		//unsubscribing admin team member 2
		notificationService.unsubscribe(observer2);
		
		ticketsBooked =0;
		
		//now only admin team membe 1 and 3 will be notified
		for(int i=1; i<=101;i++)
		{
			bookTickets();
			
			if(ticketsBooked > 100)
			{
				notificationService.notifyAdmin();
			}
				
		}
		
	}

}
