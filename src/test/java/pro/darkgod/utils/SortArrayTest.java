package pro.darkgod.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pro.darkgod.model.Student;

class SortArrayTest {

    private SortArray sortArray;
    private List<Student> unorderedStudents = new ArrayList<>();

    @BeforeEach
    void setupTest() {
        sortArray = new SortArray();
        unorderedStudents.clear();
    }

    @AfterEach
    void cleanTest() {
        sortArray = null;
    }

    @Test
    void definedSortArray() {
        assertNotNull(sortArray);
    }

    @Test
    void sortsStudentArrayWhenOnlyCgpaApply() {
        unorderedStudents.add(new Student(33, "Rumpa", 3.68));
        unorderedStudents.add(new Student(85, "Ashis", 3.85));
        unorderedStudents.add(new Student(56, "Samiha", 3.75));

        List<Student> orderedStudents = sortArray.sort(unorderedStudents);
        assertNotNull(orderedStudents);
        assertEquals(3, orderedStudents.size());
        assertEquals(85, orderedStudents.get(0).getId());
        assertEquals(56, orderedStudents.get(1).getId());
        assertEquals(33, orderedStudents.get(2).getId());
    }

    @Test
    void sortsStudentArrayWhenCgpaEqual() {
        unorderedStudents.add(new Student(33, "Rumpa", 3.68));
        unorderedStudents.add(new Student(85, "Ashis", 3.68));
        unorderedStudents.add(new Student(56, "Samiha", 3.75));

        List<Student> orderedStudents = sortArray.sort(unorderedStudents);
        assertNotNull(orderedStudents);
        assertEquals(3, orderedStudents.size());
        assertEquals(56, orderedStudents.get(0).getId());
        assertEquals(85, orderedStudents.get(1).getId());
        assertEquals(33, orderedStudents.get(2).getId());
    }

    @Test
    void sortStudentArrayWhenStudentsWithSameFirstName() {
        unorderedStudents.add(new Student(33, "Rumpa", 3.68));
        unorderedStudents.add(new Student(85, "Rumpa", 3.68));
        unorderedStudents.add(new Student(56, "Samiha", 3.75));

        List<Student> orderedStudents = sortArray.sort(unorderedStudents);
        assertNotNull(orderedStudents);
        assertEquals(3, orderedStudents.size());
        assertEquals(56, orderedStudents.get(0).getId());
        assertEquals(33, orderedStudents.get(1).getId());
        assertEquals(85, orderedStudents.get(2).getId());
    }
}
