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
}
