package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(Double.compare(s2.getCgpa(), s1.getCgpa())==0) {//compare in descending order
			if(s1.getFname().compareTo(s2.getFname())==0) {//compare in ascending order
				return Integer.compare(s1.getId(), s2.getId());//compare in ascending order
			}else {
				return s1.getFname().compareTo(s2.getFname()); //compare in ascending order
			}
		}else {
			return Double.compare(s2.getCgpa(), s1.getCgpa());
		}
		
	}
	
}

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}


public class JavaSortProgramUsingComparator {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
		Collections.sort(studentList,new StudentComparator());
		
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
