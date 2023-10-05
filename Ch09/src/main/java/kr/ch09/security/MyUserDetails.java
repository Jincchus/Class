package kr.ch09.security;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class MyUserDetails implements UserDetails{
	private static final long serialVersionUID = 1L;
	
	private String uid;
	private String pass;
	private String name;
	private int age;
	private String hp;
	private String role;
	private LocalDateTime regDate;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// 계정이 갖는 권한 목록
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(role));
		
		return authorities;
	}
	@Override
	public String getPassword() {
		// 계정이 갖는 비밀번호
		return pass;
	}
	@Override
	public String getUsername() {
		// 계정이 갖는 아이디
		return uid;
	}
	@Override
	public boolean isAccountNonExpired() {
		// 계정 만료 여부(true:만료 안됨, false:만료)
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// 계정 잠김 여부(true:잠김 안됨, false:잠김)
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// 계정 비밀번호 만료 여부(true:만료 안됨, false:만료)
		return true;
	}
	@Override
	public boolean isEnabled() {
		// 계정 활성화 여부(true:활성화, false:비활성화)
		return true;
	}
}
