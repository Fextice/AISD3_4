package ru.vsu.cs.course1;


import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Task {


    public static SimpleLinkedListStack<String> convertArrayToList(String[] array) {
        SimpleLinkedListStack<String> list = new SimpleLinkedListStack<>();
        for (int i = 0; i < array.length; i++) {
            list.push(array[i]);
        }
        return list;
    }

    public static String[] convertListToArray(SimpleLinkedList<String> list) throws Exception {
        String[] array = new String[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}




