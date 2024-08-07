package com.kalaiselvan.practiceApplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalaiselvan.practiceApplication.models.ERole;
import com.kalaiselvan.practiceApplication.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	Optional<Role> findByName(ERole name);
	
}
