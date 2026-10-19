public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel = model;
        idNumber = id;
    }

    public Solution(int id) {
        calcModel = "TI-84";
        idNumber =id;
    }

    public String getCalcModel() {
        
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        calcModel = newModel;
    }

    public int getIdNumber() {
        
        return idNumber;
    }

    public void setIdNumber(int newId) {
        idNumber = newId;
    }

    public void incrementId() {
        idNumber = idNumber + 1;
    }

    public double add(double num1, double num2) {
        double add = num1 + num2;
        return add;
    }

    public double subtract(double num1, double num2) {
        double subtract = num1 - num2;
        return subtract;
    }

    public double multiply(double num1, double num2) {
        double multiply = num1 * num2;
        return multiply;
    }

    public int quotient(int num1, int num2) {
        int quotient = num1 / num2;
        return quotient;
    }

    public int remainder(int num1, int num2) {
        int remainder = num1 % num2;
        return remainder;
    }

    public String divisionResult(int num1, int num2) {
        return quotient(num1, num2)+" R "+remainder(num1, num2);
    }

    public String coordinatePair(int x, int y) {
        //implement code here
        return "("+x+", "+y+")";
    }

    public int average(int num1, int num2) {
        int average = (int)((double)((double)(num1+num2)/2)+0.5);
        return average;
    }

    public String info() {
        //implement code here
        return "This calculator is a model "+getCalcModel()+" with id "+getIdNumber();
    }

}
