package br.com.pojetox.pojetomeneger.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "id")
@Document(collection = "players")
@TypeAlias("player")
public class PlayerEntity {

	@Id
	private String id;

	private String position;
	private String name;
	private Integer baseId;
	private Integer rating;
	private String originalId;
	private String clubName;
	private int height;
	private int weight;
	private int age;
	private String foot;
	private String atkWorkRate;
	private String defWorkRate;
	private PlayerStatus status;
	private String league;
	private String team;
	private List<PlayerAttribute> attributes;

}
