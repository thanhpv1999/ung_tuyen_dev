package com.nhom20.cimeemappserver.service;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.modelmapper.internal.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.amazonaws.services.identitymanagement.model.User;
import com.nhom20.cimeemappserver.dao.LocationDao;
import com.nhom20.cimeemappserver.dao.UserDao;
import com.nhom20.cimeemappserver.entity.Location;
import com.nhom20.cimeemappserver.entity.Users;


@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationDao locationDao;

	@Override
	public List<Location> getListLocation() {
		// TODO Auto-generated method stub
		return locationDao.findAll();
	}

	@Override
	public void saveLocAndBook(String location, String movieId) {
		// TODO Auto-generated method stub
		locationDao.saveLocAndBook( location,  movieId) ;
	}
	

	
}
