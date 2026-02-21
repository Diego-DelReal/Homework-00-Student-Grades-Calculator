import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void testConstructorAndGetters() {
        int[] grades = {90, 80, 70};
        Student s = new Student("Alice", grades);

        assertEquals("Alice", s.getName());
        assertArrayEquals(grades, s.getGrades());
    }

    @Test
    void testSetName() {
        Student s = new Student("Bob", new int[]{100});
        s.setName("Charlie");

        assertEquals("Charlie", s.getName());
    }

    @Test
    void testSetGrades() {
        Student s = new Student("Dana", new int[]{50});
        int[] newGrades = {60, 70, 80};
        s.setGrades(newGrades);

        assertArrayEquals(newGrades, s.getGrades());
    }

    @Test
    void testAverageGradeNormal() {
        Student s = new Student("Eve", new int[]{80, 90, 100});
        assertEquals(90.0, s.getAverageGrade());
    }

    @Test
    void testAverageGradeEmptyArray() {
        Student s = new Student("Frank", new int[]{});
        assertEquals(0.0, s.getAverageGrade());
    }

    @Test
    void testAverageGradeNull() {
        Student s = new Student("Grace", null);
        assertEquals(0.0, s.getAverageGrade());
    }

    @Test
    void testAverageGradeDecimals() {
        Student s = new Student("Henry", new int[]{85, 86});
        assertEquals(85.5, s.getAverageGrade());
    }
}