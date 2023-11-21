package com.group01.dreamcar.shared.formulas;

import com.group01.dreamcar.loan.dto.LoanResultsResponseDTO;

import java.util.List;

import static com.group01.dreamcar.shared.formulas.CalculadoraGrilla.calculadora;

public class CalculadoraResultados {
    public static LoanResultsResponseDTO calculadoraResultados(DatosEntrada datosEntrada){
        LoanResultsResponseDTO resultados = new LoanResultsResponseDTO();

        resultados.setMoneda(datosEntrada.getMoneda());
        //Del financiamiento
        resultados.setTEA(datosEntrada.calcularTEA(datosEntrada));
        resultados.setTEM(Math.pow(1.00 + datosEntrada.calcularTEA(datosEntrada), datosEntrada.getFreqPago() / 360.00 ) - 1.00);
        resultados.setnCuotasxAnio(360.00 / datosEntrada.getFreqPago());
        resultados.setnTotalCuotas(datosEntrada.getTipoPlan());
        resultados.setCuotaInicial(datosEntrada.getPrecioVentaActivo() * (datosEntrada.getCuotaInicialPorcentaje() / 100.00));
        resultados.setCuotaFinal(datosEntrada.getPrecioVentaActivo() * (datosEntrada.getCuotaFinalPorcentaje() / 100.00));
        resultados.setMontoPrestamo(datosEntrada.getPrecioVentaActivo() - datosEntrada.getPrecioVentaActivo() * (datosEntrada.getCuotaInicialPorcentaje() / 100.00) + datosEntrada.getCostesNotariales() + datosEntrada.getCostesRegistrales());
        resultados.setSaldoFinanciarCuotas((resultados.getMontoPrestamo()) - (resultados.getCuotaFinal() / Math.pow(1.00 + resultados.getTEM() + (datosEntrada.getSeguroDesgravamenPorcentaje() / 100.00), resultados.getnTotalCuotas() + 1.00)));

        //Costes y gastos periodicos
        resultados.setpSeguroDesgrav(datosEntrada.getSeguroDesgravamenPorcentaje() / 100.00);
        resultados.setSeguroRiesgo((datosEntrada.getSeguroRiesgoPorcentaje() / 100.00) * datosEntrada.getPrecioVentaActivo() / (360.00 / datosEntrada.getFreqPago()));

        //Totales
        List<DatosSalida> datosSalidaList =  CalculadoraGrilla.calculadora(datosEntrada);
        for (DatosSalida datosSalida : datosSalidaList) {
            resultados.setInteresesTotal(resultados.getInteresesTotal() + (datosSalida.cuota - datosSalida.amortizacion - datosSalida.seguroDesgCuota));
            resultados.setAmortizacionCapitalTotal(resultados.getAmortizacionCapitalTotal() + (datosSalida.amortizacion - datosSalida.amortizacionCuotaFinal));
            resultados.setSeguroDesgravamenTotal(resultados.getSeguroDesgravamenTotal() + datosSalida.seguroDesgCuota);
            resultados.setSeguroTodoRiesgoTotal(resultados.getSeguroTodoRiesgoTotal() + datosSalida.seguroRiesgoGrilla);
            resultados.setGPSTotal(resultados.getGPSTotal() + datosSalida.GPS);
            resultados.setPortesTotal(resultados.getPortesTotal() + datosSalida.portes);
            resultados.setGastosAdminTotal(resultados.getGastosAdminTotal() + datosSalida.gastosAdmin);
        }

        //Indicadores de rentabilidad
        resultados.setTasaDescuentoRentabilidad(Math.pow(1 + (datosEntrada.getTasaDescuentoPorcentaje() / 100.00), (datosEntrada.getFreqPago() / 360.00)) - 1.00);
        //TODO: Calcular VAN
        //TODO: Calcular TIR
        //TODO: Calcular TCEA

        return resultados;
    }
}
