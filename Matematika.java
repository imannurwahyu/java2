package Praktikum2;

public class Matematika implements Operasi{
    @Override
    public int pertambahan(int a,int b){
        return a + b;
    };
    @Override
    public int pengurangan(int a,int b){
        return a - b;
    };
    @Override
    public int perkalian(int a,int b){
        return a * b;
    };
    @Override
    public int pembagian(int a,int b){
        return a / b;
    };
    
}
