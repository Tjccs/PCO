package cad11;

public class PhoneNumber {
	private final short countryCode;
	private final short areaCode;
	private final int number;
	PhoneNumber(int country, int area, int num){
		rangeCheck(country, 999, "country code");
		rangeCheck(area, 999, "area code");
		rangeCheck(num, 9999999, "number");
		countryCode = (short) country; areaCode = (short) area;
		number=num;
	}
	private static void rangeCheck(int arg, int max, String name){
		if (arg<0 || arg>max)
			throw
			new IllegalArgumentException(name +": "+arg);
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof PhoneNumber)) return false;
		PhoneNumber pN = (PhoneNumber) o; 
		return (pN.countryCode == this.countryCode && pN.areaCode == this.areaCode && pN.number == this.number);
	}

	public int hashCode() {
		int hC = 17;
		hC = hC * 31 + areaCode;
		hC = hC * 31 + countryCode;
		hC = hC * 31 + number;
		return hC;
	}
}
