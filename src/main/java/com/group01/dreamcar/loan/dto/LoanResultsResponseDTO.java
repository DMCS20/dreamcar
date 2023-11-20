package com.group01.dreamcar.loan.dto;

public class LoanResultsResponseDTO {
    double TEA;
    double TEM;
    double nCuotasxAnio;
    double nTotalCuotas;
    double cuotaInicial;
    double cuotaFinal;
    double montoPrestamo;
    double saldoFinanciarCuotas;
    double pSeguroDesgrav;
    double seguroRiesgo;
    double interesesTotal=0;
    double amortizacionCapitalTotal=0;
    double seguroDesgravamenTotal=0;
    double seguroTodoRiesgoTotal=0;
    double GPSTotal=0;
    double portesTotal=0;
    double gastosAdminTotal=0;
    double tasaDescuentoRentabilidad;
    //TODO: FALTAN CALCULAR
    double TIR;
    double TCEA;
    double VAN;
    ///////////////////////////////

    public double getTEA() {
        return TEA;
    }

    public void setTEA(double TEA) {
        this.TEA = TEA;
    }

    public double getTEM() {
        return TEM;
    }

    public void setTEM(double TEM) {
        this.TEM = TEM;
    }

    public double getnCuotasxAnio() {
        return nCuotasxAnio;
    }

    public void setnCuotasxAnio(double nCuotasxAnio) {
        this.nCuotasxAnio = nCuotasxAnio;
    }

    public double getnTotalCuotas() {
        return nTotalCuotas;
    }

    public void setnTotalCuotas(double nTotalCuotas) {
        this.nTotalCuotas = nTotalCuotas;
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

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public double getSaldoFinanciarCuotas() {
        return saldoFinanciarCuotas;
    }

    public void setSaldoFinanciarCuotas(double saldoFinanciarCuotas) {
        this.saldoFinanciarCuotas = saldoFinanciarCuotas;
    }

    public double getpSeguroDesgrav() {
        return pSeguroDesgrav;
    }

    public void setpSeguroDesgrav(double pSeguroDesgrav) {
        this.pSeguroDesgrav = pSeguroDesgrav;
    }

    public double getSeguroRiesgo() {
        return seguroRiesgo;
    }

    public void setSeguroRiesgo(double seguroRiesgo) {
        this.seguroRiesgo = seguroRiesgo;
    }

    public double getTasaDescuentoRentabilidad() {
        return tasaDescuentoRentabilidad;
    }

    public void setTasaDescuentoRentabilidad(double tasaDescuentoRentabilidad) {
        this.tasaDescuentoRentabilidad = tasaDescuentoRentabilidad;
    }

    public double getInteresesTotal() {
        return interesesTotal;
    }

    public void setInteresesTotal(double interesesTotal) {
        this.interesesTotal = interesesTotal;
    }

    public double getAmortizacionCapitalTotal() {
        return amortizacionCapitalTotal;
    }

    public void setAmortizacionCapitalTotal(double amortizacionCapitalTotal) {
        this.amortizacionCapitalTotal = amortizacionCapitalTotal;
    }

    public double getSeguroDesgravamenTotal() {
        return seguroDesgravamenTotal;
    }

    public void setSeguroDesgravamenTotal(double seguroDesgravamenTotal) {
        this.seguroDesgravamenTotal = seguroDesgravamenTotal;
    }

    public double getSeguroTodoRiesgoTotal() {
        return seguroTodoRiesgoTotal;
    }

    public void setSeguroTodoRiesgoTotal(double seguroTodoRiesgoTotal) {
        this.seguroTodoRiesgoTotal = seguroTodoRiesgoTotal;
    }

    public double getGPSTotal() {
        return GPSTotal;
    }

    public void setGPSTotal(double GPSTotal) {
        this.GPSTotal = GPSTotal;
    }

    public double getPortesTotal() {
        return portesTotal;
    }

    public void setPortesTotal(double portesTotal) {
        this.portesTotal = portesTotal;
    }

    public double getGastosAdminTotal() {
        return gastosAdminTotal;
    }

    public void setGastosAdminTotal(double gastosAdminTotal) {
        this.gastosAdminTotal = gastosAdminTotal;
    }

    public double getTIR() {
        return TIR;
    }

    public void setTIR(double TIR) {
        this.TIR = TIR;
    }

    public double getTCEA() {
        return TCEA;
    }

    public void setTCEA(double TCEA) {
        this.TCEA = TCEA;
    }

    public double getVAN() {
        return VAN;
    }

    public void setVAN(double VAN) {
        this.VAN = VAN;
    }
}
