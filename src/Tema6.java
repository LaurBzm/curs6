import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tema6 {
    private String name;
    private int age;
    private String married;
    public Tema6(String name, int age, String married) {
       this.name = name;
        this.age = age;
        this.married = married;
    }
        public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String isMarried() {
        return married;
    }
}
public class Main {
    public static void Main(String[] args) {
        String person1 = new String("Laur");
        String person2 = new String("Maria");
        String person3 = new String("Nicolae");

        System.out.println(person1.getName() + " este " + person1.getAge() + " varsta " + person1.getMarried() + " casatorit ");
        System.out.println(person2.getName() + " este " + person2.getAge() + " varsta " + person2.getMarried() + " casatorit ");
        System.out.println(person3.getName() + " este " + person3.getAge() + " varsta " + person3.getMarried() + " casatorit ");
    }

    public static class Product {
        private String productName;
        private double productPrice;
        private int productQuantity;
        private String productCategory;
        private double price;

        public Product(String productName, String productPrice, String productQuantity, String productCategory) {

        }

        {
            this.productName = productName;
            this.productPrice = productPrice;
            this.productQuantity = productQuantity;
            this.productCategory = productCategory;
        }

        public String getProductName() {
            return this.productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getProductQuantity() {
            return this.productQuantity;
        }

        public void setProductQuantity(int productQuantity) {
            this.productQuantity = productQuantity;
        }

        public String getProductCategory() {
            return this.productCategory;
        }

        public void setProductCategory(String productCategory) {
            this.productCategory = productCategory;
        }

        public boolean setPrice(int amount) {
            int balance = 0;
            if (balance <= amount) {
                amount -= balance;
                return true;
            }
            return false;
        }


        public boolean category() {
            boolean category;
            int number = 5;

            if (number > 4) {
                category = true;
            } else {
                category = false;
            }

            return category;
        }
    }

    public static void main(String[] args) {

            List<Product> products = new ArrayList<>();
            Random r = new Random(10);
            int num;
            for (int i = 0; i < 3; i++) {
                num = r.nextInt(10);
                products(new Product("Name", "Price", "Product", "Quantity"));
            }

        }

    private static void products(Product product) {
    }

}

    
    }


class Bottle {
    private String availableLiquid;
    private double totalCapacity;
    private String open;

    public Bottle(double totalCapacityapacity1, String availableLiquid1, String open1) {
        if (availableLiquid.length() != 0) {
            this.availableLiquid = availableLiquid1;
            this.totalCapacity = totalCapacityapacity1;
            this.open = open1;
        } else {
            System.out.println("Bottle has more liquid!");
        }
    }

    public String getAvailableLiquid() {
        return availableLiquid;
    }

    public void setAvailableLiquid() {
        this.availableLiquid = availableLiquid;
    }

    public void setTotalCapacity() {
        this.totalCapacity = totalCapacity;

    }

    public double getTotalCapacity() {
        return totalCapacity = 0;
    }
}

