package com.group01.dreamcar.loan.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "datos_prestamo")
public class Loan {
    @Id
    @Field("_id")
    private ObjectId id;

    @Field("id_usuario")
    private ObjectId idUsuario;

    @Field("moneda")
    private String moneda;

    @Field("monto_prestamo")
    private double montoPrestamo;

    @Field("cuota_inicial")
    private double cuotaInicial;

    @Field("cuota_final")
    private double cuotaFinal;

    @Field("anios")
    private int anios;

    @Field("tipo_periodo_gracia")
    private String tipoPeriodoGracia;

    @Field("cuotas_periodo_gracia")
    private int cuotasPeriodoGracia;

    @Field("tasa")
    private double tasa;

    @Field("tipo_tasa")
    private String tipoTasa;

    @Field("capitalizacion")
    private int capitalizacion;

    @Field("costes_notariales")
    private double costesNotariales;

    @Field("costes_registrales")
    private double costesRegistrales;

    @Field("gps")
    private double gps;

    @Field("portes")
    private double portes;

    @Field("gastos_admin")
    private double gastosAdmin;

    @Field("seguro_desgravamen")
    private double seguroDesgravamen;

    @Field("seguro_riesgo")
    private double seguroRiesgo;

    @Field("tasa_descuento")
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
