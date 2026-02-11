package Lesson2;

public class StudentManager {
    public static void adjustStudentScore(Student s, int adjustment){
        if(adjustment>0) s.upgradeScore(adjustment);
        else if(adjustment<0) s.downgradeScore(adjustment);
        else System.out.println("Invalid input.");
    }

    public static void batchAdjust(Student[] students,int adjustment){
        for (Student s:students) {
            adjustStudentScore(s, adjustment);
        }
    }

    public static Student findTopStudent(Student[] students){
        int IndexOfTop=0;
        for(int i=0;i<students.length;i++){
            if(students[i].score>students[IndexOfTop].score) IndexOfTop=i;
        }
        return students[IndexOfTop];
    }

    public static double calculateAverage(Student[] students){
        double sum=0.0;
        for(Student s:students){
            sum+=s.score;
        }
        return sum/students.length;
    }

    public static void main(String[] args) {
        Student[] students={
            new Student("Jason",86),
            new Student("Justinian",75),
            new Student("emt",91),
            new Student("JIN",90)
        };

        System.out.println("===单个学生分数调整===");
        System.out.println("修改前：");
        students[0].printStudent();
        System.out.println("修改后；");
        adjustStudentScore(students[0], 4);
        students[0].printStudent();

        System.out.println("===批量调整学生分数===");
        batchAdjust(students, 5);
        for(int i=0;i<4;i++){
            students[i].printStudent();
        }

        System.out.println("===找出最高分学生并显示===");
        Student TopStudent=findTopStudent(students);
        TopStudent.printStudent();

        System.out.println("===计算并显示平均分===");
        System.out.println("正在调用calculateAverage函数...");
        double avr=calculateAverage(students);
        System.out.println("平均分为"+avr);

    }
}
