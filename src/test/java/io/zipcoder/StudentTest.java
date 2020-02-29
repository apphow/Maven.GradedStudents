package io.zipcoder;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;



    /*
    // : Given
String firstName = "Leon";
String lastName = "Hunter";
Double[] examScores = { };
Student student = new Student(firstName, lastName, examScores);

// When
student.addExamScore(100.0);
String output = student.getExamScores();

// Then
System.out.println(output);

     */
=======
import org.junit.Assert;
import org.junit.Test;
@Test
public class StudentTest {
     private Student firstName;
     private Student lastName;
     private Student testScores;


// : Given
     String expectedFirstName = "Leon";
     String expectedLastName = "Hunter";
     Double[] expectedTestScores = {100.0, 95.0, 123.0, 96.0};

// When
     Student student = new Student(expectedFirstName, expectedLastName, expectedTestScores);


// Then

     String actualFirstName = firstName.getFirstName();
     String actualLastName = lastName.getLastName();
     Double[] actualTestScores = testScores.getTestScores();

     Assert.assertEquals(expectedFirstName, actualFirstName);
     Assert.assertEquals(expectedLastName, actualLastName);
     Assert.assertEquals(expectedTestScores, actualTestScores);

}

>>>>>>> c629ce7c61697b5d6154b1eea2b03bef72549612

}