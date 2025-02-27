package JavaProject.BasicJava;

import JavaProject.AbstractTypes.Nameable;
import JavaProject.AbstractTypes.Register;
import JavaProject.Enums.Level;
import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class StudentTest {

    @Test
    public void testGetAverage(){
        Double[] studentGrades = {14.38, 90.12, 12.23, 29.19};

        List<Double> studentGradesArrayList = new ArrayList<>();
        studentGradesArrayList.addAll(Arrays.asList(studentGrades));

        Student student = new Student(studentGradesArrayList);

        Double gradeAverage = student.getAverage();

        // cast to 2 dp
        BigDecimal bd = new BigDecimal(gradeAverage).setScale(2, RoundingMode.HALF_UP);
        double roundedGradeAverage = bd.doubleValue();

        assertEquals(roundedGradeAverage , 36.48, 0);
    }


}
