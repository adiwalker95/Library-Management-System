package edu.mum.lms.entities;

import java.time.LocalDate;

public class CheckInOut {

	public CheckInOut() {
	}

	private Member member;
	private BookCopy copy;
	private LocalDate dueDate;
	private LocalDate checkOutDate;
	private LocalDate returnDate;

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public BookCopy getCopy() {
		return copy;
	}

	public void setCopy(BookCopy copy) {
		this.copy = copy;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate checkInDate) {
		this.returnDate = checkInDate;
	}

}