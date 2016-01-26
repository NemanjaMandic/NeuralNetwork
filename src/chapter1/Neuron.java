package chapter1;

import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nemus
 */
public class Neuron {
   
    //An ArrayList variable of real numbers that represents the list of input weights
    private ArrayList<Double> listOfWeightIn;
    
    //An ArrayList variable of real numbers that represents the list of output weights
    private ArrayList<Double> listOfWeightOut;
    
    /*
     Initializes listOfWeightIn and
     listOfWeightOut function with a pseudo
     random real number
    */
    public double initNeuron(){
        Random r = new Random();
        return r.nextDouble();
    }
    
    public ArrayList<Double> getListOfWeightIn(){
        return listOfWeightIn;
    }
    public void setListOfWeightIn(ArrayList<Double> listOfWeightIn){
        this.listOfWeightIn=listOfWeightIn;
    }
    public ArrayList<Double> getListOfWeightOut(){
        return listOfWeightOut;
    }
    public void setListOfWeightOut(ArrayList<Double> listOfWeightOut){
        this.listOfWeightOut=listOfWeightOut;
    }
   
    
}
