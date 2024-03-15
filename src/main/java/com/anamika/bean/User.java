package com.anamika.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
	
	@Getter
	@Setter
	private String username;
	
	@Getter
	@Setter
	private String password;

}
