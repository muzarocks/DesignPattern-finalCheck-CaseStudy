package ObserverPatternPractice;

public interface INotificationService {

	
	public void subscribe(INotificationObserver observer);
	public void unsubscribe(INotificationObserver observer);
}
