package dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.UserBean;

public interface UserRepository extends JpaRepository<UserBean,Integer>{
		boolean existsByAccount(String account);
		Optional<UserBean> findByAccount(String account);
		
	}
