package com.glx.exploration.grpcserver.repository;

import com.glx.exploration.grpcserver.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<Text, Long> {

}
