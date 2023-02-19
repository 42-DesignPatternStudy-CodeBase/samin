package samin.strategyPattern.strategyPatternGrade;

public class majorGradeStrategy implements gradeStrategy {
    majorGradeStrategy() {
    }

    @Override
    public String calGrade(int scorePoint) {
        if (100 >= scorePoint && scorePoint >= 95) {
            return "S";
        } else if (94 >= scorePoint && scorePoint >= 90) {
            return "A";
        } else if (89 >= scorePoint && scorePoint >= 80) {
            return "B";
        } else if (79 >= scorePoint && scorePoint >= 70) {
            return "C";
        } else if (69 >= scorePoint && scorePoint >= 60) {
            return "D";
        } else if (60 > scorePoint) {
            return "F";
        }
        return "F";
    }
}
