package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        /*
        <내가 푼 코드> : 정상 동작은 함
        if (itemCount < 10) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
        */

        //답안 코드 -> if-else문을 사용하지 않고 return을 사용해서 짜면 검증 로직과 실행 로직을 구분해서 보기 좋다!
        //검증 로직
        if (itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        //실행 로직
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        //int total=0;
        System.out.println("장바구니 상품 출력");
        /*
        <내가 푼 코드> : 정상 동작은 함
        for (int i=0; i<itemCount; i++) {
            System.out.println("상품명 : " + items[i].getName() +
                    ", 합계 : " + items[i].getPrice() * items[i].getQuantity());
            total += items[i].getPrice() * items[i].getQuantity();
        }
        System.out.println("전체 가격 합 : " + total);
        */

        //답안 코드
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명 : " + items[i].getName() + ", 합계 : " + items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    //답안 코드 -> 이 메서드는 ShoppingCart 클래스 내부에서만 사용되므로 private 접근 제어자 사용
    private int calculateTotalPrice() {
        int totalprice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalprice += items[i].getTotalPrice();
        }
        return totalprice;
    }
}
