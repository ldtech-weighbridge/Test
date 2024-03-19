package com.ld.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ld.Entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, String> {

	@Query(value="select password from login_entity where role_id=:role and user_id=:user",nativeQuery=true )
	public String checkCredential(String role,String user);
	
}
