package com.example.springboot.addressbookapi.services;

import com.example.springboot.addressbookapi.model.AddressBook;
import com.example.springboot.addressbookapi.model.Contact;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class AddressBookService {

    List<AddressBook> addressBooks = new ArrayList<>(Arrays.asList
            ((new AddressBook("AddBook1", new ArrayList<>(Arrays.asList
                    (new Contact("John", 1234568))))), (new AddressBook("AddBook2", new ArrayList<>(Arrays.asList
                    (new Contact("Ankit", 1234569))))), (new AddressBook("AddBook3", new ArrayList<>(Arrays.asList
                    (new Contact("Jasmine", 1234570)))))));

    public List<AddressBook> getAllAddressBooks() {
        return addressBooks;
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }

    public void addAddressBook(AddressBook addressBook) {
        addressBooks.add(addressBook);
    }

    public void updateAddressBook(String name, AddressBook addressBook) {
        for (int index = 0; index < addressBooks.size(); index++) {
            AddressBook addrBook = addressBooks.get(index);
            if (addrBook.getName().equals(name)) {
                addressBooks.set(index, addressBook);
                break;
            }
        }
    }

    public void deleteAddressBook(String name) {
        for (AddressBook addrBook : addressBooks) {
            if (addrBook.getName().equals(name)) {
                addressBooks.remove(addrBook);
                break;
            }
        }
    }

    public Set<Contact> getUniqueContactsFromAllAddressBooks() {
        Set<Contact> uniqueContacts = new HashSet<>();
        for (AddressBook addressBook : addressBooks) {
            List<Contact> distinctElements = addressBook.getContact().stream()
                    .distinct()
                    .collect(Collectors.toList());
            uniqueContacts.addAll(distinctElements);
        }
        return uniqueContacts;
    }
}
