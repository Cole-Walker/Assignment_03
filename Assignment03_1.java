package com.mycompany.assignment_03;

class Assignment03_1
{
    public static void main(String[] args)
    {
        Assignment03_1 hold = new Assignment03_1();
        String myString = "Xenomorph";
        String myString2 = "Cole";
        
        if (hold.uniqueChars(myString))
            System.out.println("The first word " + myString + " is unique!");
        else
            System.out.println("The first word " + myString + " is not unique!");
            
        if (hold.uniqueChars(myString2))
            System.out.println("The second word " + myString2 + " is unique!");
        else
            System.out.println("The second word " + myString2 + " is not unique!");
    }
    
    public static boolean uniqueChars(String string)
    {
        for (int i = 0; i < string.length(); i++)
            for (int j = i + 1; j < string.length(); j++)
        if (string.charAt(i) == string.charAt(j))
        {
            return false;
        }
    return true;  
    }
}
