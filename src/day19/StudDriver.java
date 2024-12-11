package day19;

public class StudDriver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1=new Student("alice@gmail.com",101,"alice123",9890123123L);
		System.out.println(s1);
		
		Student s2=s1;
		System.out.println(s2);
		
		System.out.println(s1==s2);
		
		Student s3=s1.clone();
		System.out.println(s3);
		
		System.out.println(s1==s3);
		System.out.println(s1.getEmailID().equals(s3.getEmailID()));
	}
}
