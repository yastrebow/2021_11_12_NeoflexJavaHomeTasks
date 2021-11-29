package Task_1_PhoneBook;

//1. Реализовать сущность, которая будет использоваться для хранения контактов в телефоне.
//Контакт представляет собой пару значений телефон-имя, например “89003337788 - Вася”.
//Одному контакту может соответствовать несколько разных телефонов
//Можно добавить новый контакт. Если происходит попытка добавления существующего контакта, то ничего не меняется.
//Можно найти телефон, указав имя контакта. Если такого контакта нет, возвращается null.
//Если контакт есть, то возвращается массив телефонов.
//Можно получить массив всех контактов, указав часть имени.

import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook();

        myPhoneBook.addContact("Sergio", List.of("+79219260000", "+79117005555"));
        myPhoneBook.addContact("Hullo", List.of("+79219153333", "+79117005555", "+79816555566"));
        myPhoneBook.addContact("Maria", List.of("+79509993366"));
        myPhoneBook.addContact("Larissa", List.of("+79118884455"));
        myPhoneBook.addContact("Maria", List.of("+79047985432"));

        System.out.println(myPhoneBook.getNumberByName("Maria"));

        System.out.println(myPhoneBook.getContactsByPartOfName("ar"));

    }





}
