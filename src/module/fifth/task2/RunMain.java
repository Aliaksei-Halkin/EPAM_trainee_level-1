package module.fifth.task2;

public class RunMain {
    public static void main(String[] args) {
        Payment payment=new Payment( 5,1,new Payment.Order(1,0.7));
        payment.setOrder(  new Payment.Order(1.0,0.7));

        Payment.Order potatos=new Payment.Order(1.0,0.7);
        Payment.Order orange=new Payment.Order(1.0,0.7);


    }
}
