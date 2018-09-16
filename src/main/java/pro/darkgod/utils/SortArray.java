package pro.darkgod.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pro.darkgod.model.Student;

public class SortArray {
    public List<Student> sort(List<Student> unorderedStudents) {
        List<Student> orderedList = new ArrayList<Student>(unorderedStudents);
        Collections.sort(orderedList);
        return orderedList;
    }
}
