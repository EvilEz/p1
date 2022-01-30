package com.company.FactorialAndFibonacci;

public class MethodsFactorial {

    public void methodLoopTypeFactorial(int loopType, int n) throws InsufficientFundsException {

        switch (loopType) {
            case 1:
                factorialDoWhile(n);
                break;
            case 2:
                factorialWhile(n);
                break;
            case 3:
                factorialFor(n);
                break;
            case 4:
                throw new InsufficientFundsException("Выбрано неправильное число");
        }
    }


    public int factorialDoWhile (int n){
        int fact = n;
        int numb1 = 1;
        int firstNumb = 1;
        do {
            numb1 = numb1 * firstNumb;
            firstNumb++;
            numb1 = n;
        } while (firstNumb<=fact);
        return n;
    }


    public int factorialWhile(int n){
        int factorialNumb = n;
        int fact = 1;
        int firstNumbOnFactorial = 1;

        while (firstNumbOnFactorial<=factorialNumb){
            fact = fact * firstNumbOnFactorial;
            firstNumbOnFactorial++;
        }
       return factorialNumb;
    }

    public int factorialFor(int n) {
        int factNumb = 5;
        int numb1 = n;

        for (int i = 1; i <=factNumb; i++) {
            numb1 = numb1 * i;
        }
        return n;
    }

}

