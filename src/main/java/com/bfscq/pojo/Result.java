package com.bfscq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

//统一响应结果
//@Data
//@AllArgsConstructor
public class Result<T> {
	private Integer code;// 业务状态码 0-成功 1-失败
	private String message;// 提示信息
	private T data;// 响应数据

	/*
	 * ALL构造
	 */
	public Result(Integer code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/*
	 * 构造
	 */
	public Result() {
		super();
	}

	// 快速返回操作成功响应结果(带响应数据)
	public static <E> Result<E> success(E data) {
		return new Result<>(0, "操作成功", data);
	}

	// 快速返回操作成功响应结果
	public static Result success() {
		return new Result(0, "操作成功", null);
	}

	public static Result error(String message) {
		return new Result(1, message, null);
	}

	
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	

}
