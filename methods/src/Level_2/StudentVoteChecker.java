package Level_2;

import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age){
        if(age<0){
            return false;
        }
        if(age>=18){

            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        StudentVoteChecker chk = new StudentVoteChecker();

        int[] age = new int[10];
        System.out.println("enter age of 10 students : ");
        for(int i=0;i< age.length;i++){
            age[i]= input.nextInt();

            boolean result = chk.canStudentVote(age[i]);
            if(result){
                System.out.println("student can vote");
            }
            else {
                System.out.println("student can't vote");
            }
        }
    }
}