package reeee;

public class Cirkel {

	public static void main(String[] args) {
		Cirkel cirkel = new Cirkel(5);
		System.out.println(cirkel.getArea());
		System.out.println(cirkel.getOmkrets());
	}

	private double radius;
	private double r2;

	public Cirkel(double radius) {
		this.radius = radius;
		this.r2 = this.radius * 2;
	}

	public double getOmkrets() {
		return r2 * Math.PI;
	}

	public double getArea() {
		return Math.PI * (radius * radius);
	}
}
