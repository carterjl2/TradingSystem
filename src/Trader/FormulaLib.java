/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trader;

import java.util.ArrayList;

/**
 *
 * @author zhangxr
 */
public class FormulaLib {

    public FormulaLib() {

    }

    public static String REFS(ArrayList<String> list, int idx, int refidx) {
        if (idx >= refidx) {
            return list.get(idx - refidx);
        } else {
            return null;
        }
    }

    public static double REFD(ArrayList<Double> list, int idx, int refidx) {
        if (idx >= refidx) {
            return list.get(idx - refidx);
        } else {
            return 0;
        }
    }

    public static Object REFO(ArrayList<Object> list, int idx, int refidx) {
        if (idx >= refidx) {
            return list.get(idx - refidx);
        } else {
            return null;
        }
    }

    public static double MA(ArrayList<Double> list, int idx, int num) {
        if (idx >= num - 1) {
            double sum = 0;
            for (int i = 0; i < num; i++) {
                sum += REFD(list, idx, i);
            }
            return sum / num;
        }
        return 0;
    }

    public static double EMA(double emay, double val, int n) {
        double emat = emay * (n - 1) / (n + 1) + val * 2 / (n + 1);
        return emat;
    }

    public static boolean CROSS(int idx, ArrayList<Double> lista, ArrayList<Double> listb) {
        return ((REFD(lista, idx, 1) < REFD(listb, idx, 1)) && (lista.get(idx) > listb.get(idx)));
    }

    public static boolean CROSS(int idx, ArrayList<Double> lista, double value) {
        return ((REFD(lista, idx, 1) < value) && (lista.get(idx) > value));
    }

    public static boolean CROSS(int idx, double value, ArrayList<Double> listb) {
        return ((value < REFD(listb, idx, 1)) && (value > listb.get(idx)));
    }

}
