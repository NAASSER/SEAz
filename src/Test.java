class Test
{
    public static void main(String[] args)
    {
        testDivision();
    }

    private static void testDivision()
    {
        int a = 12;
        int b = 6;
        int expected = 2;
        BasicMath bm = new BasicMath();
        int result = bm.Division(a, b);
        if (result == expected)
        {
            System.out.println("Division: OK");
        }
        else
        {
            System.out.println("Division: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
