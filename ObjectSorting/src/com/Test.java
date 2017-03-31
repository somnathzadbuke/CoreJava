package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Student s = new Student();

		s.setRollNo(1);
		s.setName("xyz");
		
		Student s1 = new Student();
		s1.setRollNo(2);
		s1.setName("cda");
		
		Student s2 = new Student();
		s2.setRollNo(3);
		s2.setName("abc");
		
		List<Student> list=new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		
		for(Student st: list)
		
		{
			System.out.println(st.getRollNo()+" "+ st.getName());
		}
		
		System.out.println("After sorting ");
		
		Collections.sort(list, new NameWiseSorting());
		
		for(Student st: list)
			
		{
			System.out.println(st.getRollNo()+" "+ st.getName());
		}

	}

}
