package com.group01.dreamcar.shared.formulas;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DatosEntrada {
    private String moneda;
    private double precioVentaActivo;
    private double tipoPlan;
    private double cuotaInicialPorcentaje;
    private double cuotaFinalPorcentaje;
    private double capitalizacion;
    private double portes;
    private double tasaDescuentoPorcentaje;
    private double gastosAdmin;
    private double seguroDesgravamenPorcentaje;
    private double seguroRiesgoPorcentaje;
    private String tipoPeriodoGracia;
    private int periodoGraciaMeses;
    private double cuotasPeriodoGracia; //
    private double tasa;
    private String tipoTasa;
    private double numeroAnios;
    private double tiempoDias; //
    private double costesNotariales;
    private double costesRegistrales;
    private double GPS;
    private double freqPago;


    public double calcularTEA(DatosEntrada datosEntrada) {

        double TEA;

        if(!datosEntrada.getTipoTasa().equals("TEA")){
            TEA = Math.pow((1+(datosEntrada.getTasa()/100)/(360.00/datosEntrada.getCapitalizacion())),(360.00/datosEntrada.getCapitalizacion()))-1;
        } else TEA = datosEntrada.getTasa() / 100.00;

        return TEA;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getPrecioVentaActivo() {
        return precioVentaActivo;
    }

    public void setPrecioVentaActivo(double precioVentaActivo) {
        this.precioVentaActivo = precioVentaActivo;
    }

    public double getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(double tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public double getCuotaInicialPorcentaje() {
        return cuotaInicialPorcentaje;
    }

    public void setCuotaInicialPorcentaje(double cuotaInicialPorcentaje) {
        this.cuotaInicialPorcentaje = cuotaInicialPorcentaje;
    }

    public double getCuotaFinalPorcentaje() {
        return cuotaFinalPorcentaje;
    }

    public void setCuotaFinalPorcentaje(double cuotaFinalPorcentaje) {
        this.cuotaFinalPorcentaje = cuotaFinalPorcentaje;
    }

    public double getCapitalizacion() {
        return capitalizacion;
    }

    public void setCapitalizacion(double capitalizacion) {
        this.capitalizacion = capitalizacion;
    }

    public double getPortes() {
        return portes;
    }

    public void setPortes(double portes) {
        this.portes = portes;
    }

    public double getTasaDescuentoPorcentaje() {
        return tasaDescuentoPorcentaje;
    }

    public void setTasaDescuentoPorcentaje(double tasaDescuentoPorcentaje) {
        this.tasaDescuentoPorcentaje = tasaDescuentoPorcentaje;
    }

    public double getGastosAdmin() {
        return gastosAdmin;
    }

    public void setGastosAdmin(double gastosAdmin) {
        this.gastosAdmin = gastosAdmin;
    }

    public double getSeguroDesgravamenPorcentaje() {
        return seguroDesgravamenPorcentaje;
    }

    public void setSeguroDesgravamenPorcentaje(double seguroDesgravamenPorcentaje) {
        this.seguroDesgravamenPorcentaje = seguroDesgravamenPorcentaje;
    }

    public double getSeguroRiesgoPorcentaje() {
        return seguroRiesgoPorcentaje;
    }

    public void setSeguroRiesgoPorcentaje(double seguroRiesgoPorcentaje) {
        this.seguroRiesgoPorcentaje = seguroRiesgoPorcentaje;
    }

    public String getTipoPeriodoGracia() {
        return tipoPeriodoGracia;
    }

    public void setTipoPeriodoGracia(String tipoPeriodoGracia) {
        this.tipoPeriodoGracia = tipoPeriodoGracia;
    }

    public double getPeriodoGraciaMeses() {
        return periodoGraciaMeses;
    }

    public void setPeriodoGraciaMeses(int periodoGraciaMeses) {
        this.periodoGraciaMeses = periodoGraciaMeses;
    }

    public double getCuotasPeriodoGracia() {
        return cuotasPeriodoGracia;
    }

    public void setCuotasPeriodoGracia(double cuotasPeriodoGracia) {
        this.cuotasPeriodoGracia = cuotasPeriodoGracia;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public String getTipoTasa() {
        return tipoTasa;
    }

    public void setTipoTasa(String tipoTasa) {
        this.tipoTasa = tipoTasa;
    }

    public double getNumeroAnios() {
        return numeroAnios;
    }

    public void setNumeroAnios(double numeroAnios) {
        this.numeroAnios = numeroAnios;
    }

    public double getTiempoDias() {
        return tiempoDias;
    }

    public void setTiempoDias(double tiempoDias) {
        this.tiempoDias = tiempoDias;
    }

    public double getCostesNotariales() {
        return costesNotariales;
    }

    public void setCostesNotariales(double costesNotariales) {
        this.costesNotariales = costesNotariales;
    }

    public double getCostesRegistrales() {
        return costesRegistrales;
    }

    public void setCostesRegistrales(double costesRegistrales) {
        this.costesRegistrales = costesRegistrales;
    }

    public double getGPS() {
        return GPS;
    }

    public void setGPS(double GPS) {
        this.GPS = GPS;
    }

    public double getFreqPago() {
        return freqPago;
    }

    public void setFreqPago(double freqPago) {
        this.freqPago = freqPago;
    }
}
