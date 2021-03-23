package Observer;

import java.util.ArrayList;
import java.util.List;

public class Instructor implements Observable {
	private List<Observer> viewers;
	private String exercise;
	
	public Instructor() {
		this.viewers = new ArrayList<>();
	}
	
	@Override
	public void subscribe(Observer viewer) {
		this.viewers.add(viewer);
	}

	@Override
	public void unsubscribe(Observer viewer) {
		this.viewers.remove(viewer);

	}

	@Override
	public void notifyObservers() {
		for (Observer viewer : this.viewers) {
			viewer.update();
		}
	}

	@Override
	public void setExercise(String exercise) {
		this.exercise = exercise;
		this.notifyObservers();
	}
	
	//
	public String getExercise() {
		return this.exercise;
	}
}
