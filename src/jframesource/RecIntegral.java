/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframesource;

/**
 *
 * @author user
 */
public class RecIntegral {
    private double result = 0.0, low = 0.0, high = 0.0, step = 0.0;
    
    public RecIntegral() { }
    
    public RecIntegral(double low, double high, double step) {
        this.low = low;
        this.high = high;
        this.step = step;
        this.result = 0.0;
    }
   
    public double CalculateResult() {
        int n = 0;
        result = 0.0;
        
        for (double x = low; x < high; x += step) {
            result += Math.exp(-x) * step;
            n++;
        }
        
        double normalize = high - (low + n * step);
        if (normalize > 0)
            result += Math.exp(low + n * step) * normalize;
        return result;
    }
}
