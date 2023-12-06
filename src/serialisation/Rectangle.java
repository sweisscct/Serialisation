/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisation;

import java.io.Serializable;

/**
 *
 * @author Lecturer
 */
public class Rectangle implements Serializable {
    private double length;
    private double width;
    private String colour;

    public Rectangle(double length, double width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
    }
    
    public double getArea() {
        return length*width;
    }
}
