package class1;

public class ClassStart5 {



    public static void main(String[] args) {

        Student student1;//
        student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;


        //배열의 사용
        Student[] students = new Student[]{student1,student2}; //Student type을 담을 수 있는 배열(실제로 참조값을 저장하고 있다)


        //반복문을 이용한 출력 
        for(int i=0; i<students.length; i++){
            Student s = students[i];
            System.out.println("이름 : "+ s.name + " 나이 : "+s.age + " 성적 : "+s.grade);
        }


        for (Student s: students) {
            System.out.println("이름 : "+ s.name + " 나이 : "+s.age + " 성적 : "+s.grade);
        }

    }

}
