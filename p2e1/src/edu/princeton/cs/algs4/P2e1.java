package edu.princeton.cs.algs4;

import java.util.Arrays;

public class P2e1 {
	
	
    public static void main(String[] args) {
    
    	Student[] students=Student.createStudents();
    	
    	
    	StdOut.println("1. Sort by name");
        StdOut.println("----------");
        StdOut.println("Name" + "\t" + "  Year" + "\t" + " Grade" + "\t" + " Date");
        StdOut.println("--------------------------------------------");
        
		MergeX.sort(students, Student.byNameOrder());
        for (int i = 0; i < students.length; i++)
            StdOut.println(students[i]);
        StdOut.println();

        StdOut.println("2. Sort by name in  descending order");
        StdOut.println("----------");
        StdOut.println("Name" + "\t" + "  Year" + "\t" + " Grade" + "\t" + " Date");       
        StdOut.println("--------------------------------------------");
        MergeX.sort(students, Student.byNameOrder());
        for (int i = students.length - 1; i >= 0; i--)
            StdOut.println(students[i]);
        StdOut.println();
        
        StdOut.println("3. Sort by registration date");
        StdOut.println("----------");
        StdOut.println("Name" + "\t" + "  Year" + "\t" + " Grade" + "\t" + " Date");   
        StdOut.println("--------------------------------------------");
        MergeX.sort(students, Student.byDateOrder());
        for (int i = students.length - 1; i >= 0; i--)
            StdOut.println(students[i]);
        StdOut.println();
       
        
        
        StdOut.println("4. Sort by grade");
        StdOut.println("----------");
        StdOut.println("Name" + "\t" + "  Year" + "\t" + " Grade" + "\t" + " Date");
        StdOut.println("--------------------------------------------");
        MergeX.sort(students, Student.byGradeOrder());
        for (int i = students.length - 1; i >= 0; i--)
            StdOut.println(students[i]);
        StdOut.println();
        
        
        StdOut.println("5. Sort by year");
        StdOut.println("----------");
        StdOut.println("Name" + "\t" + "  Year" + "\t" + " Grade" + "\t" + " Date");
        StdOut.println("--------------------------------------------");
        MergeX.sort(students, Student.byGradYearOrder());
        for (int i = 0; i < students.length; i++)
            StdOut.println(students[i]);
        StdOut.println();
        
        StdOut.println("6 . Sort by grade then year");
        StdOut.println("----------");
        StdOut.println("Name" + "\t" + "  Year" + "\t" + " Grade" + "\t" + " Date");
        StdOut.println("--------------------------------------------");
        MergeX.sort(students, Student.byGradeOrder().thenComparing(Student.GRAD_YEAR_ORDER.reversed()));
        for (int i = 0; i < students.length; i++)
            StdOut.println(students[i]);
        StdOut.println();
        
        Student alex = new Student("Alex",new Date(12,12,2009), 9.9, 2014);
        Student alexis = new Student("Alex",new Date(12,12,2009), 9.9, 2014);
        
        StdOut.println("7. Sort by my name: Alex");
        StdOut.println("----------");
        StdOut.println("Name" + "\t" + "  Year" + "\t" + " Grade" + "\t" + " Date");
        StdOut.println("--------------------------------------------");
        StdOut.println(alex);
        MergeX.sort(students, alex.byRelativeNameOrder());
        for (int i = 0; i < students.length; i++)
            StdOut.println(students[i]);
        StdOut.println();


       StdOut.println("Alexis equals Alex: "+alexis.equals(alex));
       StdOut.println("Alexis equals Alice: "+alexis.equals(students[0]));

    
    }
}
