package org.example.lessTwoAutotest;


class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
       String sourсeText = PARAMS
               .replace("/", "")
               .replace("{", "")
               .replace("}", "")
               .replace("\"", "");

        String[] arrayText = sourсeText.split("");
        StringBuilder textQuery = new StringBuilder(QUERY);
        for (String s : arrayText) {
            String[] arrayS = s.split(":");
            if(!arrayS[1].equals("null")) {
                textQuery
                        .append(arrayS[0])
                        .append("")
                        .append(arrayS[0]);
            }
        }
        return textQuery;
    }
}
