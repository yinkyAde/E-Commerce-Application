package com.app.repositories.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.role.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
