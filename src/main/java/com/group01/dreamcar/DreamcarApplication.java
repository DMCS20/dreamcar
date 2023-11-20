package com.group01.dreamcar;

import com.group01.dreamcar.shared.formulas.CalculadoraGrilla;
import com.group01.dreamcar.shared.formulas.DatosEntrada;
import com.group01.dreamcar.shared.formulas.DatosSalida;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;
import java.util.List;

@SpringBootApplication
public class DreamcarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamcarApplication.class, args);
//		DatosEntrada datosEntrada = new DatosEntrada();
//		datosEntrada.setPrecioVentaActivo(16000.00);
//		datosEntrada.setTipoPlan(36.00);
//		datosEntrada.setCuotaInicialPorcentaje(20.00);
//		datosEntrada.setCuotaFinalPorcentaje(40.00);
//		datosEntrada.setCapitalizacion(1.00);
//		datosEntrada.setPortes(3.50);
//		datosEntrada.setTasaDescuentoPorcentaje(50.00);
//		datosEntrada.setGastosAdmin(3.50);
//		datosEntrada.setSeguroDesgravamenPorcentaje(0.049);
//		datosEntrada.setSeguroRiesgoPorcentaje(0.30);
//		datosEntrada.setTipoPeriodoGracia("T");
//		datosEntrada.setPeriodoGraciaMeses(3);
//		datosEntrada.setCuotasPeriodoGracia(3.00); //
//		datosEntrada.setTasa(15.00);
//		datosEntrada.setTipoTasa("TNA");
//		datosEntrada.setNumeroAnios(3.00);
//		datosEntrada.setTiempoDias(360.00);
//		datosEntrada.setCostesNotariales(100.00);
//		datosEntrada.setCostesRegistrales(75.00);
//		datosEntrada.setGPS(20.00);
//		datosEntrada.setFreqPago(30.00);
//
//
//		List<DatosSalida> datosSalidaList = CalculadoraGrilla.calculadora(datosEntrada);
//
//		for (DatosSalida datoSalida: datosSalidaList) {
//			//System.out.println(datoSalida.getPeriodoGracia());
//			System.out.println("DATOS SALIDA (GRILLA):");
//
//			// -----------
//			System.out.println(datoSalida.getSaldoInicialCuotaFinal());
//			System.out.println(datoSalida.getInteresCuotaFinal());
//			System.out.println(datoSalida.getAmortizacionCuotaFinal());
//			System.out.println(datoSalida.getSeguroDesgCuotaFinal());
//			System.out.println(datoSalida.getSaldoFinalCuotaFinal());
//			// -----------
//
//			System.out.println(datoSalida.getSaldoInicialCuota());
//			System.out.println(datoSalida.getInteres());
//			System.out.println(datoSalida.getCuota());
//			System.out.println(datoSalida.getAmortizacion());
//			System.out.println(datoSalida.getSeguroDesgCuota());
//			System.out.println(datoSalida.getSeguroRiesgoGrilla());
//			System.out.println(datoSalida.getGPS());
//			System.out.println(datoSalida.getPortes());
//			System.out.println(datoSalida.getGastosAdmin());
//			System.out.println(datoSalida.getSaldoFinalParaCuota());
//			System.out.println(datoSalida.getFlujo());
//		}
	}

}
