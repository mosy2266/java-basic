package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("주문할 개수를 입력하세요 : ");
        int n = input.nextInt();
        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            input.nextLine(); //nextInt() 후에 nextLine()을 바로 받으면 개행문자 때문에 한 줄 띄워짐 -> 개행문자 미리 제거
            System.out.print("상품명 : ");
            String productName = input.nextLine();
            System.out.print("가격 : ");
            int price = input.nextInt();
            System.out.print("수량 : ");
            int quantity = input.nextInt();
            productOrders[i]=createOrder(productName, price, quantity);
        }

        printOrders(productOrders);
        System.out.println("총 결제 금액 : " + getTotalAmount(productOrders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder order : productOrders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalPrice = 0;
        for (ProductOrder order : productOrders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }

}
