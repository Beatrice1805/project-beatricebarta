package org.fastrackit.onlineshopbeatricebarta.persistance;

import org.fastrackit.onlineshopbeatricebarta.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(@Param("role") String role);
}
