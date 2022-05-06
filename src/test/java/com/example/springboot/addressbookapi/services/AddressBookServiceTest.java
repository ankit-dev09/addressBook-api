package com.example.springboot.addressbookapi.services;

import com.example.springboot.addressbookapi.dao.AddressBookRepository;
import com.example.springboot.addressbookapi.model.AddressBook;
import com.example.springboot.addressbookapi.model.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ExtendWith({MockitoExtension.class})
public class AddressBookServiceTest {

    @InjectMocks
    private AddressBookService addressBookService;

    @Mock
    private AddressBookRepository addressBookRepository;

    private List<AddressBook> addressBooks = Arrays.asList(new AddressBook("AddBook1", new ArrayList<Contact>(Arrays.asList(new Contact("Ankit",123456789)))),
            new AddressBook("AddBook2", new ArrayList<Contact>(Arrays.asList(new Contact("David",986587905)))),
            new AddressBook("AddBook3", new ArrayList<Contact>(Arrays.asList(new Contact("David",986587905)))));


    @Test
    @DisplayName("This should pass when all address books are getting retrieved successfully")
    public void testGetAllAddressBooks(){
        Mockito.when(addressBookRepository.getAddressBooks()).thenReturn(addressBooks);
        Assertions.assertEquals(3, addressBookService.getAllAddressBooks().size());
    }

    @Test
    @DisplayName("This should pass when a specific address book is retrieved by name")
    public void testGetAddressBook(){
        AddressBook addressBook = new AddressBook("AddBook4", new ArrayList<Contact>(Arrays.asList(new Contact("Rebecca",234433234))));
        Mockito.when(addressBookRepository.getAddressBook(Mockito.anyString())).thenReturn(addressBook);
        Assertions.assertEquals("AddBook4", addressBookService.getAddressBook("AddBook4").getName());
    }

    @Test
    @DisplayName("This should pass when all unique addressBooks are retrieved")
    public void testGetUniqueContactsFromAllAddressBooks(){
        Mockito.when(addressBookRepository.getAddressBooks()).thenReturn(addressBooks);
        Assertions.assertEquals(2, addressBookService.getUniqueContactsFromAllAddressBooks().size());

    }

}
