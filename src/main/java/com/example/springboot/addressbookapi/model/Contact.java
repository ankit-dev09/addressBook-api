package com.example.springboot.addressbookapi.model;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private String name;
    private Integer number;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Contact other = (Contact) obj;
        
        return Objects.equals(this.name, other.name) && Objects.equals(this.number, other.number);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (this.name != null) {
            hash = 31 * hash + this.name.hashCode();
        }
        if (this.number != null) {
            hash = 31 * hash + this.number.hashCode();
        }
        return hash;
    }
}
