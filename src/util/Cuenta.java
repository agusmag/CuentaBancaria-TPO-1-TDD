package util;

public class Cuenta {
	private double monto;
	
	
	public Cuenta(){
		this.monto = 0;
	}
	
	public double Estado(){
		return this.monto;
	}
	
	public void SumarMonto(double monto){
		this.monto += monto;
	}
	
	public void TransferirMontoA(double monto,Cuenta otra){
		if (this.monto - monto >= 0){
			this.monto -= monto;
			otra.monto += monto;
		}
	}
}
