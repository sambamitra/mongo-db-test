package com.example.beans;

public class Coordinates {
	private double lat;
	private double lon;

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public Coordinates(double lat, double lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}

}
