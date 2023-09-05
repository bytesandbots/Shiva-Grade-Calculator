package basics;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Random rand=new Random();
		Student John=new Student("John",13);
		for(int i=0;i<10;i++) {
			float r_grade=rand.nextFloat(2)+8.0F;
			John.add_grade(r_grade);
		}
		float avg=John.return_avg_grades();
		System.out.println(avg);
	}

}
