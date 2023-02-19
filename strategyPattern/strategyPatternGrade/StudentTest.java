package samin.strategyPattern.strategyPatternGrade;

public class StudentTest { 
    public static void main(String[] args) { 
      Student studentLee = new Student(1001, "Lee"); 
      gradeStrategy major = new majorGradeStrategy();
      gradeStrategy minor = new minorGradeStrategy();

      studentLee.addSubject("국어", 100, minor); 
      studentLee.addSubject("수학", 100, major);  

      Student studentKim = new Student(1002, "Kim"); 
       
      studentKim.addSubject("국어", 55, major); 
      studentKim.addSubject("수학", 55, minor); 
      studentKim.addSubject("영어", 100, minor); 
      
      studentLee.showGradeInfo(); 
      System.out.println("======================================"); 
      studentKim.showGradeInfo(); 
    } 
}