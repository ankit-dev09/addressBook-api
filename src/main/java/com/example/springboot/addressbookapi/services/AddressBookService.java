package com.example.springboot.addressbookapi.services;

import com.example.springboot.addressbookapi.dao.AddressBookRepository;
import com.example.springboot.addressbookapi.model.AddressBook;
import com.example.springboot.addressbookapi.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class AddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;

    public List<AddressBook> getAllAddressBooks() {
        return addressBookRepository.getAddressBooks();
    }

    public AddressBook getAddressBook(String name) {
       return addressBookRepository.getAddressBook(name);
    }

    public void addAddressBook(AddressBook addressBook) {
        addressBookRepository.addAddressBook(addressBook);
    }

    public void updateAddressBook(String name, AddressBook addressBook) {
        addressBookRepository.updateAddressBook(name,addressBook);
    }

    public void deleteAddressBook(String name) {
        addressBookRepository.deleteAddressBook(name);
    }

    public Set<Contact> getUniqueContactsFromAllAddressBooks() {
        List<AddressBook> addressBooks = addressBookRepository.getAddressBooks();
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
