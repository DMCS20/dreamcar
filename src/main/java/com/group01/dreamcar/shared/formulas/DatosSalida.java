package com.group01.dreamcar.shared.formulas;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DatosSalida {
    double saldoInicialCuotaFinal;
    double interesCuotaFinal;
    double amortizacionCuotaFinal;
    double seguroDesgCuotaFinal;
    double saldoFinalCuotaFinal;
    double interes;
    double cuota;
    double amortizacion;
    double seguroDesgCuota;
    double seguroRiesgoGrilla;
    double GPS;
    double portes;
    double gastosAdmin;
    double saldoFinalParaCuota;
    double saldoInicialCuota;
    double periodoGracia;
    double flujo;
    String tipoPeriodoGracia;

    public String getTipoPeriodoGracia() {
        return tipoPeriodoGracia;
    }

    public void setTipoPeriodoGracia(String tipoPeriodoGracia) {
        this.tipoPeriodoGracia = tipoPeriodoGracia;
    }

    public double getSaldoInicialCuotaFinal() {
        return saldoInicialCuotaFinal;
    }

    public void setSaldoInicialCuotaFinal(double saldoInicialCuotaFinal) {
        this.saldoInicialCuotaFinal = saldoInicialCuotaFinal;
    }

    public double getInteresCuotaFinal() {
        return interesCuotaFinal;
    }

    public void setInteresCuotaFinal(double interesCuotaFinal) {
        this.interesCuotaFinal = interesCuotaFinal;
    }

    public double getAmortizacionCuotaFinal() {
        return amortizacionCuotaFinal;
    }

    public void setAmortizacionCuotaFinal(double amortizacionCuotaFinal) {
        this.amortizacionCuotaFinal = amortizacionCuotaFinal;
    }

    public double getSeguroDesgCuotaFinal() {
        return seguroDesgCuotaFinal;
    }

    public void setSeguroDesgCuotaFinal(double seguroDesgCuotaFinal) {
        this.seguroDesgCuotaFinal = seguroDesgCuotaFinal;
    }

    public double getSaldoFinalCuotaFinal() {
        return saldoFinalCuotaFinal;
    }

    public void setSaldoFinalCuotaFinal(double saldoFinalCuotaFinal) {
        this.saldoFinalCuotaFinal = saldoFinalCuotaFinal;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public double getSeguroDesgCuota() {
        return seguroDesgCuota;
    }

    public void setSeguroDesgCuota(double seguroDesgCuota) {
        this.seguroDesgCuota = seguroDesgCuota;
    }

    public double getSeguroRiesgoGrilla() {
        return seguroRiesgoGrilla;
    }

    public void setSeguroRiesgoGrilla(double seguroRiesgoGrilla) {
        this.seguroRiesgoGrilla = seguroRiesgoGrilla;
    }

    public double getGPS() {
        return GPS;
    }

    public void setGPS(double GPS) {
        this.GPS = GPS;
    }

    public double getPortes() {
        return portes;
    }

    public void setPortes(double portes) {
        this.portes = portes;
    }

    public double getGastosAdmin() {
        return gastosAdmin;
    }

    public void setGastosAdmin(double gastosAdmin) {
        this.gastosAdmin = gastosAdmin;
    }

    public double getSaldoFinalParaCuota() {
        return saldoFinalParaCuota;
    }

    public void setSaldoFinalParaCuota(double saldoFinalParaCuota) {
        this.saldoFinalParaCuota = saldoFinalParaCuota;
    }

    public double getSaldoInicialCuota() {
        return saldoInicialCuota;
    }

    public void setSaldoInicialCuota(double saldoInicialCuota) {
        this.saldoInicialCuota = saldoInicialCuota;
    }

    public double getPeriodoGracia() {
        return periodoGracia;
    }

    public void setPeriodoGracia(double periodoGracia) {
        this.periodoGracia = periodoGracia;
    }

    public double getFlujo() {
        return flujo;
    }

    public void setFlujo(double flujo) {
        this.flujo = flujo;
    }
}
