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
		cuentaA.sumarMonto(40);
		Assert.assertTrue(cuentaA.Estado() == 40);
	}
	
}
