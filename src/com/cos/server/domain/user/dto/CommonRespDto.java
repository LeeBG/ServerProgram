package com.cos.server.domain.user.dto;

import lombok.Data;

@Data
public class CommonRespDto<T>{
	private int statusCode;	//1, -1
	private T data;
}
