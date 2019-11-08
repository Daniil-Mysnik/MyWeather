package com.example.weatherapp;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Unit {

    public static String unit = "metric";
    public static String unitStr = "°C";

    public static void setUnitParameter(int parameter) {
        if (parameter == 0) {
            unit = "metric";
            unitStr = "°C";
        } else {
            unit = "imperial";
            unitStr = "°F";
        }
    }

    public static String getUnit() {
        return unit;
    }

    public static void setUnit(String unit) {
        Unit.unit = unit;
    }

    public static String getUnitStr() {
        return unitStr;
    }

    public static void setUnitStr(String unitStr) {
        Unit.unitStr = unitStr;
    }

    public static Double getWind(Double wind) {
        if (unit.equals("metric")) {
            return wind;
        } else {
            return new BigDecimal(wind/2.2374).setScale(1, RoundingMode.UP).doubleValue();
        }
    }
}