package hashcodeandequals;

import java.util.HashSet;
import java.util.Set;
public class HashCodeAndEquals 
{

	public static void main(String[] args) 
	{
		Student s1=new Student(100, "ABC");
		Student s2=new Student(100, "ABC");
		Student s3=new Student(100, "ABC");
		Student s4=new Student(100, "ABC");
		
		Set <Student> set=new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		if(s1.equals(s2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		System.out.println(set);

	} 

}
