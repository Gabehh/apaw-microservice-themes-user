package es.upm.miw.apaw_microservice_themes_user.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDao extends MongoRepository<User, String> {
}
