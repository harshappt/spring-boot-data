package com.harsha.spring.boot.data.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findByCustomer(String string);

}
