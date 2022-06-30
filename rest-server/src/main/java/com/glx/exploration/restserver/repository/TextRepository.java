package com.glx.exploration.restserver.repository;

import com.glx.exploration.restserver.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<Text, Long> {

}
