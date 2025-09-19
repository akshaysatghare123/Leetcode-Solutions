package org.example;
import java.lang.String;

public class VowelCount {
    public static void main (String[] args)
    {
        String string1 = "ncfbsjdfjAE";
        int count = 0;
      string1 = string1.toLowerCase();
        for(int i=0;i<=string1.length()-1;i++)
        {
            char c = string1.charAt(i);
            if(c=='a' || c=='i' || c=='o'|| c=='e' || c=='u')
            {
            count++;
            }
        }
        System.out.println("Count :"+count);
    }

}
