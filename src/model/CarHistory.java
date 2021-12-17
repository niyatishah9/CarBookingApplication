/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author niyat
 */
public class CarHistory {
    
    private ArrayList<Car> history;

    public CarHistory() {
        this.history = new ArrayList<Car>();
        
    }

    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }
    
    public Car addnewcars(){
        Car newcars = new Car();
        history.add(newcars);
        return newcars;
    }
    
    public void deletecars(Car vs){
        history.remove(vs);
    }    
    
   
    
    
    
    
   public ArrayList<Car> getCarRepositoryListByMinorMaxNumberOfSeats(String minNumberOfSeats, String maxNumberOfSeats) {
      
            int minNumberOfSeatsInt = Integer.parseInt(minNumberOfSeats);
           int maxNumberOfSeatsInt = Integer.parseInt(maxNumberOfSeats);
           
          //  System.out.println("Inside");
           ArrayList<Car> history1 = new ArrayList<>();
            for(int i =0; i< history.size() ; i++){
                
            Car vs = history.get(i);
               for (int j = minNumberOfSeatsInt; j <= maxNumberOfSeatsInt; j++)
{              //System.out.println("minimumn no of seats" + j);
              if(vs.getNo_seats().equals(Integer.toString(j)))
{
              history1.add(vs);
               //System.out.println("data "+history1.size());
}
}
}
//System.out.println(history.size());
return history1;
}


            
        }
        
        
        
       
        
        
        
  
