package org.example.lessTwoAutotest;

class Answer {
    public static String [] answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        String [] text = PARAMS.replaceAll("[/{}\"]","").split(",");
        //String [] queryAll = new String(QUERY+text);

        return text;
    }
}
