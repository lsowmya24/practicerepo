package com.cg.boot;

import com.cg.model.StudentClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
        int[] myarr= {12,45,67,89,23};
        
        for(int n:myarr)
            System.out.println(n);
        
        SalesClass class1=new SalesClass();
        class1.display();
        
        StudentClass student=new StudentClass();
        student.setStudentId(24);
        student.setFirstName("sowmya");
        student.setLastName("lingutla");

 System.out.println(student);
	}

}
