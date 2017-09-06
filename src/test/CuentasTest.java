package test;

import org.junit.Assert;
import org.junit.Test;

import util.Cuenta;

public class CuentasTest {

	@Test
	public void abrirCuenta() { // Verifica que abra una nueva cuenta con monto
								// en 0
		Cuenta cuentaA = new Cuenta();
		Assert.assertTrue(cuentaA.SaldoDeCuenta() == 0);
	}

	@Test
	public void sumarUnMonto() { // Verifica que se sume un monto determinado a
									// una cuenta;
		Cuenta cuentaA = new Cuenta();
		cuentaA.IngresarMonto(40);
		Assert.assertTrue(cuentaA.SaldoDeCuenta() == 40);
	}

	@Test
	public void restarMonto() { // Verifica que se reste correctamente un monto
								// a una determinada cuenta
		Cuenta cuentaA = new Cuenta();
		cuentaA.IngresarMonto(100);
		cuentaA.ExtraerMonto(150);
		Assert.assertTrue(cuentaA.SaldoDeCuenta() == -50);
	}

	@Test
	public void transferirMontoA() { // Verifica que se transfiera un monto de
										// una cuenta a otra.
		Cuenta cuentaA = new Cuenta();
		Cuenta cuentaB = new Cuenta();
		cuentaA.IngresarMonto(100);
		cuentaA.TransferirMontoA(100, cuentaB);
		Assert.assertTrue(cuentaB.SaldoDeCuenta() == 100 && cuentaA.SaldoDeCuenta() == 0);
	}

	@Test
	public void transferirCapitalExcedido() { // Verifica que si quiero
												// transferir mas del monto que
												// posee una cuenta no opera
		Cuenta cuentaA = new Cuenta();
		Cuenta cuentaB = new Cuenta();
		cuentaA.IngresarMonto(100);
		cuentaA.TransferirMontoA(400, cuentaB);
		Assert.assertTrue(cuentaB.SaldoDeCuenta() == 0 && cuentaA.SaldoDeCuenta() == 100);
	}

	@Test
	public void vaciarCuenta() { // Verifica que si vacio una cuenta, ponga su
									// monto en 0
		Cuenta cuentaA = new Cuenta();
		cuentaA.IngresarMonto(1500);
		cuentaA.VaciarCuenta();
		Assert.assertTrue(cuentaA.SaldoDeCuenta() == 0);
	}

	@Test
	public void fusionarCuentas() { // Verifica que se fusionen 2 cuentas(una se
									// le incrementa el monto, la otra queda en
									// 0)
		Cuenta cuentaA = new Cuenta();
		Cuenta cuentaB = new Cuenta();
		cuentaA.IngresarMonto(250);
		cuentaB.IngresarMonto(310);
		cuentaA.FusionarCon(cuentaB);
		Assert.assertTrue(cuentaA.SaldoDeCuenta() == 560 && cuentaB.SaldoDeCuenta() == 0);
	}
	
	@Test
	public void EstadoDeLaCuenta() { //Verifica que indique si la cuenta esta con 
									 //Saldo positivo o Negativo
		Cuenta cuentaA = new Cuenta();
		Cuenta cuentaB = new Cuenta();
		cuentaA.IngresarMonto(150);
		cuentaB.ExtraerMonto(100);
		Assert.assertTrue(cuentaA.Estado() == "Positivo" && cuentaB.Estado() == "Negativo");
	}
	

}
