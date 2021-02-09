package com.ItsFRZ.Hibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ItsFRZ.Hibernate.Entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
