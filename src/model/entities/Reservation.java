package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private static SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer _roomNumber;
	private Date _checkin;
	private Date _checkout;

	public Reservation() {

	}

	public Reservation(Integer _roomNumber, Date _checkin, Date _checkout) {

		this._roomNumber = _roomNumber;
		this._checkin = _checkin;
		this._checkout = _checkout;

	}

	public Integer getRoomumber() {

		return this._roomNumber;
	}

	public void setRoomnumber(Integer _roomNumber) {

		this._roomNumber = _roomNumber;
	}

	public Date getCheckin() {

		return this._checkin;
	}

	public Date getCheckout() {

		return this._checkout;

	}

	public long duration() {

		long diff = this.getCheckout().getTime() - this.getCheckin().getTime();

		return  TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}

	public void updateDates(Date _checkin, Date _checkout) {

		this._checkin = _checkin;
		this._checkout = _checkout;

	}

	@Override
	public String toString() {
		
		
		return "Reservation: Room"+ this.getRoomumber() +" , check-in: "+ spf.format(this.getCheckin()) +", check-out: "+spf.format(this.getCheckout())+", "+this.duration()+" nights\n"; 
	
	
	}
	
	
}
