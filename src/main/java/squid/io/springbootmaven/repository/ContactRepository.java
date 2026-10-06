package squid.io.springbootmaven.repository;

import org.springframework.stereotype.Repository;
import squid.io.springbootmaven.entities.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
    List<Contact> findAll();

    Optional<Contact> findById(Long id);
    void deleteById(Long id);
}
