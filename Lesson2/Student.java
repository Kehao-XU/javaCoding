package Lesson2;

public class Student {
    String name;
    int score;

    public Student(String n,int s){
        name=n;
        score=s;
    }

    public void upgradeScore(int points){
        if(score+points<=100) score+=points;
        else System.out.println("What r u doin' man?");
    }

    public void downgradeScore(int points){
        if(score-points>=0) score-=points;
        else System.out.println("What r u doin' man?");
    }

    public char calculateGrade(){
        if(score>=90) return 'A';
        else if(score>=80) return 'B';
        else if(score>=70) return 'C';
        else if(score>=60) return 'D';
        else return 'F';
    }

    public void printStudent(){
        System.out.println("Name:"+name);
        System.out.println("Score:"+score);
        System.out.println("Grade:"+calculateGrade());
        System.out.print("\n");
    }
}
