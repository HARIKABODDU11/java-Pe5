package com.stackroute.Pe5;
import java.util.ArrayList;

         // program to update the existing array list elements by the given elements

public class UpdateArrayElements {

             ArrayList<String> result = new ArrayList();

             public ArrayList updateElements (int index, String update, ArrayList list1) {
                 if (list1.isEmpty())
                 {
                     result = null;
                 }
                 else
                 {
                     list1.set(index, update);

                     result = list1;

                 }

                 return result;
             }
         }

