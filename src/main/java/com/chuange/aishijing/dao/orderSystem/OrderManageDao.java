package com.chuange.aishijing.dao.orderSystem;


import com.chuange.aishijing.pojo.ordermanage.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.ordermanage.Order.class, idClass = Long.class)
public interface OrderManageDao extends JpaRepository<Order, Long>,JpaSpecificationExecutor<Order>{
	/**
	 * 条件查询视频信息
	 * @param spec
	 * @param pageable
	 * @return
	 */
	Page<Order> findAll(Specification<Order> spec, Pageable pageable);
	/**
	 * 更新
	 */
	//<S extends Order> S saveAndFlush(Order manager);
}
