package uchinchi_topshiriq;

public class Person {
    static String ism;
    static int yosh;
    static String country;
    static String study;

    static void kiritish(String name, int age, String joy, String academy){
        ism = name;
        yosh = age;
        country = joy;
        study = academy;
    }

    static void chiqarish(){
        System.out.println("Ismi: "+ism);
        System.out.println("Yoshi: "+yosh);
        System.out.println("Yashash joyi: "+country);
        System.out.println("O'qish joyi: "+study);
    }
}
