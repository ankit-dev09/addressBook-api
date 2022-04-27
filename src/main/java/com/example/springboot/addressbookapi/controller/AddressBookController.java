package com.example.springboot.addressbookapi.controller;

import com.example.springboot.addressbookapi.model.AddressBook;
import com.example.springboot.addressbookapi.model.Contact;
import com.example.springboot.addressbookapi.services.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class AddressBookController {
    @Autowired
    private AddressBookService addressBookService;

    @RequestMapping("/addressBooks")
    public List<AddressBook> getAllAddressBooks() {
        return addressBookService.getAllAddressBooks();
    }

    @RequestMapping("/addressBooks/{name}")
    public AddressBook getAddressBook(@PathVariable String name) {
        return addressBookService.getAddressBook(name);

    }

    @RequestMapping(method = {RequestMethod.POST}, value ="/addressBooks")
    public void addAddressBook(@RequestBody AddressBook addressBook) {
         addressBookService.addAddressBook(addressBook);
    }

    @RequestMapping(method = {RequestMethod.PUT}, value ="/addressBooks/{name}")
    public void updateAddressBook(@PathVariable String name, @RequestBody AddressBook addressBook) {
        addressBookService.updateAddressBook(name, addressBook);
    }

    @RequestMapping(method = {RequestMethod.DELETE}, value ="/addressBooks/{name}")
    public void deleteAddressBook(@PathVariable String name) {
        addressBookService.deleteAddressBook(name);
    }

    @RequestMapping("/addressBooks/uniqueContacts")
    public Set<Contact> getUniqueContactsFromAllAddressBooks() {
        return addressBookService.getUniqueContactsFromAllAddressBooks();
    }

}
