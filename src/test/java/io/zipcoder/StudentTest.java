package io.zipcoder;

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


}