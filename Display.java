package com.programs;
import java.util.ArrayList;
import java.util.List;

public class Display{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=new ArrayList();
		{
			list.add(new Person("Rahul","Rahul","Kochi"));
			list.add(new Person("Rahul","Paul","TVM"));
			list.add(new Person("Sandeep","S","Trissur"));
		}
		long l=list.stream().distinct().count();
		System.out.println("List of distant names: "+l);
		
		list.stream().distinct().forEach(p ->System.out.println(p.getfirstName()+" "+p.getlastName()));
	}

}
