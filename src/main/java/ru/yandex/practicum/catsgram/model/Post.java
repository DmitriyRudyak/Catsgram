package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.time.Instant;

@Data
//@Value
@EqualsAndHashCode(of = {"id"})
public class Post {
	Long id;
	long authorId;
	String description;
	Instant postDate;
}