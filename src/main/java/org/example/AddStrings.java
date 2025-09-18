package org.example;

public class AddStrings {

        public String addStrings(String num1, String num2) {

            int string1 = num1.length()-1;
            int string2 = num2.length()-1;
            int carry=0;
            StringBuilder stringb = new StringBuilder();
            while(string1>=0 || string2>=0 || carry!=0)
            {
                int d1 = (string1>=0)?num1.charAt(string1)-'0':0;
                int d2 = (string2>=0)?num2.charAt(string2)-'0':0;
                int sum = d1+d2+carry;
                carry=sum/10;
                stringb.append(sum%10);
                string1--;
                string2--;
            }
            return stringb.reverse().toString();
        }

        public static void main(String args[]){
            AddStrings AS = new AddStrings();
            AS.addStrings("askas","jdjksls");

        }

}
