package com.example.demo.vo;

import lombok.Data;

// 롬복 = 겟터셋터
@Data
public class UsersVO {

	private String id;
	private String pw;
	private String name;
	private boolean isUser;
}
