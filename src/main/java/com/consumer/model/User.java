package com.consumer.model;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String firstName;
    private String lastName;
}
