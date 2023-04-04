import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addGroup("Family");
        phoneBook.addGroup("Job");
        phoneBook.addGroup("Friends");

        Contact contact = new Contact("Sasha", "8911");
        Contact contact2 = new Contact("Misha", "12314");
        Contact contact3 = new Contact("Phillip", "51231");

        phoneBook.addContactInGroup(new String[]{"Family", "Friends"}, contact);
        phoneBook.addContactInGroup(new String[]{"Job", "Friends"}, contact2);
        phoneBook.addContactInGroup(new String[]{"Job", "Family"}, contact3);

        phoneBook.printPhoneBook();

        System.out.println("Поиск контакта : 1.По группе 2.По номеру телефона");
        String input = scanner.nextLine();
        int option = Integer.parseInt(input);
        if (option == 1) {
            String name = scanner.nextLine();
            System.out.println(phoneBook.search(name));
        }
        if (option == 2) {
            String number = scanner.nextLine();
            System.out.println(phoneBook.searchPhoneNumber(number));
            
        }else{
          System.out.println("Команда не найдена");
        }
    
    }

}
