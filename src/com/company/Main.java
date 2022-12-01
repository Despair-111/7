package com.company;


import java.util.Scanner;

public class Main {
    public static boolean checkCorrect(String login, String password, String confirmPassword, String regex) {
        boolean a = true;
        try {
            if(!login.matches(regex)) {
                throw new  WrongLoginException("Неверный логин");
            }
            else if (!password.matches(regex)){
                throw new WrongPasswordException("Неверный пароль");
            }
            else if(!confirmPassword.equals(password)){
                throw new WrongPasswordException("Пароли не совпадают");
            }
        }
        catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e);
            a = false;
        }
        return a;
    }

    public static void main(String[] args) {

        String regex ="[\\w]{1,20}";
        Scanner loginScanner = new Scanner(System.in);
        Scanner passwordScanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = loginScanner.nextLine();
        System.out.println("Введите пароль");
        String password = passwordScanner.nextLine();
        System.out.println("Повторите пароль");
        String confirmPassword = passwordScanner.nextLine();
        System.out.println(checkCorrect(login,password,confirmPassword,regex));

    }
}
