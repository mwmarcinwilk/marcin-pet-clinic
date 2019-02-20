package marcin.spring.marcinpetclinic.model;

import lombok.Data;

@Data

public class Person extends BaseEntity {
    private String firstname;
    private String lastName;
}
