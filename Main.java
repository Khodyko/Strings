package com.company.web;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    String name="i'm main";

    @Override
    public String toString() {
        return " Task13 Main{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
	    //Task 1
        String t1Str="abc";
        t1Str=new String("abc");
        char[] t1Char=new char[]{'a','c'};
        t1Str= String.valueOf(t1Char);
        byte[] t1Byte=new byte[]{123,12,43};
        t1Str=new  String(t1Byte, StandardCharsets.UTF_8);
        //Task 2
        String t2_1="a";
        String t2_2="b";
        t2_1= t2_1+t2_2;
        t2_1=t2_1.concat(t2_2);
        //Task 3
        String t3="123";
        String t3_2="abc";
        int t3int= Integer.valueOf(t3);
        //t3int=Integer.valueOf(t3_2);//Exception
        //Task 4
        String t4="123";
        String t4_2="abc";
        int t4int= Integer.parseInt(t4);
        //t4int=Integer.valueOf(t4_2);// Exception
        //Task 5
        Integer t5=5;
        Integer t5_1=null;
        String t5str= ""+t5;
        //t5str=""+t5_1; //NullPointer
        //Task 6
        int t6=2;
        String t6str=String.valueOf(t6);
        //Task 7
        int t7=2;
        String t7str=Integer.toString(t7);
        //Task 8
        String t8="abcd";
        System.out.println(t8.charAt(2));
        System.out.println(t8.length());
        System.out.println(t8.substring(2));
        //Task 9
        String t9="abCd ef";
        System.out.println(t9.split("a"));
        System.out.println(t9.trim());
        System.out.println(t9.toLowerCase());
        System.out.println(t9.toUpperCase());
        System.out.println(t9.replace('d', 'D'));
        System.out.println(t9.replaceAll("b","bbb"));
        System.out.println(t9.replaceFirst("e","new year"));
        //Task 10
        String t10="abcdefgHIJ";
        System.out.println(t10.indexOf("d"));
        System.out.println(t10.lastIndexOf("d"));
        System.out.println(t10.contains("a"));
        System.out.println(t10.startsWith("a"));
        System.out.println(t10.endsWith("J"));
        //Task 11
        String t11="abcdefgHIQ";
        System.out.println(t11.compareTo("abcdefghij"));
        System.out.println(t11.compareToIgnoreCase("abcdefghij"));
        System.out.println(t11.equals("abcdefghij"));
        System.out.println(t11.equalsIgnoreCase("abcdefghij"));
        //Task 12
        String t12="abcd";
        boolean t12boo=true;
        Integer t12int=12;
        Float t12float=12.3f;
        Character t12char='f';
        System.out.println(String.format("lalla = %b, %d, %.1f, %c, %s", t12boo,t12int,t12float, t12char,t12));
        //Task 14
        String t14="abcd";
        switch (t14){
            case "abcd":{
                System.out.println("ura!!!");
                break;
            }
            default:{
                System.out.println("so sad!");
            }
        }
        //Task15
        String t15="abc";
        String t15_1=new String("abc");
        System.out.println(t15.equals(t15_1));
        //Task16
        String t16="abc";
        String t16_1="abc";
        System.out.println(t16==t16_1);
        //Task 17
        String t17="abc";
        String t17_1=new String("abc");
        System.out.println(t17!=t17_1);
        //Task 18
        String t18="abc";
        String t18_1=new String("abc");
        System.out.println(t18==t18_1.intern());
        //Task 19
        StringBuffer t19=new StringBuffer("abc");
        StringBuilder t19_1=new StringBuilder("abc");
        System.out.println(t19.append("def").toString());
        System.out.println(t19_1.append("def").toString());
        //Task 20
        String t20="abc";
        System.out.println(Pattern.matches(t20,"abc"));
        Pattern pattern=Pattern.compile("\\D[b].");
        Matcher matcher=pattern.matcher(t20);
        System.out.println(matcher.matches());




    }

}
