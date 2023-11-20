package com.group01.dreamcar.shared.formulas;
import com.group01.dreamcar.shared.formulas.DatosSalida;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraGrilla {

    public static List<DatosSalida> calculadora(DatosEntrada datosEntrada) {
        List<DatosSalida> datos = new ArrayList<>();




        //Validacion de Tasa
        double TEA = datosEntrada.calcularTEA(datosEntrada);

        //Financiamiento
        double TEM = Math.pow(1.00 + TEA, datosEntrada.getFreqPago() / 360.00 ) - 1.00;
        double nCuotasxAnio = 360.00 / datosEntrada.getFreqPago();
        double nTotalCuotas = datosEntrada.getTipoPlan();
        double cuotaInicial = datosEntrada.getPrecioVentaActivo() * (datosEntrada.getCuotaInicialPorcentaje() / 100.00);
        double cuotaFinal = datosEntrada.getPrecioVentaActivo() * (datosEntrada.getCuotaFinalPorcentaje() / 100.00);
        double montoPrestamo = datosEntrada.getPrecioVentaActivo() - cuotaInicial + datosEntrada.getCostesNotariales() + datosEntrada.getCostesRegistrales();
        double saldoFinanciarCuotas = (montoPrestamo) - (cuotaFinal / Math.pow(1.00 + TEM + (datosEntrada.getSeguroDesgravamenPorcentaje() / 100.00), nTotalCuotas + 1.00));

        //Costes y gastos periodicos
        double pSeguroDesgrav = datosEntrada.getSeguroDesgravamenPorcentaje() / 100.00;
        double seguroRiesgo = (datosEntrada.getSeguroRiesgoPorcentaje() / 100.00) * datosEntrada.getPrecioVentaActivo() / nCuotasxAnio;

        //Indicadores de rentabilidad
        double tasaDescuentoRentabilidad = Math.pow(1 + (datosEntrada.getTasaDescuentoPorcentaje() / 100.00), (datosEntrada.getFreqPago() / 360.00)) - 1.00;

        System.out.println("DATOS TABLA SUPERIOR");
        System.out.println("TEA: " + TEA);
        System.out.println("TEM: " + TEM);
        System.out.println("nCuotasxAnio: " + nCuotasxAnio);
        System.out.println("nTotalCuotas: " + nTotalCuotas);
        System.out.println("cuotaInicial: " + cuotaInicial);
        System.out.println("cuotaFinal: " + cuotaFinal);
        System.out.println("montoPrestamo: " + montoPrestamo);
        System.out.println("saldoFinanciarCuotas: " + saldoFinanciarCuotas);
        System.out.println("pSeguroDesgrav: " + pSeguroDesgrav);
        System.out.println("seguroRiesgo: " + seguroRiesgo);
        System.out.println("tasaDescuentoRentabilidad: " + tasaDescuentoRentabilidad);


        // Grilla - Regular

        double interes = 0.00;
        double cuota = 0.00;
        double amortizacion = 0.00;
        double seguroDesgCuota = 0.00;
        double seguroRiesgoGrilla = 0.00;
        double GPS = 0.00;
        double portes = 0.00;
        double gastosAdmin = 0.00;
        double saldoFinalParaCuota = 0.00;
        double saldoInicialCuota = saldoFinanciarCuotas;
        //double periodoGracia = datosEntrada.getPeriodoGraciaMeses();
        double periodoGracia = datosEntrada.getCuotasPeriodoGracia();
        double flujo = 0.00;

        // Grilla - Cronograma de la Cuota final o Cuoton

        double saldoInicialCuotaFinal = cuotaFinal / Math.pow(1.00 + TEM + (datosEntrada.getSeguroDesgravamenPorcentaje() / 100.00) , nTotalCuotas + 1.00);
        double interesCuotaFinal = 0.00;
        double amortCuotaFinal = 0.00;
        double seguroDesgCuotaFinal = saldoInicialCuotaFinal * (datosEntrada.getSeguroDesgravamenPorcentaje() / 100.00);
        double saldoFinalCuotaFinal = 0.00;

        System.out.println(nTotalCuotas);
        for (int i = 1; i <= nTotalCuotas; i++) {
            DatosSalida datosSalida = new DatosSalida();

            if (i <= periodoGracia) {
                if (datosEntrada.getTipoPeriodoGracia().equals("T")) {


                    interes = TEM * saldoInicialCuota;
                    cuota = 0.00;
                    amortizacion = 0.00;
                    seguroDesgCuota = saldoInicialCuota * (pSeguroDesgrav);
                    seguroRiesgoGrilla = seguroRiesgo;
                    GPS = datosEntrada.getGPS();
                    portes = datosEntrada.getPortes();
                    gastosAdmin = datosEntrada.getGastosAdmin();
                    saldoFinalParaCuota = saldoInicialCuota + interes;
                    flujo = cuota + seguroDesgCuota + seguroRiesgoGrilla + GPS + portes + gastosAdmin;

                    //Cuoton
                    interesCuotaFinal = saldoInicialCuotaFinal * TEM;
                    amortCuotaFinal = 0.00;
                    seguroDesgCuotaFinal = saldoInicialCuotaFinal * (datosEntrada.getSeguroDesgravamenPorcentaje() / 100.00);
                    saldoFinalCuotaFinal = saldoInicialCuotaFinal + interesCuotaFinal + seguroDesgCuotaFinal + amortCuotaFinal;


                }
                else if (datosEntrada.getTipoPeriodoGracia().equals("P")) {

                    interes = TEM * saldoInicialCuota;
                    cuota = interes;
                    amortizacion = 0.00;
                    seguroDesgCuota = saldoInicialCuota * (pSeguroDesgrav);
                    seguroRiesgoGrilla = seguroRiesgo;
                    GPS = datosEntrada.getGPS();
                    portes = datosEntrada.getPortes();
                    gastosAdmin = datosEntrada.getGastosAdmin();
                    saldoFinalParaCuota = saldoInicialCuota - amortizacion;
                    flujo = cuota + seguroDesgCuota + seguroRiesgoGrilla + GPS + portes + gastosAdmin;

                    //Cuoton
                    interesCuotaFinal = saldoInicialCuotaFinal * TEM;
                    amortCuotaFinal = 0.00;
                    seguroDesgCuotaFinal = saldoInicialCuotaFinal * (datosEntrada.getSeguroDesgravamenPorcentaje() / 100.00);
                    saldoFinalCuotaFinal = saldoInicialCuotaFinal + interesCuotaFinal + seguroDesgCuotaFinal + amortCuotaFinal;


                }
                datosSalida.interes = interes;
                datosSalida.cuota = cuota;
                datosSalida.amortizacion = amortizacion;
                datosSalida.seguroDesgCuota = seguroDesgCuota;
                datosSalida.seguroRiesgoGrilla = seguroRiesgoGrilla;
                datosSalida.GPS = GPS;
                datosSalida.portes = portes;
                datosSalida.gastosAdmin = gastosAdmin;
                datosSalida.saldoFinalParaCuota = saldoFinalParaCuota;
                datosSalida.saldoInicialCuota = saldoInicialCuota;
                datosSalida.periodoGracia = periodoGracia;
                datosSalida.flujo = flujo;

                datosSalida.saldoInicialCuotaFinal = saldoInicialCuotaFinal;
                datosSalida.interesCuotaFinal = interesCuotaFinal;
                datosSalida.amortizacionCuotaFinal = amortCuotaFinal;
                datosSalida.seguroDesgCuotaFinal = seguroDesgCuotaFinal;
                datosSalida.saldoFinalCuotaFinal = saldoFinalCuotaFinal;



            } else {
                interes = TEM * saldoInicialCuota;
                cuota = saldoInicialCuota * (((TEM + pSeguroDesgrav) * Math.pow(1.00 + TEM + pSeguroDesgrav, nTotalCuotas - i + 1.00)) / ((Math.pow(1.00 + TEM + pSeguroDesgrav, nTotalCuotas - i + 1.00)) - 1.00));
                seguroDesgCuota = saldoInicialCuota * (pSeguroDesgrav);
                amortizacion = cuota - interes - seguroDesgCuota;
                seguroRiesgoGrilla = seguroRiesgo;
                GPS = datosEntrada.getGPS();
                portes = datosEntrada.getPortes();
                gastosAdmin = datosEntrada.getGastosAdmin();
                saldoFinalParaCuota = saldoInicialCuota - amortizacion;
                flujo = cuota + seguroDesgCuota + seguroRiesgoGrilla + GPS + portes + gastosAdmin;

                //Cuoton
                interesCuotaFinal = saldoInicialCuotaFinal * TEM;
                amortCuotaFinal = 0.00;
                seguroDesgCuotaFinal = saldoInicialCuotaFinal * (datosEntrada.getSeguroDesgravamenPorcentaje() / 100.00);
                saldoFinalCuotaFinal = saldoInicialCuotaFinal + interesCuotaFinal + seguroDesgCuotaFinal + amortCuotaFinal;

                datosSalida.interes = interes;
                datosSalida.cuota = cuota;
                datosSalida.amortizacion = amortizacion;
                datosSalida.seguroDesgCuota = seguroDesgCuota;
                datosSalida.seguroRiesgoGrilla = seguroRiesgoGrilla;
                datosSalida.GPS = GPS;
                datosSalida.portes = portes;
                datosSalida.gastosAdmin = gastosAdmin;
                datosSalida.saldoFinalParaCuota = saldoFinalParaCuota;
                datosSalida.saldoInicialCuota = saldoInicialCuota;
                datosSalida.flujo = flujo;

                datosSalida.saldoInicialCuotaFinal = saldoInicialCuotaFinal;
                datosSalida.interesCuotaFinal = interesCuotaFinal;
                datosSalida.amortizacionCuotaFinal = amortCuotaFinal;
                datosSalida.seguroDesgCuotaFinal = seguroDesgCuotaFinal;
                datosSalida.saldoFinalCuotaFinal = saldoFinalCuotaFinal;
            }
            datos.add(datosSalida);


            saldoInicialCuotaFinal = saldoFinalCuotaFinal;
            saldoInicialCuota = saldoFinalParaCuota;


        }


        return datos;

    }
}
