package com.example.SpringBootWeb;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller3 {
	
	@GetMapping("/restdemo")
	public String disp()
	{
		return"This is Rest API Demo";
	}
	@GetMapping("/demobean")
	public StudentBean1 getStudentBean()
	{
		return new StudentBean1(111,"Mukesh",(float) 99.5);
	}
//	@GetMapping("/demobeans")
//	public List<StudentBean1> getStudentBean1()
//	{
//		List<StudentBean1> students=new ArrayList<>();
//		students.add(new StudentBean1(109,"Bibhav",88.3f));
//		students.add(new StudentBean1(110,"Abhishek",88.3f));
//		students.add(new StudentBean1(96,"Roushan",88.3f));
//		students.add(new StudentBean1(11,"Rohit",88.3f));
//		students.add(new StudentBean1(10,"rahul",88.3f));
//		return students;
//	}
	@GetMapping("/student/{rollno}/{name}/{mark}")
	public StudentBean1 getPathVariable(@PathVariable("rollno") int roll,@PathVariable("name")String name,@PathVariable("mark")float mark)
	{
		return new StudentBean1(roll,name,mark);
	}
}