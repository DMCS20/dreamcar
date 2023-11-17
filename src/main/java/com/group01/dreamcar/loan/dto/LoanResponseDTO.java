package com.group01.dreamcar.loan.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.group01.dreamcar.shared.formulas.CalculadoraGrilla;
import com.group01.dreamcar.shared.formulas.DatosSalida;
import org.bson.types.ObjectId;

import java.util.List;

public class LoanResponseDTO {
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId idUsuario;

    private String moneda;

    private double precioVentaActivo;

    private double cuotaInicialPorcentaje;

    private double cuotaFinalPorcentaje;

    private int numeroAnios;

    private String tipoPeriodoGracia;

    private int cuotasPeriodoGracia;

    private double tasa;

    private String tipoTasa;

    private int capitalizacion;

    private double costesNotariales;

    private double costesRegistrales;

    private double GPS;

    private double portes;

    private double gastosAdmin;

    private double seguroDesgravamenPorcentaje;

    private double seguroRiesgoPorcentaje;

    private double tasaDescuentoPorcentaje;

    private double freqPago;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(ObjectId idUsuario) {
        this.idUsuario = idUsuario;
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

    public int getNumeroAnios() {
        return numeroAnios;
    }

    public void setNumeroAnios(int numeroAnios) {
        this.numeroAnios = numeroAnios;
    }

    public String getTipoPeriodoGracia() {
        return tipoPeriodoGracia;
    }

    public void setTipoPeriodoGracia(String tipoPeriodoGracia) {
        this.tipoPeriodoGracia = tipoPeriodoGracia;
    }

    public int getCuotasPeriodoGracia() {
        return cuotasPeriodoGracia;
    }

    public void setCuotasPeriodoGracia(int cuotasPeriodoGracia) {
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

    public int getCapitalizacion() {
        return capitalizacion;
    }

    public void setCapitalizacion(int capitalizacion) {
        this.capitalizacion = capitalizacion;
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

    public double getTasaDescuentoPorcentaje() {
        return tasaDescuentoPorcentaje;
    }

    public void setTasaDescuentoPorcentaje(double tasaDescuentoPorcentaje) {
        this.tasaDescuentoPorcentaje = tasaDescuentoPorcentaje;
    }

    public double getFreqPago() {
        return freqPago;
    }

    public void setFreqPago(double freqPago) {
        this.freqPago = freqPago;
    }
}
