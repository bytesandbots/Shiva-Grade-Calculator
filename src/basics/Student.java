package basics;

public class Student {
	public int age;
	public String name;
	public int grade;
	public String username;
	public float[] grades;
	private int position;
	public Student(String n, int a) {
		age=a;
		name=n;
		grades=new float[10];
		
	}
	public void add_grade(float new_grade) {
		grades[position]=new_grade;
		position++;
	}
	public float return_avg_grades() {
		float sum=0;
		for(int i=0;i<position;i++) {
			sum=sum+grades[i];
		}
		sum=sum/position;
		return sum;
	}
	public void add_details(int g, String user) {
		grade=g;
		username=user;
	}
	
}
