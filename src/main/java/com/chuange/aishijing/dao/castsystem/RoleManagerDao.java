package com.chuange.aishijing.dao.castsystem;


import com.chuange.aishijing.pojo.castsystem.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.castsystem.Role.class, idClass = String.class)
public interface RoleManagerDao extends JpaRepository<Role, String> {
	 <S extends Role> Page<S> findAll(Specification<S> roles, Pageable pageable) ;
	  <S extends Role> List<S> findAll(Specification<S> role) ;
	 List<Role> findAllByCastid(String castid) ;
	 Role findAllById(String id);
}
