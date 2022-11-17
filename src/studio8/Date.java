package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private String month;
	private int day;
	private int year;
	private boolean holiday;
	
	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @param holiday
	 */
	public Date(String m, int d, int y, boolean h) {
		month = m;
		day = d;
		year = y;
		holiday = h;
	}
	
	public String toString() {
		if (holiday) {
			return month + " " + day + " " + year + " is holiday.";
		}
		else {
			return  month + " " + day + " " + year + " is not holiday.";
		} 
	}

	public static void main(String[] args) {
		LinkedList<Date> list = new LinkedList<Date>();
    	Date value = new Date("May", 4, 2022, false);
    	Date value2 = new Date("May", 5, 2022, false);
    	Date value3 = new Date("May", 6, 2022, false);
    	Date value4 = new Date("May", 7, 2022, false);
    	Date value5 = new Date("May", 8, 2022, false);
    	list.add(value);
    	list.add(value2);
    	list.add(value3);
    	list.add(value4);
    	list.add(value5);
    	
		System.out.println(value.toString());
		System.out.println(value.equals(value2));
		System.out.println(list);
		
		//hashset
		HashSet<Date> set = new HashSet<Date>();
		Date hash = new Date("May", 4, 2022, false);
		Date hash2 = new Date("May", 4, 2022, true);
		Date hash3 = new Date("July", 4, 2022, false);
		set.add(hash);
		set.add(hash2);
		set.add(hash3);
		System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}
	
	

}
