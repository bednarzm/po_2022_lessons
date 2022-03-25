package pl.edu.pw.mini.po.extended.moto;

public abstract class PoweredVehicle extends Vehicle {
	private int enginePower;

	public PoweredVehicle(int enginePower) {
		super();
		this.enginePower = enginePower;
	}
	
}
