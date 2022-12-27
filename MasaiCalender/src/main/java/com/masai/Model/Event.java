package com.masai.Model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eventId;
	
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date startDate;
	
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date endDate;
	
	private String time;
	
	private String descr;
	
	@NotNull(message = "type can not be null, make it recurring or non-recurring even")
	private String type;
	
	@ManyToOne
	private User user;
	
	
	public Event() {
		// TODO Auto-generated constructor stub
	}


	public Event(Integer eventId, Date startDate, Date endDate, String time, String descr,
			@NotNull(message = "type can not be null, make it recurring or non-recurring even") String type,
			User user) {
		super();
		this.eventId = eventId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.time = time;
		this.descr = descr;
		this.type = type;
		this.user = user;
	}


	public Integer getEventId() {
		return eventId;
	}


	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getDescr() {
		return descr;
	}


	public void setDescr(String descr) {
		this.descr = descr;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", startDate=" + startDate + ", endDate=" + endDate + ", time=" + time
				+ ", descr=" + descr + ", type=" + type + ", user=" + user + "]";
	}
	
	
	
}
