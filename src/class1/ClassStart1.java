package class1;

public class ClassStart1 {

    /*
    다음과 같이 출력하는 프로그램을 작성하여라

    이름 : ㅇㅇㅇ 나이 : ㅇㅇㅇ 성적 : ㅇㅇㅇ
    이름 : XXX 나이 : XXX 성적 : XXX
     */


    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름 : "+ student1Name + " 나이 : "+student1Age + " 성적 : "+student1Grade);
        System.out.println("이름 : "+ student2Name + " 나이 : "+student2Age + " 성적 : "+student2Grade);
    }

}
