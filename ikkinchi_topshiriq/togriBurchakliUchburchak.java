package ikkinchi_topshiriq;

public class togriBurchakliUchburchak {
    static float a;
    static float b;
    static double c;

    static void Kiritish(float katetA, float katetB){
        a = katetA;
        b = katetB;
        c = Math.sqrt(a*a + b*b);
    }

    static void Chiqarish(){
        System.out.println("a kateti: "+a);
        System.out.println("b kateti: "+b);
        System.out.println("gipotenuza: "+c);
    }
}
