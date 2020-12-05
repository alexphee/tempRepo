package edu.princeton.cs.algs4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

public class Student {
   
    public static final Comparator<Student> NAME_ORDER    = new NameOrder();
    public static final Comparator<Student> GRADE_ORDER = new GradeOrder();
    public static final Comparator<Student> GRAD_YEAR_ORDER = new GradYearOrder();
    public static final Comparator<Student> DATE_ORDER = new DateOrder();


    private final String name;
    private final Date date;
    private final double grade;
    private final int year;

    public Student(String name, Date date, double grade, int year) {

		this.name = name;
		this.date = date;
		this.grade = grade;
		this.year = year;
	}

    public static Comparator<Student> byNameOrder() {
        return new NameOrder();
    }
    public static Comparator<Student> byGradeOrder() {
        return new GradeOrder();
    }
    public static Comparator<Student> byDateOrder() {
        return new DateOrder();
    }
    public Comparator<Student> byRelativeNameOrder() {
        return new RelativeNameOrder();
    }
    public static  Comparator<Student> byGradYearOrder() {
        return new GradYearOrder();
    }
 
    private static class NameOrder implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.name.compareTo(b.name);
        }
    }

    private class RelativeNameOrder implements Comparator<Student> {
        public int compare(Student a, Student b) {
            if (a.name.compareTo(b.name) == 0) return 0;
            if (a.name.compareTo(name) == 0) return -1;
            if (b.name.compareTo(name) == 0) return +1;
            if ((a.name.compareTo(name) < 0) && (b.name.compareTo(name) > 0))
                return +1;
            if ((a.name.compareTo(name) > 0) && (b.name.compareTo(name) < 0))
                return -1;
            return a.name.compareTo(b.name);
        }
    }
    private static class GradYearOrder implements Comparator<Student> {
		public int compare(Student a, Student b) {
			return a.year - b.year;
		}
    	
    }
    private static class GradeOrder implements Comparator<Student> {
        public int compare(Student a, Student b) {
        	return Double.compare(a.grade, b.grade);
        }
    }
    private static class DateOrder implements Comparator<Student> {
        public int compare(Student a, Student b) {
        	return a.date.compareTo(b.date);
        }
    }
    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Student that = (Student) other;
        return (this.grade == that.grade) && (this.name.equals(that.name)) && (this.year == that.year) && (this.date.equals(that.date));
    }
//    @Override
//    public int hashCode() {
//        return 31*section + name.hashCode();
//    }
    @Override
    public String toString() {
        return name + "\t: " + year + " \t: " + grade + ":\t" + date;
    }
    public static Student[] createStudents() {
    	 Student tony  = new Student("Tony",new Date(9,29,2010), 8.6 , 2015);
         Student steve  = new Student("Steve",new Date(10,10,2013), 7.9 , 2017);
         Student nat  = new Student("Nat",new Date(11,11,2011), 9.0, 2015);
         Student bob  = new Student("Bob",new Date(9,12,2012), 8.1 , 2016);
         Student alice  = new Student("Alice",new Date(10,12,2009), 6.6 , 2015);
         Student james  = new Student("James",new Date(10,1,2005), 6.1 , 2010);
         Student nick= new Student("Nick",new Date(10,5,2010), 7.2 , 2016);
         Student nathan= new Student("Nathan",new Date(10,12,2007), 8.1 , 2011);
         Student eliot= new Student("Eliot",new Date(10,10,2010), 8.1 , 2014);
         Student mary= new Student("Mary",new Date(10,12,2008), 8.6 , 2010);

         Student[] students = {tony,steve,nat,bob,alice,james,nick,nathan,eliot,mary};
    	return students;
    }
    
   
}
