package com.airport.mgmt.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airport.mgmt.dao.UserDao;
import com.airport.mgmt.form.User;

@Service
@Transactional(readOnly=true)
public class AuthUserDetailsService implements UserDetailsService {
	
@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		System.out.println("inside securit");
	//	User user=userDao.getUserByName(userName,p);
		boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
      System.out.println("inside securit");
  //    return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), 
        //      true, true, true, true, getAuthorities(user.getUserType()));
      return null;
	}
	
	public Collection<? extends GrantedAuthority> getAuthorities(String role) {
        List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
        return authList;
    }
public List<String> getRoles(String role) {
	 
    List<String> roles = new ArrayList<String>();

    roles.add("ADMIN");
        roles.add("MANAGER");
    return roles;
}
 
public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
    List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
     
    for (String role : roles) {
        authorities.add(new SimpleGrantedAuthority(role));
    }
    return authorities;
}

}
