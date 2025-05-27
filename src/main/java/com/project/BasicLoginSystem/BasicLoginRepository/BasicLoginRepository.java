package com.project.BasicLoginSystem.BasicLoginRepository;

import com.project.BasicLoginSystem.Model.BasicLoginModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicLoginRepository extends JpaRepository<BasicLoginModel, Long> {
}
