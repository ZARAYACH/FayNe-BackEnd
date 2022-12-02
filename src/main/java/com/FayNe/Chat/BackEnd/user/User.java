package com.FayNe.Chat.BackEnd.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "User")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(generator = "uuid1")
    @GenericGenerator(name = "uuid1", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_Number", nullable = false, unique = true)
    private String phoneNumber;

    @Column(name = "last_seen")
    private LocalDateTime lastSeen;

}
