package main;
public class Calculator {

    private Calculator(){}

    static public int multiply(int firstVar, int secondVar){
        return firstVar * secondVar;
    }
    static public double multiply(double firstVar, double secondVar){
        return firstVar * secondVar;
    }
    static public float multiply(float firstVar, float secondVar){
        return firstVar * secondVar;
    }
    static public int multiply(byte firstVar, byte secondVar){
        return firstVar * secondVar;
    }
    static public boolean multiply(boolean firstVar, boolean secondVar){
        int firstNum = firstVar? 1 : 0;
        int secondNum = secondVar? 1 : 0;

        //readability is more important than being clever
        if(firstNum * secondNum == 1){
            return true;
        } else {
            return false;
        }
    }

    static public int devide(int firstVar, int secondVar){
        return firstVar/secondVar;
    }
    static public double devide(double firstVar, double secondVar){
        return firstVar/secondVar;
    }
    static public float devide(float firstVar, float secondVar){
        return firstVar/secondVar;
    }
    static public int devide(byte firstVar, byte secondVar){
        return firstVar/secondVar;
    }
    static public boolean devide(boolean firstVar, boolean secondVar){
        int firstNum = firstVar? 1 : 0;
        int secondNum = secondVar? 1 : 0;

        //readability is more important than being clever
        if(firstNum / secondNum == 1){
            return true;
        } else {
            return false;
        }
    }

}
