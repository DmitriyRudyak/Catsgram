package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.time.Instant;

@Data
@Value
@EqualsAndHashCode (of = {"email"})
public class User {
	Long id;
	String username;
	String email;
	String password;
	Instant registrationDate;
}