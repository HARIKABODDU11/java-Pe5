package com.stackroute.Pe5;

    import java.util.Comparator;

    public class StudentShorter implements Comparator<Student>
    {
        @Override
        public int compare(Student student1, Student student2) {

            int compareValue;
            int ageCompare = student2.getAge().compareTo(student1.getAge()); //compares based on ascii
            int nameCompare = student2.getName().compareTo(student1.getName());
            int idCompare = student2.getAge().compareTo(student1.getAge());

            if(ageCompare == 0)  //if age is equal compare name
            {
                if(nameCompare == 0) //if name is equal compare id
                {
                    compareValue = idCompare;
                }
                else
                {
                    compareValue = nameCompare;
                }
            }
            else
            {
                compareValue = ageCompare;
            }

            return compareValue;
        }
    }
