package Task_1_PhoneBook;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    Map<String, List<String>> phoneBook = new HashMap<>();

    public void addContact(String name, List<String> numbers) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, numbers);
            System.out.println("Контакт " + name + " c номерами: " + numbers + " успешно добавлен!");
        } else {
            System.out.println("Контакт с таким именем существует");
        }
    }

    public List<String> getNumberByName(String name) {
        ArrayList<String> numbersByName = new ArrayList<String>(phoneBook.get(name));
        return numbersByName;
    }

    public Map<String, List<String>> getContactsByPartOfName(String partOfName) {
        Map<String, List<String>> getContactsByPart = new HashMap<String, List<String>>();

        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            if (name.contains(partOfName)) {
                getContactsByPart.put(name, numbers);
            }
        }
        return getContactsByPart;
    }
}





