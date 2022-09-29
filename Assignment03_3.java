package com.mycompany.assignment03_3;

public class Assignment03_3 
{
    public static void main(String[] args)
    {
        String toUpper = "";
        String text = "hello everyone. let's write some useful Java code today. we will begin with strings.";
        toUpper=toUpper+(char)(text.charAt(0) - 32);
        toUpper=toUpper+text.charAt(1);
        for (int i = 2; i < text.length(); i++)
        {
            if (text.charAt(i-2) == '.')
            {
                   if (text.charAt(i) >= 97 && text.charAt(i)<= 122) //If ASCII values represent LowerCase, changing to Upper Case
			{
				toUpper = toUpper+(char)(text.charAt(i) - 32);

			}
            }else{
                toUpper=toUpper+text.charAt(i);
            }
            
        }
        System.out.println(toUpper);
    }
}
