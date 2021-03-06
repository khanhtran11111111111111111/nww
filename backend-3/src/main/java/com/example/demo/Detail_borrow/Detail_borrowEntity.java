package com.example.demo.Detail_borrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.BookDetail.BookDetailEntity;
import com.example.demo.Users.UsersEntity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@EnableTransactionManagement
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="detail_borrow")
@SQLDelete(sql = "UPDATE detail_borrow SET is_delete = true WHERE id=?")
@Where(clause = "is_delete=false")
public class Detail_borrowEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="borrow_date")
	private String Borrow_date;
	@Column(name="return_date")
	private String Return_date;
	@Column(name="created_by")
	private String Created_by;
	@Column(name="created_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Created_date=new Date();
	@Column(name="update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date Update_date=new Date();
	@Column(name="quantity")
	private long Quantity;
	@Column(name="note")
	private String Note;
	@Column(name="status")
	private Boolean status;
	@Column(name="is_delete")
	private Boolean Is_delete= Boolean.FALSE;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="detail_id",referencedColumnName = "id")
	List<BookDetailEntity> detailsEntities=new ArrayList<>();
	
	public List<BookDetailEntity> getDetailsEntities() {
		return detailsEntities;
	}
	public void setDetailsEntities(List<BookDetailEntity> detailsEntities) {
		this.detailsEntities = detailsEntities;
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
	public Date getCreated_date() {
		return Created_date;
	}
	public void setCreated_date(Date created_date) {
		Created_date = created_date;
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
	public Detail_borrowEntity(String borrow_date, String return_date, String created_by, Date created_date,
			Date update_date, long quantity, String note, Boolean status, Boolean is_delete) {
		super();
		Borrow_date = borrow_date;
		Return_date = return_date;
		Created_by = created_by;
		Created_date = created_date;
		Update_date = update_date;
		Quantity = quantity;
		Note = note;
		this.status = status;
		Is_delete = is_delete;
	}
	public Detail_borrowEntity() {

	}
	
	
}
