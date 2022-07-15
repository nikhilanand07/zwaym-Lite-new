package com.example.onenote.repository;

import javax.annotation.Nullable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.onenote.entity.Jobs;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, Integer>{

//	@Query("Delete from Jobs where job_id=?#{[0]}")
//	void deleteByJobId(Integer id);
	
//	@Nullable
//	Iterable<Jobs> findByRole(String job_role);
}
