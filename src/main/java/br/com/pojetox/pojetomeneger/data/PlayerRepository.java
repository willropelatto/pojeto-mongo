package br.com.pojetox.pojetomeneger.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.pojetox.pojetomeneger.model.PlayerEntity;

@RepositoryRestResource(collectionResourceRel = "player", path = "player")
public interface PlayerRepository extends MongoRepository<PlayerEntity, String> {

}
