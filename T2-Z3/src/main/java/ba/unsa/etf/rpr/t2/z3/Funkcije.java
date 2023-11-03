package ba.unsa.etf.rpr.t2.z3;

import java.lang.Math;
import java.util.List;

public class Funkcije {

    public static Double min(List<Double> lista){
        double min = Double.MAX_VALUE;
        for(Double x : lista){
            if(x.doubleValue() < min) min = x.doubleValue();
        }
        return min;
    }

    public static Double max(List<Double> lista){
        double max = Double.MIN_VALUE;
        for(Double x : lista){
            if(x.doubleValue() > max) max = x.doubleValue();
        }
        return max;
    }

    public static Double mean(List<Double> lista){
        double sum = 0;
        for(Double x : lista){
            sum += x.doubleValue();
        }
        return (sum / lista.size());
    }

    public static Double stDev(List<Double> lista){
        Double mean = Funkcije.mean(lista);
        float stDev = 0;
        for(Double x : lista){
            stDev += Math.pow(x - mean, 2);
        }
        return Math.sqrt(stDev / lista.size());
    }
}
