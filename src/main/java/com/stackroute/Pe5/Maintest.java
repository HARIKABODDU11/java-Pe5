package com.stackroute.Pe5;

import java.util.Collections;
import java.util.List;

    public class Maintest {

        StudentShorter studentSorter = new StudentShorter();

        public List<Student> sortStudents(List<Student> studentList)
        {
            if(studentList != null) {

                Collections.sort(studentList, new StudentShorter());  //it sorts using compare method of StudentSorter
            }

            return studentList;
        }

    }
