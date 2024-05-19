package com.practise.aspectj;

public class Main {

    public static void main( String[] args ) {
        System.out.println(new WeavedToString("test"));
    }

    record WeavedToString(String test) {

        @Override
        public String toString() {
            return "ToStringWeaved{" +
                    "test='" + test + '\'' +
                    '}';
        }
    }
}
