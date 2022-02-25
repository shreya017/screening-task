package com.springboot.file.springfiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.file.springfiles.model.User;
import com.springboot.file.springfiles.repository.SpringReadFileRepository;

@Service
@Transactional
public class SpringReadFileServiceImpl implements SpringReadFileService{
	
	@Autowired private SpringReadFileRepository springReadFileRepository;

	@Override
	public List<User> findAll() {
		return (List<User>) springReadFileRepository.findAll();
	}
	
	
	}

