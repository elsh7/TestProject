/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package to;

import java.text.SimpleDateFormat;

/**
 *
 * @author mbrown15
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    
    public Address(String str, String city, String st, String zip) {
    	street = str;
    	this.city = city;
    	state = st;
    	this.zip = zip;    	
    }
    
    public Address clone() {
    	Address add = new Address(this.street, this.city, this.state, this.zip);
    	return add;
    }
    
    public Address(String line) {
    	 street = line.substring(line.indexOf("<street>") + 8, line.indexOf("</street>"));
	     city = line.substring(line.indexOf("<city>") + 6, line.indexOf("</city>"));
	     state = line.substring(line.indexOf("<state>") + 7, line.indexOf("</state>"));
	     zip = line.substring(line.indexOf("<zip>") + 5, line.indexOf("</zip>"));
    }
    
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	
    public String toString()
    {
        return "<address>" +
                "<street>" + street + "</street>" +
                "<city>" + city + "</city>" +
                "<state>" + state + "</state>" +
                "<zip>" + zip + "</zip>" + 
                "</address>";
    }
    
}
