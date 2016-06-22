package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Елена on 16.06.16.//'^A(*)'
 */
public interface ContactRepository extends JpaRepository<Contact, String> {

        List<Contact> findByNameLike(String name);

    List<Contact> findByNameNotLike(String name);

        List<Contact> findByNameStartingWith(String name);
}
