package com.group01.dreamcar.shared.formulas;

public class Formulas {

    public static double calcularTIR(double[] flujosDeEfectivo, double estimacionTasa, double tolerancia, int maxIteraciones) {
        double tir = estimacionTasa;

        for (int i = 0; i < maxIteraciones; i++) {
            double van = calcularVAN(flujosDeEfectivo, tir);
            double derivadaVAN = calcularDerivadaVAN(flujosDeEfectivo, tir);

            tir = tir - van / derivadaVAN;

            if (Math.abs(van) < tolerancia) {
                return tir;
            }
        }

        return Double.NaN;
    }

    public static double calcularVAN(double[] flujosDeEfectivo, double tasa) {
        double van = 0;
        for (int i = 0; i < flujosDeEfectivo.length; i++) {
            van += flujosDeEfectivo[i] / Math.pow(1 + tasa, i + 1);
        }
        return van;
    }

    public static double calcularDerivadaVAN(double[] flujosDeEfectivo, double tasa) {
        double derivada = 0;
        for (int i = 0; i < flujosDeEfectivo.length; i++) {
            derivada -= (i + 1) * flujosDeEfectivo[i] / Math.pow(1 + tasa, i + 2);
        }
        return derivada;
    }
}
