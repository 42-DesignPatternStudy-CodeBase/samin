package samin.strategyPattern.strategyPatternGrade;


public class minorGradeStrategy implements gradeStrategy {
    minorGradeStrategy() {}

    @Override
    public String calGrade(int scorePoint) {

        if (100 >= scorePoint && scorePoint >= 90) {
            return "A";
        } else if (89 >= scorePoint && scorePoint >= 80) {
            return "B";
        } else if (79 >= scorePoint && scorePoint >= 70) {
            return "C";
        } else if (69 >= scorePoint && scorePoint >= 55) {
            return "D";
        } else if (55 > scorePoint) {
            return "F";
        }
        return "F";
    }
}