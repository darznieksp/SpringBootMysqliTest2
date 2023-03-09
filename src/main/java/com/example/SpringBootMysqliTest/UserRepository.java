package com.example.SpringBootMysqliTest;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <Student, Integer> {

}
