package com.example.demo.service;

import com.example.demo.dao.dao.AdminDao;
import com.example.demo.dao.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private AdminDao adminDao;

    public String showUsername(Integer Id) {
        Admin admin = adminDao.selectById(Id);
        return admin.getUsername();
    }
}
