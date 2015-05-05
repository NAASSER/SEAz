class Test
{
    public static void main(String[] args)
    {
        testSubtraction();
    }

    private static void testSubtraction()
    {
        int a = 12;
        int b = 6;
        int expected = 6;
        BasicMath bm = new BasicMath();
        int result = bm.Subtraction(a, b);
        if (result == expected)
        {
            System.out.println("Subtraction: OK");
        }
        else
        {
            System.out.println("Subtraction: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
