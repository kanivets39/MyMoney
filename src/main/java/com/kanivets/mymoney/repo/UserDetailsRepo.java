package com.kanivets.mymoney.repo;

import com.kanivets.mymoney.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
