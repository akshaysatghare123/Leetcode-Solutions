package org.example;

class Main {
    public boolean isAnagram(String s, String t)
    {


        int[] count = new int[26];

        if(s.length()!=t.length())
            return false;


        for(int i = 0; i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int counter :count)
        {
            if(counter !=0)
                return false;
        }
        return true;

    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.isAnagram("amul","luma");
        System.out.println("Is palindrome? "+main.isAnagram("amul","luma"));
    }
}