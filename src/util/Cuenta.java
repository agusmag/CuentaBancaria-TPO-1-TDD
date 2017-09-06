package util;

public class Cuenta {
	private double monto;
	
	
	public Cuenta(){
		this.monto = 0;
	}
	
	public double SaldoDeCuenta(){
		return this.monto;
	}
	
	public void IngresarMonto(double monto){
		this.monto += monto;
	}
	
	public void TransferirMontoA(double monto,Cuenta otra){
		if (this.monto - monto >= 0){
			this.monto -= monto;
			otra.monto += monto;
		}
	}
	
	public void VaciarCuenta(){
		this.monto = 0;
	}
	
	 public void FusionarCon(Cuenta B){
		this.monto += B.monto;
	}
}
