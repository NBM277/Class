import java.util.Scanner;
public class birinchi_topshiriq {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Massiv o'lchamini kiriting: ");
        int a = scanner.nextInt();
        int[] massiv = new int[a];
        System.out.println("Massiv elementlarini kiriting:");
        for(int i=0; i<a; i++){
            System.out.print("massiv["+(i+1)+"]=");
            massiv[i] = scanner.nextInt();
        }
        int maks1=massiv[0];//maksimal element uchun joy ajratamiz
        for(int i=0;i<a;i++){
            if(massiv[i]>maks1){
                maks1=massiv[i];//massiv ichidagi eng katta elementni maks1 ga o'zlashtiradi
                int b=i;
            }
        }
        int maks2=massiv[0];
        if(massiv[0]==maks1){
            maks2=massiv[1];//agar birinchi element eng katta element bo'lsa ikkinchi elementdan tekshirishni boshlaydi
        }
        for(int i=0;i<a;i++){
            if(massiv[i]>maks2&&massiv[i]!=maks1) {//massivdagi maksimal elementni qidiradi
                maks2 = massiv[i];//ikkinchi eng katta elementni maks2 ga o'zlashtiradi
            }
        }
        System.out.println("Massivning ikkinchi eng katta elementi: "+maks2);
    }
}