package br.com.pojetox.pojetomeneger.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class PlayerAttribute {

	private Attributes attribute;
	private int rating;

}
