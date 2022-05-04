package com.example.springboot.addressbookapi.controller;

import com.example.springboot.addressbookapi.model.AddressBook;
import com.example.springboot.addressbookapi.services.AddressBookService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class AddressBookControllerTest {

    AddressBookService addressBookService = Mockito.mock(AddressBookService.class);

    @Test
    void testGetAllAddressBooks(){

//        AddressBookController addressBookController = new AddressBookController();
//        List<AddressBook> expectedAddressBooks = new ArrayList<>();
//        Mockito.when(addressBookService.getAddressBook(Mockito.anyString())).thenCallRealMethod();
//        Assertions.assertEquals(expectedAddressBooks, addressBookController.getAllAddressBooks());

    }

}
