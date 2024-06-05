package com.projectsweb.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsweb.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
