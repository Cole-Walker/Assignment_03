package com.mycompany.assignment03_2;

class Assignment03_2 
{
    public static void main(String[] args) 
    {
        Assignment03_2 hold = new Assignment03_2();
        String myString = "madam";
        if (hold.reverse(myString) == true)
        {
            System.out.println("The string " + myString + " is a palindrome!");
        }
        else
        System.out.println("The string " + myString + " is NOT a palindrome!");
    }
    
    public static boolean reverse (String string)
    {
        char track;
        String revHold = "";
        for (int i = 0; i < string.length(); i++)
        {
            track = string.charAt(i);
            revHold = track + revHold;
        }
        if (string.equals(revHold))
        {
            return true;
        }
        return false;
    }
}
