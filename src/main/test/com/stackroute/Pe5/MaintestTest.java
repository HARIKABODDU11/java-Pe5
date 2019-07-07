package com.stackroute.Pe5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

    public class MaintestTest {

        public static Maintest maintest;

        @BeforeClass
        public static void setUp()
        {
            maintest = new Maintest();
        }

        @AfterClass
        public static void tearDown()
        {
            maintest = null;
        }

        @Test
        public void givenListShouldReturnSortedList()
        {
            Student student1 = new Student("000FEL", "Harika", 22);
            Student student2 = new Student("000GFE", "Hema", 23);
            Student student3 = new Student("000GCL", "Satya", 22);

            List<Student> studentList = new ArrayList<>();

            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);

            List<Student> sortedList = new ArrayList<>();

            sortedList.add(student2);
            sortedList.add(student3);
            sortedList.add(student1);

            assertEquals(sortedList.toString(),maintest.sortStudents(studentList).toString());
        }

        @Test
        public void givenNullShouldReturnNull()
        {
            assertNull(maintest.sortStudents(null));
        }

        @Test
        public void givenListWithDuplicateElemenstShouldReturnSortedList()
        {
            Student student1 = new Student("000FCL", "Harika", 22);
            Student student2 = new Student("000FEL", "Hema", 23);
            Student student3 = new Student("000GCL", "Pujitha", 22);
            Student student4 = new Student("000HCL", "Prerna", 21);
            Student student5 = new Student("000DEL", "Harika", 22);

            List<Student> studentList = new ArrayList<>();

            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            studentList.add(student4);
            studentList.add(student5);

            List<Student> sortedList = new ArrayList<>();

            sortedList.add(student2);
            sortedList.add(student3);
            sortedList.add(student1);
            sortedList.add(student5);
            sortedList.add(student4);

            assertEquals(sortedList.toString(),maintest.sortStudents(studentList).toString());
        }

    }