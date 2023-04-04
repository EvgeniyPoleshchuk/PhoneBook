import java.util.*;

public class PhoneBook {
    private final Map<String, List<Contact>> phoneBook = new HashMap<>();

    public void addGroup(String name) {
        phoneBook.put(name, new ArrayList<>());
    }

    public void addContactInGroup(String[] nameGroup, Contact contact) {
        for (String group : nameGroup) {
            if (!phoneBook.containsKey(group)) {
                System.out.println(Arrays.toString(nameGroup) + " Такой группы нет");
              break;
            } else {
                List<Contact> list = phoneBook.get(group);
                list.add(contact);
            }
        }
    }

    public void printPhoneBook() {
        for (Map.Entry<String, List<Contact>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public String search(String nameGroup) {
        if (phoneBook.containsKey(nameGroup)) {
            return phoneBook.get(nameGroup).toString();
        } else {
            return null;
        }
    }

    public Contact searchPhoneNumber(String number) {
        for (Map.Entry<String, List<Contact>> kv : phoneBook.entrySet()) {
            for (Contact list : kv.getValue()) {
                if (number.equals(list.getPhoneNumber())) {
                    return list;
                }
            }
        }
        return null;
    }

}











