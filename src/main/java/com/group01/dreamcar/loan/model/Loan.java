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
    private double precioVentaActivo;

    @Field("cuota_inicial")
    private double cuotaInicialPorcentaje;

    @Field("cuota_final")
    private double cuotaFinalPorcentaje;

    @Field("anios")
    private int numeroAnios;

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
    private double GPS;

    @Field("portes")
    private double portes;

    @Field("gastos_admin")
    private double gastosAdmin;

    @Field("seguro_desgravamen")
    private double seguroDesgravamenPorcentaje;

    @Field("seguro_riesgo")
    private double seguroRiesgoPorcentaje;

    @Field("tasa_descuento")
    private double tasaDescuentoPorcentaje;

    @Field("freq_pago")
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
