package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMaxByteValue);
        byte myMaxLiteralByteValue = 127;

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value =" + myMinShortValue);
        System.out.println("Short Max Value =" + myMaxShortValue);
        short myMaxLiteralShortValue = 32767;

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value =" + myMinLongValue);
        System.out.println("Long Max Value =" + myMaxLongValue);
        long bigLongLIteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLIteralValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue =  (short) (myMinShortValue / 2);

        byte myByteChallenge = 100;
        short myShortChallenge = 32698;
        int myIntChallenge = 10000000;
        long myLongChallenge = (long) 50000 + (10 * (myByteChallenge + myIntChallenge + myShortChallenge));
        System.out.println(myLongChallenge);
    }
}
