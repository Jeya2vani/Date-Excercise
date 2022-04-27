package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter Start date 1:");
        String ss1 = input.nextLine();
        Date s1 = s.parse(ss1);
        System.out.println("Enter End date 1:");
        String ee1 = input.nextLine();
        Date e1 = s.parse(ee1);
        System.out.println("Enter Start date 2:");
        String ss2 = input.nextLine();
        Date s2 = s.parse(ss2);
        System.out.println("Enter End date 2:");
        String ee2 = input.nextLine();
        Date e2 = s.parse(ee2);
        Date e=e1;
        Date n=s1;
        Date t=s2;
        Date v=e2;
        System.out.print("Start date "+s.format(s1));
        System.out.println("  End date "+s.format(e1));
        System.out.print("Start date "+s.format(s2));
        System.out.println("  End date "+s.format(e2));
        if(s1.before(s2) && e1.after(s2) && e1.before(e2))
        {
            e1=t;
            s2=e;
            System.out.print("Start date "+s.format(s1));
            System.out.println("  End date "+s.format(e1));
            System.out.print("Start date "+s.format(s2));
            System.out.println("  End date "+s.format(e2));
        }
        if(s1.before(e2) && e1.after(e2) && s2.before(s1))
        {
            s1=t;
            s2=v;
            e2=e;
            e1=n;
            System.out.print("Start date "+s.format(s1));
            System.out.println("  End date "+s.format(e1));
            System.out.print("Start date "+s.format(s2));
            System.out.println("  End date "+s.format(e2));
        }
        if(s1.before(s2) && e1.after(e2))
        {
            s2=v;
            e2=e;
            e1=t;
            System.out.print("Start date "+s.format(s1));
            System.out.println("  End date "+s.format(e1));
            System.out.print("Start date "+s.format(s2));
            System.out.println("  End date "+s.format(e2));
        }
        if(s1.after(s2) && e1.before(e2))
        {
            s2=e;
            s1=t;
            e1=n;
            System.out.print("Start date "+s.format(s1));
            System.out.println("  End date "+s.format(e1));
            System.out.print("Start date "+s.format(s2));
            System.out.println("  End date "+s.format(e2));
        }
        if(s1.before(s2) && e1.before(s2) && e1.before(e2) && s1.before(e2))
        {
            System.out.println("There is no overlapping dates");
        }
    }
}
