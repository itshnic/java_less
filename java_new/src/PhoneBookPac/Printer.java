package PhoneBookPac;
import java.util.*;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public void add(String name, Integer phoneNum) {
        String nameFormat = name.toUpperCase();
        if (phoneBook.containsKey(nameFormat)) {
            phoneBook.get(nameFormat).add(phoneNum);
        } else {
            ArrayList<Integer> number = new ArrayList<>();
            number.add(phoneNum);
            phoneBook.put(nameFormat, number);
        }
    }

    public ArrayList<Integer> find(String name) {
        for (var item : phoneBook.entrySet()) {
            if (item.getKey().equals(name.toUpperCase()))
                return item.getValue();
        }
        return new ArrayList<Integer>();
    }

    public static LinkedHashMap<String, ArrayList<Integer>> getPhoneBook() {
        Map<String, Integer> sortPhoneBook = new TreeMap<>();
        LinkedHashMap<String, ArrayList<Integer>> reversePhoneBook = new LinkedHashMap<>();
        phoneBook.forEach((key, value) -> sortPhoneBook.put(key, value.size()));
        sortPhoneBook.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> reversePhoneBook.put(e.getKey(), phoneBook.get(e.getKey())));
        return reversePhoneBook;
    }
}

public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3 = null;
        int phone1;
        int phone2;
        int phone3 = 0;
        int phone4 = 0;
        int phone5 = 0;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            name3 = "Gek";
            phone1 = 123456;
            phone2 = 12311456;
            phone3 = 655321;
            phone4 = 65433321;
            phone5 = 65437421;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name2, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name2, phone3);
        myPhoneBook.add(name2, phone5);
        myPhoneBook.add(name3, phone3);
        myPhoneBook.add(name3, phone4);
        myPhoneBook.add(name3, phone5);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}

