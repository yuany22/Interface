package com.chuange.aishijing.dao.dict;

import com.chuange.aishijing.dic.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;
import java.util.Optional;

@RepositoryDefinition(domainClass=com.chuange.aishijing.dic.Dictionary.class, idClass = Integer.class)
public interface DictDao  extends JpaRepository<Dictionary, String>{
	 List<Dictionary> findAllByTypeCode(String typeCode) ;
	 Optional<Dictionary> findByTypeCodeContainingAndValueContaining(String typecode, String value) ;
}
