package it.epicode.beservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.epicode.beservice.model.Erole;
import it.epicode.beservice.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Optional <Role> findByEroles(Erole erole);


}
