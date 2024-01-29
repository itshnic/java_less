package org.example.lessTwoAutotest;

class Answer {
    public static String answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        String text = PARAMS.replaceAll("[/{}\"]","").
                replace(":","='").
                replace(",","' and");
        String queryAll = new String(QUERY+text);

        return queryAll;
    }
}
