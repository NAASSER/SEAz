class Test
{
    public static void main(String[] args)
    {
        testMulti();
    }

    private static void testMulti()
    {
        int a = 3;
        int b = 6;
        int expected = 18;
        BasicMath bm = new BasicMath();
        int result = bm.Muliplication(a, b);
        if (result == expected)
        {
            System.out.println("Multiplication: OK");
        }
        else
        {
            System.out.println("Multiplication: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
