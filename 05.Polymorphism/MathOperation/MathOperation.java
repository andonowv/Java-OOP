package MathOperation;

public class MathOperation {
    public int add (int firstNum, int secondNum){
       return firstNum + secondNum;
    }
    public int add (int firstNum, int secondNum, int thirdNum){
        return add(firstNum, secondNum) + thirdNum;
    }
    public int add (int firstNum, int secondNum, int thirdNum, int fourthNum){
        return add(firstNum, secondNum, thirdNum) + fourthNum;
    }
}
