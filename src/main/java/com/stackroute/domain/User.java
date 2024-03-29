package com.stackroute.domain;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private String role;
    @Id
    private String emailId;
    private String password;

}
