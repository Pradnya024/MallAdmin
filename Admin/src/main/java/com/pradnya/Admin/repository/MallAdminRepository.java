package com.pradnya.Admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pradnya.Admin.entity.MallAdmin;
@Repository
public interface MallAdminRepository extends JpaRepository<MallAdmin, Integer> {

}
