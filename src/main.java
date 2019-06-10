/**
 * @Class       main
 * @Date        10.06.2019, 14:25:43
 * @author      Felipe Beroiza
 * @Company     FIB
 * @Description 
 *
 * Copyright(c) 2019 Felipe Beroiza, Inc. All Rights Reserved.
 * This software is the proprietary information of Felipe Beroiza
 */

//Own Classes
import util.Coordinate;

//Downloaded Classes

//Java Native Classes

public class main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Starting Program");
    
    Coordinate [] point_array = new Coordinate[2];
    
    point_array[0] = new Coordinate(0, 0);
    point_array[1] = new Coordinate(3, 4);
    
    
    System.out.println(Coordinate.distance(point_array[0], point_array[1]));
    
  }

}
