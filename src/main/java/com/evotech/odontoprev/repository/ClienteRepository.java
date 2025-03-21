package com.evotech.odontoprev.repository;

import com.evotech.odontoprev.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
