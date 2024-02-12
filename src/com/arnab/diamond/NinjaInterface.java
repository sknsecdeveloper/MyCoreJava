package com.arnab.diamond;

public interface NinjaInterface {

    final int x = 100;

    // Publicly accessible abstract.
    void NinjaDisplay();
}

class NinjaClass implements NinjaInterface
{
    // Defining the function definition.
    public void NinjaDisplay()
    {
        System.out.println("Welcome Ninjas!!");
    }

    // Main function
    public static void main(String[] args)
    {
        NinjaClass obj = new NinjaClass();

        // Calling NinjaDisplay.
        obj.NinjaDisplay();

        // Accessing public variable of NinjaInterface.
        System.out.println(x);
    }
}
