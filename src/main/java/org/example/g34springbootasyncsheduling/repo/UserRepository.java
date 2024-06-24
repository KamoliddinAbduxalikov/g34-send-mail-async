package org.example.g34springbootasyncsheduling.repo;

import org.example.g34springbootasyncsheduling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


  @Query("select u from User u where u.email = ?1 and u.password = ?2")
  Optional<User> findByEmailAndPassword(String email, String password);

  @Transactional
  @Modifying
  @Query("update User u set u.email = ?1, u.password = ?2 where u.id = ?3")
  void updateEmailAndPasswordById(String email, String password, Long id);
}