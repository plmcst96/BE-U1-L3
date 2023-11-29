package ShopOnline;

public class Chart {
    private Customer customer;
    Item[] items;

    public Chart(Customer customer){
        this.customer = customer;
        items = new Item[0];
    }
    public Customer getCustomer(){
        return this.customer;
    }

    public double getTotal(){
        double subTot = 0.0;
        for (Item item : this.items){
            subTot += item.getPrice();
        }
        return subTot;
    }

    public void addItem(Item item){
        if (item.getNumberOfItem() > 0){
            Item[] newItem = new Item[this.items.length + 1];
            System.arraycopy(this.items, 0 ,newItem, 0 , this.items.length);
            newItem[this.items.length] = item;
            this.items = newItem;
            item.setNumberOfItem(item.getNumberOfItem() - 1);
            }else {
            System.out.println(item.getIdItem() + "sold out");
        }
    }
}
