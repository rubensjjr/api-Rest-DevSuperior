package rubensProjetos.com.apiCrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rubensProjetos.com.apiCrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
