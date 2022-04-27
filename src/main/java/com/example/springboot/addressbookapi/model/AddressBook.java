package com.example.springboot.addressbookapi.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AddressBook {
    private String name;
    private List<Contact> contact;
}
