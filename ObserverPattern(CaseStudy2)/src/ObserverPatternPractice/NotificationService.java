package ObserverPatternPractice;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> observers = new ArrayList<INotificationObserver>();
	
	
	@Override
	public void subscribe(INotificationObserver observer) {
		// TODO Auto-generated method stub
		
		observers.add(observer);
		
	}

	@Override
	public void unsubscribe(INotificationObserver observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}
	
	
	
	
	public void notifyAdmin()
	{
		for(INotificationObserver observer: observers)
		{
			observer.eventNotification();
		}
	}

}
