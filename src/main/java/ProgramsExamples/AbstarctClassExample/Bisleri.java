package main.java.ProgramsExamples.AbstarctClassExample;

public class Bisleri extends WaterCan{
    double h;
    double d;
    @Override
    public void setDemensions(double height, double diameter) {

        h=height*1.2;
        d=diameter;
    }
}
