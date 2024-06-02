package br.com.programacao.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.programacao.portifolio.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
