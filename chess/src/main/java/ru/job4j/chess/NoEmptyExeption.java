package ru.job4j.chess;

public class NoEmptyExeption extends RuntimeException {
    public NoEmptyExeption(String exeption) {
        super(exeption);
    }
}
