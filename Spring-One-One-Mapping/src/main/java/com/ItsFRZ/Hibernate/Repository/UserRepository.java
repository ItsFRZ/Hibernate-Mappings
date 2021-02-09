package com.ItsFRZ.Hibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ItsFRZ.Hibernate.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
