import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // CLIENT WISHES
        List<String> listOfWishes = new ArrayList<>(Arrays.asList("Spaghetti,2",
                                                                  "Pepper,5",
                                                                  "Sugar,1"));

        // STORE OFFERS
        List<String> listOfOffers = new ArrayList<>(Arrays.asList("Spaghetti,10.00",
                                                                  "Sugar,5.00",
                                                                  "Water,2.50"));

        // CLIENT FULFILLED WISHES
        List<String> listOfPurchases = getListOfPurchases(listOfWishes, listOfOffers);


        printList(listOfPurchases);
    }

    
    static void printList(List<String> list) {
        for (String purchase: list) {
            System.out.println(purchase);
        }
    }

    
    static ArrayList<String> getListOfPurchases(List<String> listOfWishes, List<String> listOfOffers) {
        ArrayList<String> listOfPurchases = new ArrayList<>();

        for (String wishAndQuantity : listOfWishes) {

            String wish = wishAndQuantity.substring(0, wishAndQuantity.indexOf(','));
            int quantity = Integer.parseInt(wishAndQuantity.substring(wishAndQuantity.indexOf(',') + 1));

            for (String offerAndPrice : listOfOffers) {

                String offer = offerAndPrice.substring(0, offerAndPrice.indexOf(','));
                double price = Double.parseDouble(offerAndPrice.substring(offerAndPrice.indexOf(',') + 1));

                if (wish.equals(offer)) {
                    listOfPurchases.add(wish + ',' + quantity + '=' + (quantity * price));
                }
            }
        }
        return listOfPurchases;
    }
}
