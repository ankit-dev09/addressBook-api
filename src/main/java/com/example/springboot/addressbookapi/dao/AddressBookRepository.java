package com.example.springboot.addressbookapi.dao;

import com.example.springboot.addressbookapi.model.AddressBook;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class AddressBookRepository {

    private List<AddressBook> addressBooks = new ArrayList<>(); // In Memory DB

    public List<AddressBook>  getAddressBooks(){
        return  addressBooks;
    }

    public AddressBook getAddressBook(String name){
        try{
            return addressBooks.stream().filter(t -> t.getName().equals(name)).findFirst().get();
        }catch (NoSuchElementException exception){
            return null;
        }
    }

    public void addAddressBook(AddressBook addressBook){
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

}
