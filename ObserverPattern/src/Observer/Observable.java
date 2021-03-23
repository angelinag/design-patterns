package Observer;

public interface Observable {
	void subscribe(Observer viewer);
	void unsubscribe(Observer viewer);
	void notifyObservers();
	void setExercise(String exercise);
	String getExercise();
}
