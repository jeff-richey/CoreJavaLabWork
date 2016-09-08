/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodarguments;

/**
 *
 * @author jrichey
 */
public class MethodArguments {

    static String[] strNumArr = new String[] {
        "zeo",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten"
    };
    
    static int[] intArr1 = new int[] {0, 3, 7, 10};
    static int[] intArr2 = new int[] {4, 8, 21};
    static double[] doubleArr1 = new double[] {6.7, 11.5, 24.9, 44.0};
    static double[] doubleArr2 = new double[] {1.11, 2.22, 3.33, 4.44, 5.55};
    static String[] strArr1 = new String[] {"zero", "one", "seven", "five", "nine", "three"};
    
    /*
    ** the three static methods below are used in the first portion of the assignment
    ** and are commented out here for the variable length argument list assignment
    */
    static int addUp(int firstArg, int secondArg) {
        System.out.println("integer addUp = ");
        return firstArg + secondArg;
    }
    
    static double addUp(double firstArg, double secondArg) {
        System.out.println("double addUp = ");
        return firstArg + secondArg;
    }
    
    static int addUp(String firstArg, String secondArg) {
        System.out.println("string addUp = ");
        return toNumber(firstArg) + toNumber(secondArg);
    }
    
    
    static int addUp(int argCount, int argList[]) {
        System.out.println("integer addUp = ");
        int returnVal = 0;
        for (int i = 0; i < argCount; i++) {
            returnVal += argList[i];
        }
        return returnVal;
    }
    
    static double addUp(double argCount, double argList[]) {
        System.out.println("double addUp = ");
        double returnVal = 0;
        for (int i = 0; i < argCount; i++) {
            returnVal += argList[i];
        }
        return returnVal;
    }
    
    static int addUp(int argCount, String argList[]) {
        System.out.println("string addUp = ");
        int returnVal = 0;
        for (int i = 0; i < argCount; i++) {
            returnVal += toNumber(argList[i]);
        }
        return returnVal;
    }
    
    static int toNumber(String numArg) {
        int i = 0;
        while(i < strNumArr.length && !numArg.equalsIgnoreCase(strNumArr[i])) {
            i++;
        }
        return i;
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        ** used in the first part of the exercise
        */
        System.out.println(addUp(3.2, 2.2));
        System.out.println(addUp(1,4));
        System.out.println(addUp("one", "three"));
        System.out.println(addUp("six", "seven"));
        System.out.println(addUp(2, 3.5));
        // the following line generates a compilation error as there is no matching method with these types of arguments
        //System.out.println(addUp(1, "three"));
        
        // used in the variable argument lists
        System.out.println(addUp(4, intArr1));
        System.out.println(addUp(3, intArr2));
        System.out.println(addUp(4, doubleArr1));
        System.out.println(addUp(5, doubleArr2));
        System.out.println(addUp(6, strArr1));
    }
    
}
