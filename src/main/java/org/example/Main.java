package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.passport = "4444 №444444";
        post.subscription = true;
        System.out.println("День: " + post.birthday.day);
        System.out.println("Месяц: " + post.birthday.month);
        System.out.println("Год: " + post.birthday.year);
        System.out.println("Имя: " + post.name);
        System.out.println("Фамилия: " + post.surname);
        System.out.println("Отчество: " + post.patronymic);
        System.out.println("Телефон: " + post.phone);
        System.out.println("Паспорт: " + post.passport);

    }
}