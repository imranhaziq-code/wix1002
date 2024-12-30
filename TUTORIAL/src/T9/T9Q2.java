package T9;


public class T9Q2 {
        public static void main(String[] args) {
            Animal animal = new Animal(50.6, 34.5, 45.5);
            animal.display();
    }
}

class Organism {
            protected double size, rate;
            
            public Organism(double a, double b){
                size = a;
                rate = b;
            }
}
        
class Animal extends Organism{
            private double eating;
            
            public Animal(double a, double b, double c){
                super(a,b);
                eating = c;
            }
            
            public void display(){
                System.out.println("Intitial size of the organism: " + size);
                System.out.println("Growth Rate: " + rate);
                System.out.println("Eating Requirement: " + eating);
            }
        }
