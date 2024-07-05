package com.team;

public class Main {
    public static void main(String[] args) {
        Integer numero1 = 1;
        Integer numero2 = 0;
        ClassException classException = new ClassException(numero1, numero2);
//1
//        try {
//            classException.lancarMinhaException();
//            classException.lancarMinhaException2();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        //2
//        classException.lancarRuntimeException();


        //3
//        classException.testeTryCatchSemErros();

        //4
        classException.testeTryCatchComErro();

    }
}

