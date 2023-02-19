package samin.strategyPattern.strategyPatternGrade;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    gradeStrategy curStrategy;

    public static final int BASIC = 0;
    public static final int MAJOR = 1;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score, gradeStrategy majorCode) {
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScorePoint(score);
        subject.setMajorCode(majorCode);
        subjectList.add(subject);
    }

    public void showGradeInfo()
    {
        for (int i = 0; i < subjectList.size(); i++)
        {
            System.out.println("학생 " + studentName + "의 " + subjectList.get(i).name + 
                "과목 성적은 " + subjectList.get(i).scorePoint + "점 이고, 학점은 " + subjectList.get(i).getGrade() + " 입니다");
        }
    }

    public class Subject {

        private String name;
        private int scorePoint;
        private gradeStrategy majorCode;

        public String getGrade() {
            return majorCode.calGrade(scorePoint);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScorePoint() {
            return scorePoint;
        }

        public void setScorePoint(int scorePoint) {
            this.scorePoint = scorePoint;
        }

        public gradeStrategy isMajorCode() {
            return majorCode;
        }

        public void setMajorCode(gradeStrategy majorCode) {
            this.majorCode = majorCode;
        }
    }
}