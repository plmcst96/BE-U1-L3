import ShopOnline.Chart;
import ShopOnline.Customer;
import ShopOnline.Item;

public class Es3 {
    public static void main(String[] args) {
        Customer me = new Customer("A001", "Gianni Morandi", "giannimorandi@gmail.com");
        Item borsa = new Item("I001", "Borsa piccola", 150);
        Item giacca = new Item("I002", "Over color verde militare", 60);
        Chart chart = new Chart(me);
        borsa.setNumberOfItem(2);
        giacca.setNumberOfItem(3);
        chart.addItem(borsa);
        chart.addItem(giacca);
        System.out.println("Utente:" + me + "/" + "Totale carrello: " + chart.getTotal());

    }
}
