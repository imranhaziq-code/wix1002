package T9;

public class T9Q3 {
    public static void main(String[] args) {
        RegularPay regularPay = new RegularPay(50, 40); 
        SpecialPay specialPay = new SpecialPay(60, 30); 

        System.out.println("Regular Pay: RM" + regularPay.getPay());
        System.out.println("Special Pay: RM" + specialPay.getPay());
    }
}

class PaySystem {
        private double payrate, hour;
        
        public PaySystem(double p, double h){
            payrate = p;
            hour = h;
        }
        
        public double getPay() {
            return hour*payrate;
        }
    }
    
class RegularPay extends PaySystem {
        public RegularPay(double p, double h) {
            super(p, h);
        }
    }
    
class SpecialPay extends PaySystem {
        public SpecialPay(double p, double h) {
            super(p, h);
        }
        
        @Override
        public double getPay(){
            return super.getPay()*1.3;
        }
    }
