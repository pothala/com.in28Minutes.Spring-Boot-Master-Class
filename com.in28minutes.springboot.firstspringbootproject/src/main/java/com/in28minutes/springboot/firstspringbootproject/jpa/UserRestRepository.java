package com.in28minutes.springboot.firstspringbootproject.jpa;

import com.in28minutes.springboot.firstspringbootproject.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRestRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findByRole(@Param("role") String role);
    List<User> findByName(@Param("name") String name);
    List<User> findByNameIgnoreCase(@Param("name") String name);

}
