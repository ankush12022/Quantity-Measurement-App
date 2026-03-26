package org.example.uc13;

public interface IMeasurable {
    double getConversionFactor();
    default double convertToBaseUnit(double v){
        return v * getConversionFactor();
    }
    default double convertFromBaseUnit(double v){
        return v / getConversionFactor();
    }
    String getUnitName();
}