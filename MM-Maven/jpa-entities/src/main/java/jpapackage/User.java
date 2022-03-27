package jpapackage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class User {

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

}
