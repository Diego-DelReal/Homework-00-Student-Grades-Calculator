public class Student {
    private String name;
    private int[] grades;
    
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int[] getGrades() {
        return grades;
    }
    
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    
    public double getAverageGrade() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}