package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    /*
    <내가 푼 코드> : 정상 동작은 함
    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    */

    //답안 코드 -> 해당 메서드를 제공하면 외부에서는 단순히 이 메서드를 호출만 하면 됨. 이 메서드 핵심은 자신이 가진 데이터를 사용한다는 것!
    public int getTotalPrice() {
        return price * quantity;
    }
}
