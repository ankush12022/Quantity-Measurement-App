package org.example.uc11;

public interface IMeasurable {
    double getConversionFactor();
    double convertToBaseUnit(double v);
    double convertFromBaseUnit(double v);
    String getUnitName();
}