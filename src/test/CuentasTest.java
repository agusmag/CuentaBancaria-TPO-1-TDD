package test;

import org.junit.Assert;
import org.junit.Test;

import util.Cuenta;

public class CuentasTest {

	
	@Test
	public void AbreCuenta(){ //Verifica que abra una nueva cuenta con monto en 0
		Cuenta cuentaA = new Cuenta();
		Assert.assertTrue(cuentaA.Estado() == 0);
	}
	
	@Test
	public void SumarMonto(){ //Verifica que se sume un monto determinado a una cuenta;
		Cuenta cuentaA = new Cuenta();
		cuentaA.SumarMonto(40);
		Assert.assertTrue(cuentaA.Estado() == 40);
	}
	
	@Test
	public void TransferirMontoA(){ //Verifica que se transfiera un monto de una cuenta a otra.
		Cuenta cuentaA = new Cuenta();
		Cuenta cuentaB = new Cuenta();
		cuentaA.SumarMonto(100);
		cuentaA.TransferirMontoA(100,cuentaB);
		Assert.assertTrue(cuentaB.Estado() == 100 && cuentaA.Estado() == 0);
	}
	
	@Test
	public void TransferirMasDelCapital(){ //Verifica que si quiero transferir mas del monto que posee una cuenta no opera
		Cuenta cuentaA = new Cuenta();
		Cuenta cuentaB = new Cuenta();
		cuentaA.SumarMonto(100);
		cuentaA.TransferirMontoA(400,cuentaB);
		Assert.assertTrue(cuentaB.Estado() == 0 && cuentaA.Estado() == 100);
	}
	
	@Test
	public void VaciarCuenta(){ //Verifica que si vacio una cuenta, ponga su monto en 0
		Cuenta cuentaA = new Cuenta();
		cuentaA.SumarMonto(1500);
		cuentaA.VaciarCuenta();
		Assert.assertTrue(cuentaA.Estado() == 0);
	}
	
}
