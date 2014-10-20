/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.temperatureconversion;

import java.text.NumberFormat;

/**
 *
 * @author wsuetholz
 */
public class TempConvertService {

    private static final int DEFAULT_PRECISION = 2;
    
    public double getCelciusFromFahrenheit(double fahrenheit) {
	double celcius = (fahrenheit - 32) * (5.0 / 9.0);

	return celcius;
    }

    public String getCelciusFromFahrenheit(String fahrenheit, int precision) throws NumberFormatException {
	double f = Double.valueOf(fahrenheit);
	double c = getCelciusFromFahrenheit(f);
	
	NumberFormat nf = NumberFormat.getNumberInstance();
	nf.setMaximumFractionDigits(precision);
	String celcius = nf.format(c);//String.format("%.2f", celcius);

	return celcius;
    }

    public String getCelciusFromFahrenheit(String fahrenheit) throws NumberFormatException {
	return getCelciusFromFahrenheit(fahrenheit, DEFAULT_PRECISION);
    }

    public double getFahrenheitFromCelcius(double celcius) {
	double fahrenheit = (celcius * (9.0 / 5.0)) + 32;

	return fahrenheit;
    }

    public String getFahrenheitFromCelcius(String celcius, int precision) throws NumberFormatException {
	double c = Double.valueOf(celcius);
	double f = getFahrenheitFromCelcius(c);
	
	NumberFormat nf = NumberFormat.getNumberInstance();
	nf.setMaximumFractionDigits(precision);
	String fahrenheit = nf.format(f);//String.format("%.2f", celcius);

	return fahrenheit;
    }

    public String getFahrenheitFromCelcius(String celcius) throws NumberFormatException {
	return getFahrenheitFromCelcius(celcius, DEFAULT_PRECISION);
    }

}
