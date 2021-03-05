public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        char math = '^';
        if(math == '+') {
            System.out.println(a + "+" + b + "=" + (a+b) + " - " + "Сложение");
        } else if(math == '-') {
            System.out.println(a + "-" + b + "=" + (a-b) + " - " + "Вычитание");
        } else if(math == '*') {
            System.out.println(a + "*" + b + "=" + (a*b) + " - " + "Умножение");
        } else if(math == '/') {
            System.out.println(a + "/" + b + "=" + (a/b) + " - " + "Деление");
        } else if(math == '^') {
            System.out.println(a + "^" + a + "=" + (a*a) + " - " + "Возведение в степень");
        } else if(math == '%') {
            System.out.println(a + "%" + b + "=" + (a%b) + " - " + "Деление по модулю");
        }
    }
}