package com.group01.dreamcar.loan.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;

public class LoanResponseDTO {
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId idUsuario;
    private String moneda;
    private double montoPrestamo;
    private double cuotaInicial;
    private double cuotaFinal;
    private int anios;
    private String tipoPeriodoGracia;
    private int cuotasPeriodoGracia;
    private double tasa;
    private String tipoTasa;
    private int capitalizacion;
    private double costesNotariales;
    private double costesRegistrales;
    private double gps;
    private double portes;
    private double gastosAdmin;
    private double seguroDesgravamen;
    private double seguroRiesgo;
    private double tasaDescuento;

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

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public double getCuotaInicial() {
        return cuotaInicial;
    }

    public void setCuotaInicial(double cuotaInicial) {
        this.cuotaInicial = cuotaInicial;
    }

    public double getCuotaFinal() {
        return cuotaFinal;
    }

    public void setCuotaFinal(double cuotaFinal) {
        this.cuotaFinal = cuotaFinal;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
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

    public double getGps() {
        return gps;
    }

    public void setGps(double gps) {
        this.gps = gps;
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

    public double getSeguroDesgravamen() {
        return seguroDesgravamen;
    }

    public void setSeguroDesgravamen(double seguroDesgravamen) {
        this.seguroDesgravamen = seguroDesgravamen;
    }

    public double getSeguroRiesgo() {
        return seguroRiesgo;
    }

    public void setSeguroRiesgo(double seguroRiesgo) {
        this.seguroRiesgo = seguroRiesgo;
    }

    public double getTasaDescuento() {
        return tasaDescuento;
    }

    public void setTasaDescuento(double tasaDescuento) {
        this.tasaDescuento = tasaDescuento;
    }
}
