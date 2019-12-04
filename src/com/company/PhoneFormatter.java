package com.company;

public class PhoneFormatter {

    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }


    public String phoneFormat(String S) {


        // need to reformat the string to remove everything except numbers

        S = extractNumbers(S);
        int length = S.length();

        StringBuilder sb = new StringBuilder();
        // now this loop is used to add the dashes to the numbers
        for (int i = 0; i < length; i++) {

            sb.append(S.charAt(i));
            // this condition will separate every 3 numbers with a -
            if ((i + 1) % 3 == 0) {
                if (i != (length - 1)) {
                    sb.append('-');
                }
            }
        }

        // this condition is used to check for the last part of the number
        // it will separate the last 2 numbers with a -

        if (length % 2 == 1 && length % 3 != 0 && length % 5 != 0) {
            char t = S.charAt(S.length() - 2);
            sb.setCharAt(sb.length() - 3, '-');
            sb.setCharAt(sb.length() - 2, t);
        }
        return sb.toString();
    }

    public String extractNumbers(String S) {
        return S.replaceAll("[^0-9]", "");
    }
}