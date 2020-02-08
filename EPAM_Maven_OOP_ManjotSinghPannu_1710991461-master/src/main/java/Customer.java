import Cakes.Blueberry;
import Cakes.Butterscotch;
import Cakes.cake;
import Chocolates.*;
import Cookies.*;

import java.util.*;

public class Customer {
    public static void showMenu(){

        System.out.println("Select items from Chocolates, Cakes and Cookies \n For Chocolates press 1 \n For Cakes press 2 \n For Cookies press 3");
        System.out.println("Press 10 to display chocolates by price low to hight \n Press 11 to display chocolates by calories low to high");
        System.out.println("Press 30 to display cookies by price low to high \n Press 31 to display cookies by calories low to high");
        System.out.println("Press 0 to see the total weight of your bag \n find item within a price range \n Sort the bag items acc to the price");
        System.out.println("Press -1 to exit");
    }
    public static ArrayList<cookies> cookiesList(){
        ArrayList<cookies> AllCookies = new ArrayList<>();
        AllCookies.add(new Caramel());
        AllCookies.add(new ChocoChip());
        return AllCookies;
    }
    public static ArrayList<chocolate> chocoList()
    {
        ArrayList<chocolate> AllChocolates = new ArrayList<>();
        AllChocolates.add(new Snickers());
        AllChocolates.add(new DairyMilk());
        return AllChocolates;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<chocolate> chocolates = new ArrayList<>();
        ArrayList<chocolate> AllChocos = chocoList();
        ArrayList<cake> cakes = new ArrayList<>();
        ArrayList<cookies> cookies = new ArrayList<>();
        ArrayList<cookies> AllCookies = cookiesList();
        HashMap<String,Double> Weight = new HashMap<>();
        HashMap<String,Double> bag = new HashMap<>();


        System.out.println("Welcome to THE SWEETS WORLD, Choose your favourite items");
        System.out.println("Press 10 to display chocolates by price low to high \n Press 11 to display chocolates by calories low to high");
        System.out.println("Press 20 to display cookies by price low to high \n Press 21 to display cookies by calories low to high");

       int n;
        do {

            System.out.println("Select your preferred Sweet from below:");
            System.out.println("Options: - \n 1. Chocolates \n 2. Cakes \n 3. Candies");
            System.out.println("Press 0 to see the total weight of your bag \n find item within a price range \n Sort the bag items acc to the price");
            System.out.println("Press -1 to exit");
            n=sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Pick your Favourite Chocolates");
                    System.out.println("* Options: \n For Dairy Milk, press D \n  For Snickers, press S *");
                    char ch = sc.next().charAt(0);
                    chocolate choco;
                    if (ch == 'S' || ch == 's') {

                        choco = new DairyMilk();
                        if (choco instanceof DairyMilk) {
                            DairyMilk dairy = (DairyMilk) choco;
                            System.out.println("Your selected item's details");
                            System.out.println("* Dairy Milk: " + "Price :" + dairy.getPrice() + " Weight: " + dairy.getWeight() + " Calories: " + dairy.getCalories() +"*");
                                chocolates.add(dairy);
                                Weight.put("Dairy Milk", dairy.getWeight());
                                bag.put("Dairy Milk", dairy.getPrice());

                        }
                    }

                    else if (ch == 'B' || ch == 'b') {
                        choco = new Snickers();
                        if (choco instanceof Snickers) {
                            Snickers bournville = (Snickers) choco;
                            System.out.println("Your selected item's details");
                            System.out.println("* Snickers: " + "Price :" + bournville.getPrice() + " Weight: " + bournville.getWeight() + " Calories: " + bournville.getCalories()+" *");


                                chocolates.add(bournville);
                                Weight.put("Snickers", bournville.getWeight());
                                bag.put("Snickers", bournville.getPrice());

                        }

                    }
                    break;
                case 2:
                    System.out.println("Pick your Favourite Cookie");
                    System.out.println("* Options: \n For Caramel, press CAR \n For ChocoChip, press CHO *");
                    String str = sc.next();
                    cookies cook;
                    if (str.equalsIgnoreCase("car")) {
                        cook = new Caramel();
                        if(cook instanceof Caramel) {
                            Caramel caramel = (Caramel) cook;
                            System.out.println("Your selected item's detail");
                            System.out.println("* Caramel Cookie " + "Price: " + caramel.getPrice() + " Weight: " + caramel.getWeight() + " Calories: " + caramel.getCalories()+" *");
                            //System.out.println(cook.toString());

                                cookies.add(caramel);
                                Weight.put("Caramel cookie", caramel.getWeight());
                                bag.put("Caramel Cookie", caramel.getPrice());

                        }
                    }

                   else if (str.equalsIgnoreCase("cho")) {
                        cook = new ChocoChip();
                        if(cook instanceof  ChocoChip) {
                            ChocoChip chocoChip = (ChocoChip) cook;
                            System.out.println("Your selected item's detail");
                            System.out.println("* ChocoChip Cookie " + "Price: " + chocoChip.getPrice() + " Weight: " + chocoChip.getWeight() + " Calories: " + chocoChip.getCalories()+" *");
                            //System.out.println(cook.toString());

                                cookies.add(chocoChip);
                                Weight.put("ChocoChip cookie", chocoChip.getWeight());
                                bag.put("ChocoChip Cookie", chocoChip.getPrice());

                        }
                    }

                    break;
                case 3:
                    System.out.println("Pick your Favourite Cake");
                    System.out.println("* Options: \n For BlueBerry, press BB \n For Butterscotch, press BS *");
                    String cakeOpt = sc.next();
                    cake ca;
                    if (cakeOpt.equalsIgnoreCase("BB")) {
                        ca = new Blueberry();
                        if (ca instanceof Blueberry) {
                            Blueberry blueberry = (Blueberry) ca;
                            System.out.println("Your selected item's detail");
                            System.out.println("* BlueBerry cake " + "Price: " + blueberry.getPrice() + " Weight: " + blueberry.getWeight() + " Calories: " + blueberry.getCalories()+ "*");
                            //System.out.println(ca.toString());


                            cakes.add(blueberry);
                            Weight.put("Blueberry Cake", blueberry.getWeight());
                            bag.put("BlueBerry cake", blueberry.getPrice());

                        }
                    }

                   else if (cakeOpt.equalsIgnoreCase("BS")) {
                        ca = new Butterscotch();
                        if (ca instanceof Butterscotch) {
                            Butterscotch butterscotch = (Butterscotch) ca;
                            System.out.println("Your selected item's detail");
                            System.out.println("* ButterScotch cake " + "Price: " + butterscotch.getPrice() + " Weight: " + butterscotch.getWeight() + " Calories: " + butterscotch.getCalories()+" *");
                            cakes.add(butterscotch);
                            Weight.put("ButterScotch Cake", butterscotch.getWeight());
                            bag.put("ButterScotch cake", butterscotch.getPrice());

                        }
                    }


                    break;
                case 10:
                    System.out.println("* display chocolates by price low to high *");
                    Collections.sort(AllChocos, new getChocolatesByPrice());
                    for (int i = 0; i < AllChocos.size(); i++) {
                        System.out.println(AllChocos.get(i).toString());
                    }
                    break;
                case 11:
                    System.out.println("* display chocolates by calories low to high *");
                    Collections.sort(AllChocos, new getChocolatesByCalories());
                    for (int i = 0; i < AllChocos.size(); i++) {
                        System.out.println(AllChocos.get(i).toString());
                    }
                    break;
                case 20:
                    System.out.println("* display cookies by price low to high *");
                    Collections.sort(AllCookies, new getCookiesByPrice());
                    for (int i = 0; i < AllCookies.size(); i++)
                        System.out.println(AllCookies.get(i).toString());
                    break;
                case 21:
                    System.out.println("* display cookies by calories low to high *");
                    Collections.sort(AllCookies, new getCookiesByCalories());
                    for (int i = 0; i < AllCookies.size(); i++)
                        System.out.println(AllCookies.get(i).toString());
                    break;
                case 0:
                    ArrayList<String> sortedBag = new ArrayList<>(bag.keySet());
                    Collections.sort(sortedBag);

                    System.out.println("* Items in your bag has been sorted(Low to High) *");
                    for (String x : sortedBag) {
                        System.out.println("Item: " + bag.get(x) + " Price: " + x);
                    }

                    //finding total weight of the bag
                    ArrayList<Double> w = new ArrayList<>(bag.values());
                    double totalWeight = 0;
                    for (int i = 0; i < sortedBag.size(); i++)
                        totalWeight += w.get(i);

                    System.out.println("* Do you want to search an item within a price range? *");
                    char c = sc.next().charAt(0);
                    if(c=='y'|| c=='Y') {
                        //to find an item between a price range
                        System.out.println("Enter the initial price range");
                        int min = sc.nextInt();
                        System.out.println("Enter the highest price range");
                        int max = sc.nextInt();

                        Iterator itr2 = bag.entrySet().iterator();
                        while (itr2.hasNext()) {
                            Map.Entry<String, Double> val = (Map.Entry<String, Double>) itr2.next();
                            Double price = val.getValue();
                            if (price >= min && price <= max)
                                System.out.println("Sweet Name:- " + val.getKey());
                            else
                                continue;
                        }
                    }
                    else
                    System.out.println("Total weight of the bag is "+ totalWeight);
                    break;
                case -1:
                    System.out.println("* Thank you *");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid option");
                    System.out.println("Choose valid option ");
                    showMenu();

            }

        }while(n>=-1);

    }
}
