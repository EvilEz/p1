package com.company.FactorialAndFibonacci;

public class ChoiceOfMethod {



    MethodsFactorial methodsFactorial = new MethodsFactorial();
    MethodsFibonacci methodsFibonacci = new MethodsFibonacci();
    public void ChoiceMethods(int n, int algorithmId, int loopType) throws InsufficientFundsException {
        //выбираем метод через условие и передаем n

        if (algorithmId == 1) {
            methodsFactorial.methodLoopTypeFactorial(n, loopType);
        }
        if (algorithmId == 2) {
            methodsFibonacci.methodLoopTypeFibonacci(n, loopType);
        }
        else {
            throw new InsufficientFundsException("Выбрано неправильное число");
        }
        }
    }

