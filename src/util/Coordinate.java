/**
 * @Class       Coordinate
 * @Date        10.06.2019, 17:28:17
 * @author      Felipe Beroiza
 * @Company     FIB
 * @Description 
 *
 * Copyright(c) 2019 Felipe Beroiza, Inc. All Rights Reserved.
 * This software is the proprietary information of Felipe Beroiza
 */

package util;

//Own Classes

//Downloaded Classes

//Java Native Classes

public class Coordinate {

  private double x;
  private double y;
  
  
  public Coordinate(double x, double y) {
    this.x = x;
    this.y = y;
  }
  
  public double getX() {
    return this.x;
  }
  
  public double getY() {
    return this.y;
  }
  
  
  public static double distance(Coordinate p1, Coordinate p2) {
    return Math.sqrt(Math.pow((p2.x -p1.x), 2) + Math.pow((p2.y -p1.y), 2));
  }
  
  
}
