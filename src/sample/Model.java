package sample;

public class Model {
    public int calculate(int num1, int num2,char operator){
        switch (operator){
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
        }
        return 0;

    }
}
