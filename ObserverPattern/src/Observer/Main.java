package Observer;

public class Main {

	public static void main(String[] args) {
		Observable instructor = new Instructor();
		
		Observer FirstObserver = new Viewer("Alex", instructor);
		Observer SecondObserver = new Viewer("Anna", instructor);
		Observer ThirdObserver = new Viewer("Angel", instructor);
		
		System.out.println("All participants doing first exercise: ");
		instructor.setExercise("jumping");
		System.out.println("All participants doing second exercise: ");
		instructor.setExercise("squats");
	}
}
