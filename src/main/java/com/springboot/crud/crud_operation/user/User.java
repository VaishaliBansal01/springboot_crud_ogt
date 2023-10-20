package com.springboot.crud.crud_operation.user;

//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
     int id;
     String name;
     String email;



}
