/*
The function should have numbers as parameters, preferrably doubles as division with doubles is cleaner.
The function should return doubles as well.
*/

public class CtoF{
	public static double celsiusToFahrenheit(double C){
	    return ((9 * C) / 5) + 32;
	}
	public static double fahrenheitToCelsius(double F) {
		return 5*(F - 32)/9;
	}
    public static void main(String[] args){
    	double cel;
    	double fah = 60.4;
    	cel = fahrenheitToCelsius(fah);
        System.out.printf("%.1f C = %.1f F \n", cel, fah);
		cel = 50;
        fah = celsiusToFahrenheit(cel);
        System.out.printf("%.1f F = %.1f C \n", fah, cel);
    }
}
