package studio8;

import java.util.LinkedList;
import java.util.Objects;
import java.util.HashSet;

public class Time {
	private int hour;
	private int minute;
	private boolean format;
	
	/**
	 * 
	 * @param hour
	 * @param minutes
	 * @param format in 12 or 24 hours (if true, 24 hours)
	 */
	public Time(int h, int min, boolean form) {
		hour = h;
		minute = min;
		format = form;
	}
	
	public String toString() {
		if (format) {
			return hour + ":" + minute;
		}
		else {
			if (hour>12) {
				int h = hour-12;
				return h + ":" + minute;
			}
			else {
				return hour + ":" + minute;
			}
		}
	}
	public static void main(String[] args) {
		LinkedList<Time> list = new LinkedList<Time>();
		Time value = new Time(20, 59, false);
		Time value2 = new Time(11, 59, true);
		Time value3 = new Time(23, 13, false);
		Time value4 = new Time(1, 42, false);
		Time value5 = new Time(12, 02, true);
		list.add(value);
		list.add(value2);
		list.add(value3);
		list.add(value4);
		list.add(value5);
		System.out.println(value.toString());
		System.out.println(value.equals(value2));
		System.out.println(list);
		
		//hashset
		HashSet<Time> set = new HashSet<Time>();
		Time hash = new Time(20, 59, false);
		Time hash2 = new Time(20, 59, true);
		Time hash3 = new Time(23, 13, false);
		set.add(hash);
		set.add(hash2);
		set.add(hash3);
		System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	
	
}