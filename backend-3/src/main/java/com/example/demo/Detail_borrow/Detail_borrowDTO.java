package com.example.demo.Detail_borrow;

import java.util.Date;


public class Detail_borrowDTO {
	private long id;
	private String Borrow_date;
	private String Return_date;
	private String Created_by;
	private Date Update_date;
	private long Quantity;
	private String Note;
	private Boolean status;
	private Boolean Is_delete= Boolean.FALSE;
	private long user_id;
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBorrow_date() {
		return Borrow_date;
	}
	public void setBorrow_date(String borrow_date) {
		Borrow_date = borrow_date;
	}
	public String getReturn_date() {
		return Return_date;
	}
	public void setReturn_date(String return_date) {
		Return_date = return_date;
	}
	public String getCreated_by() {
		return Created_by;
	}
	public void setCreated_by(String created_by) {
		Created_by = created_by;
	}

	public Date getUpdate_date() {
		return Update_date;
	}
	public void setUpdate_date(Date update_date) {
		Update_date = update_date;
	}
	public long getQuantity() {
		return Quantity;
	}
	public void setQuantity(long quantity) {
		Quantity = quantity;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getIs_delete() {
		return Is_delete;
	}
	public void setIs_delete(Boolean is_delete) {
		Is_delete = is_delete;
	}
	
	public Detail_borrowDTO(String borrow_date, String return_date, String created_by, Date update_date, long quantity,
			String note, Boolean status, Boolean is_delete, long user_id) {
		super();
		Borrow_date = borrow_date;
		Return_date = return_date;
		Created_by = created_by;
		Update_date = update_date;
		Quantity = quantity;
		Note = note;
		this.status = status;
		Is_delete = is_delete;
		this.user_id = user_id;
	}
	public Detail_borrowDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
