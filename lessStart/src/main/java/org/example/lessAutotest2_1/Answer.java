package org.example.lessAutotest2_1;


class Answer {

    public static StringBuilder answer(String QUERY, String PARAMS) {
       String sourсeText = PARAMS
               .replace("/", "")
               .replace("{", "")
               .replace("}", "")
               .replaceAll("\\s+", "")
               .replace("\"", "");

        String [] arrayText = sourсeText.split(",");
        StringBuilder textQuery = new StringBuilder(QUERY);
        for (int i = 0; i < arrayText.length; i++) {
            String[] arrayI = arrayText[i].split(":");
            if (i!=0 && !arrayI[1].equals("null")) {
                textQuery.append(" and ");
            }
            if (!arrayI[1].equals("null")) {
                textQuery
                        .append(arrayI[0])
                        .append("=")
                        .append("'")
                        .append(arrayI[1])
                        .append("'");
            }

        }
        return textQuery;
    }
}
