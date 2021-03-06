package util;

public class Cuenta {
	private double monto;

	public Cuenta() {
		this.monto = 0;
	}

	public double SaldoDeCuenta() {
		return this.monto;
	}
	
	public String Estado(){
		String estado;
		if (this.monto >= 0){
			estado = "Positivo";
		}else{
			estado = "Negativo";
		}
		
		return estado;
	}

	public void IngresarMonto(double monto) {
		this.monto += Math.abs(monto);
	}

	public void ExtraerMonto(double monto) {
		if (this.monto > 0) {
			this.monto -= Math.abs(monto);
		}
	}

	public void TransferirMontoA(double monto, Cuenta otra) {
		if (this.monto - monto >= 0) {
			this.monto -= monto;
			otra.monto += monto;
		}
	}

	public void VaciarCuenta() {
		this.monto = 0;
	}

	public void FusionarCon(Cuenta B) {
		this.monto += B.monto;
		B.monto = 0;
	}
	
}
