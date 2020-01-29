package com.company;
import java.util.Scanner;
/**
 * Created by narges nastran on 10/05/2019.
 */
public class Student {
    public Student(int courses){
        Scanner scanner=new Scanner(System.in);
        this.course=courses;
        int i,sum=0;
        array=new int[this.course];
        for(i=0;i<this.course;i++)
        {
            System.out.println("enter mark and units"+(i+1));
            String mark=scanner.nextLine();
            String unit=scanner.nextLine();
            unitsum+=Integer.parseInt(unit);
            array[i]=Integer.parseInt(mark)*Integer.parseInt(unit);

        }

    }
    public int course;
    public int[] array;
    public int unitsum;
    public float avg;
    public void avgerage()
    {
        int i,sum=0;
        for(i=0;i<this.course;i++)
        {
            sum+=array[i];
        }
        System.out.println("sum is:"+sum);
        avg=sum/unitsum;
        System.out.println("the average is:"+avg);

    }
    public void conditional()
    {
        if(this.avg>12)
        {
            System.out.println("the student is unconditional");
        }
        else
        {
            System.out.println("the student is conditional");
        }
    }

}
