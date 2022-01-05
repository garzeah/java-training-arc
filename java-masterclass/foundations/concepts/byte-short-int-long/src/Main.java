public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue); // -2147483648
        System.out.println("Integer Maximum Value = " + myMaxIntValue); // 2147483647
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // -2147483648
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // 2147483647

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue); // -128
        System.out.println("Byte Maximum Value = " + myMaxByteValue); // 127

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue); // -32768
        System.out.println("Short Maximum Value = " + myMaxShortValue); // 32767

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue); // -9223372036854775808
        System.out.println("Long Maximum Value = " + myMaxLongValue); // 9223372036854775807
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        // Type casting
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
