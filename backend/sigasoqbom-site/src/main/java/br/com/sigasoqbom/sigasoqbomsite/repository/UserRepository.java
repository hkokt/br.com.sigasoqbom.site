package br.com.sigasoqbom.sigasoqbomsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sigasoqbom.sigasoqbomsite.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}