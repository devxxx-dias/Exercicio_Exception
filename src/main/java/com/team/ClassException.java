package com.team;

public class ClassException {
    Integer numero1;
    Integer numero2;

    public ClassException(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
    }


    public Integer gerarErroDivisaoPorZero() {
        return numero1 / 0;
    }


    public void lancarMinhaException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Lancando minha Runtime exception");
        }
    }

    public void lancarMinhaException2() {
        try {
            lancarMinhaException();
        } catch (Exception e) {
            System.out.println("Lancando minha exception chamando um metodo com checagem");
        }

    }

    public void lancarRuntimeException() {
        throw new RuntimeException("lancando runtime exception");
    }

    public void testeTryCatchSemErros(){
        try {
            System.out.println("Depois do try");
        }catch (RuntimeException e){
            System.out.println("Dentro do Catch");
        }finally {
            System.out.println("Dentro do finally");
        }
    }

    public void testeTryCatchComErro(){
        try {
            System.out.println("Depois do try Antes do Erro");
            lancarRuntimeException();
            System.out.println("Dentro do try Apos o Erro");
        }catch (RuntimeException e){
            System.out.println("Dentro do Catch com erro");
        }finally {
            System.out.println("Dentro do finally com erro");
        }
    }

}
