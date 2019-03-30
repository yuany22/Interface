package com.chuange.aishijing.dao.loginuser;

import com.chuange.aishijing.pojo.tree.Tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author yuany
 * 获取index页面树结构
 */

@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.tree.Tree.class, idClass = String.class)
public interface IndexDao extends JpaRepository<Tree, String>{
	@Query(value = "select * from asj_tree c where c.resource_type=:resourceType and c.resource_code like CONCAT('%',:resourceCode,'%') ",nativeQuery=true)
	 List<Tree> findAllByResourceTypeAndResourceCode(@Param("resourceType") String resourceType, @Param("resourceCode") String resourceCode);
		// TODO Auto-generated method stub
	 List<Tree> findAllByResourceType(String resourceType);
     @Query(value = "select * from asj_tree t where t.parentid =?1",nativeQuery=true)
	 List<Tree> findAllByParentId(String parentid);
	@Query(value = "update asj_tree t set t.resource_code =?1 where t.resourceid=?2",nativeQuery=true)
	@Modifying
     void updateResourceCodeById(String code, String id);
}
