package com.example.sample1.Repository;

import com.example.sample1.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {

        Users findByFirstnameAndRollno(String rollno,int fs);

}
