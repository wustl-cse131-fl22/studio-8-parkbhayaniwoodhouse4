package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date d;
	private Time t;
	
	public Appointment(Date x, Time y) {
		d = x;
		t = y;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(d, t);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(d, other.d) && Objects.equals(t, other.t);
	}
	
	public String toString() {
		return d + " " + t;
	}
	public static void main(String[] args) {
		Appointment value = new Appointment(new Date("September", 18, 2003, false), new Time(12, 13, false));
		Appointment value2 = new Appointment(new Date("December", 25, 2003, false), new Time(2, 34, false));
		Appointment value3 = new Appointment(new Date("September", 18, 2003, false), new Time(12, 13, false));
		LinkedList<Appointment> list = new LinkedList<Appointment>();
		list.add(value);
		list.add(value2);
		list.add(value3);
		System.out.println(list.toString());
		
	}

}
