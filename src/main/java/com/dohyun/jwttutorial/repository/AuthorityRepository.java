package com.dohyun.jwttutorial.repository;

import com.dohyun.jwttutorial.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
