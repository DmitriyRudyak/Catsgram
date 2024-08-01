package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Data
@Value
@EqualsAndHashCode(of = {"id"})
public class Image {
	Long id;
	long postId;
	String originalFileName;
	String filePath;
}