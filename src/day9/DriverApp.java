package day9;

public class DriverApp {

	public static void main(String[] args) {
				
		Student batch[]=new Student[4];
		for(int i=0;i<batch.length;i++)
		{
			batch[i]=new Student();
			batch[i].acceptStudent();
		}
		
		for(int i=0;i<batch.length;i++)
		{
			batch[i].displayStudent();
		}
		

	}

}
