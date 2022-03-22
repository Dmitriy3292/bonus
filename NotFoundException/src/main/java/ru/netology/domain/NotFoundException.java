package ru.netology.domain;

public class NotFoundException extends RuntimeException{


    public NotFoundException(int id) {
        super("Данного id  не существует , вы ввели " + id);
    }

}
