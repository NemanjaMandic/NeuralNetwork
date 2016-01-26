# NeuralNetwork
Neural Network Programming with Java

## First Chapter

### Class name: Neuron
* Attributes
   private ArrayList<Double> listOfWeightIn
   private ArrayList<Double> listOfWeightOut
   public double initNeuron() 
* Methods
   public void setListOfWeightIn(ArrayList<Double>listOfWeightIn)
   public void setListOfWeightOut(ArrayList<Double>listOfWeightOut)
   public ArrayList<Double> getListOfWeightIn()
   public ArrayList<Double> getListOfWeightOut()
 
### Class Name: Layer - abstract class
* Attributes
    private ArrayList<Neuron> listOfNeurons
    private int numberOfNeuronsInLayer
* Methods
    public ArrayList<Neuron> getListOfNeurons()
    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons)
    public int getNumberOfNeuronsInLayer()
    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer)

### class InputLayer extends Layer 
* Attributes
   None
* Methods
    public initLayer(InputLayer inputLayer)
    public void printLayer(InputLayer inputLayer)

### class HiddenLayer extends Layer
* Attributes
* None
* Methods
   public ArrayList<HiddenLayer> initLayer(HiddenLayer hiddenLayer, ArrayList<HiddenLayer> listOfHiddenLayer,
                                           InputLayer inputLayer, OutputLayer outputLayer)
   public void printLayer(ArrayList<HiddenLayer> listOfHiddenLayer)

### public class OutputLayer extends Layer 
 Attributtes - None
 Methods
   public OutputLayer initLayer(OutputLayer outputLayer)
   public void printLayer(OutputLayer outputLayer)
   
### public class NeuralNet
  Attributes
   private InputLayer inputLayer;
   private HiddenLayer hiddenLayer;
   private ArrayList<HiddenLayer> listOfHiddenLayer;
   private OutputLayer outputLayer;
   private int numberOfHiddenLayers;
  Methods
   public void initNet() 
   public void printNet()
