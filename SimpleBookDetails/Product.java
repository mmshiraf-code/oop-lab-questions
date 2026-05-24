/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleBookDetails;

/**
 *
 * @author Shiraf
 */
class Product {

    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public Product(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double calculateTotal() {
        return itemPrice * itemQuantity;
    }

    public String getStockStatus() {

        if (itemQuantity < 5) {
            return "Low Stock";
        } else {
            return "Available";
        }

    }

}
