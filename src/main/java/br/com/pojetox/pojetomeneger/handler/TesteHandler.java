package br.com.pojetox.pojetomeneger.handler;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pojetox.pojetomeneger.data.PlayerRepository;
import br.com.pojetox.pojetomeneger.model.Attributes;
import br.com.pojetox.pojetomeneger.model.PlayerAttribute;
import br.com.pojetox.pojetomeneger.model.PlayerEntity;

@RestController
public class TesteHandler {

	@Autowired
	private PlayerRepository repo;

	@CrossOrigin
	@RequestMapping("/abs")
	public HttpEntity<String> test() {
		PlayerEntity player = new PlayerEntity();
		player.setName("Abelardo Silva");
		player.setAge(20);
		player.setPosition("ST");
		player.setAttributes(
				Arrays.asList(new PlayerAttribute(Attributes.PAC, 90), new PlayerAttribute(Attributes.DEF, 45),
						new PlayerAttribute(Attributes.DRI, 69), new PlayerAttribute(Attributes.PAS, 85),
						new PlayerAttribute(Attributes.SHO, 78), new PlayerAttribute(Attributes.PHY, 96)));
		repo.save(player);
		return new ResponseEntity<>("Olá", HttpStatus.OK);

	}

}
