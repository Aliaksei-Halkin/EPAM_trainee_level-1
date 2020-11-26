package module.fifth.task2;

public class RunMain {
    public static void main(String[] args) {

        Item oranges = new Item("Oranges",1.5,3.2);
        Item potatos = new Item("Potatos",5,3);
        Item brocoli = new Item("Brocoli",2,5);
        Item pork = new Item("Pork",2,10);
        Item pasta = new Item("Pasta",1,2);

        Payment buyer1=new Payment();
        buyer1.addItemToOrder(oranges);
        buyer1.addItemToOrder(pork);
        buyer1.addItemToOrder(pasta);

        buyer1.checkout(25);


    }
}
