package fr.iavotra.springpractice.repository;

import fr.iavotra.springpractice.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {

    AppUser findUserByUsername(String userName);

}
