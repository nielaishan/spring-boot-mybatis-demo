package com.example.demo.dao.dao;

import com.example.demo.dao.domain.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    Admin selectById(@Param("id") Integer Id);
}
