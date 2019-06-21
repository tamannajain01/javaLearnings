
public class Student {
	
	// INSTANCE VARIABLES
	private int roll;
	private String name;
	private int marks[]=new int[3];
	
	//CONSTRUCTORS
	 Student(int roll,String name,int marks[]){
		this(roll,name);
		this.marks=marks;
	}
	 Student(int roll,String name){
		this.roll=roll;
		this.name=StringUtil.titleCase(name);
	}
	Student() {
		System.out.println("please enter the appropriate fields");
	}
	
	//METHODS
	public double percentage() {
		return (total()/3);
	}
	public int total() {
		int sum=0;
		for(int i=0;i<marks.length;i++)
			sum+=marks[i];
		return sum;
	}
	public char grade(){
		double per=percentage();
		if(per>=90)
			return 'A';
		else if(per<90 && per>=70)
			return 'B';
		else if(per<70 && per>=60)
			return 'C';
		else
			return 'D';
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =StringUtil.titleCase(name);
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>=0 && marks[i]<=95)
				this.marks[i]=marks[i]+5;
		}
	}
	public int getRoll() {
		return roll;
	}
	public String print()
	{
		String markstr="";
		for(int i=0;i<marks.length;i++)
			markstr+=marks[i] + " ";
		return "Roll No :"+getRoll()+"\nName :"+getName()+"\nMarks :"+markstr+"\nTotal Marks :"+total()
		+"\nPercentage :"+percentage()+"\nGrade :"+grade();
	}
}
