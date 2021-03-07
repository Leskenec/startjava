public class Calculator {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int result = 1;
        char mathSymbol = '^';
        if(mathSymbol == '+') {
            System.out.println(a + " + " + b + " = " + (a + b) + " - " + "Сложение");
        } else if(mathSymbol == '-') {
            System.out.println(a + " - " + b + " = " + (a - b) + " - " + "Вычитание");
        } else if(mathSymbol == '*') {
            System.out.println(a + " * " + b + " = " + (a * b) + " - " + "Умножение");
        } else if(mathSymbol == '/') {
            System.out.println(a + " / " + b + " = " + (a / b) + " - " + "Деление");
        } else if(mathSymbol == '^') {
            for(int n = 0; n < b; n++) {
                result = result * a;
            }
            System.out.println(a + " ^ " + b + " = " + (result) + " - " + "Возведение в степень");
        } else if(mathSymbol == '%') {
            System.out.println(a + " % " + b + " = " + (a % b) + " - " + "Деление по модулю");
        }
    }
}