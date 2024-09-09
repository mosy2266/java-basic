package oop1;

//중복되는 부분들을 메서드로 추출

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);

        //볼륨 증가
        volumeUp(data);

        //볼륨 증가
        volumeUp(data);

        //볼륨 감소
        volumeDown(data);

        //음악 플레이어 상태
        showStatus(data);

        //음악 플레이어 끄기
        off(data);

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}

/*
각 기능을 메서드로 만듦 -> '모듈화'가 되었음!!
    1. 중복 제거 : 로직의 중복이 제거됨. 같은 로직이 여러 번 필요하면 해당 메서드만 여러 번 호출하면 됨
    2. 변경된 영향 범위 : 기능을 수정할 때 해당 메서드의 내부만 수정하면 됨
    3. 메서드 이름 추가 : 메서드 이름을 통해 코드의 이해가 더 쉬워짐

단, 이 코드의 한계 -> 데이터와 기능이 분리되어 있음
음악 플레이어의 데이터 = MusicPlayerData
음악 플레이어의 기능 = MusicPlayerMain3에 있는 메서드
MusicPlayerMain3에 있는 각 메서드는 대부분 MusicPlayerData의 데이터를 사용함
-> 관련 데이터가 변경되면 MusicPlayerMain3의 메서드들도 함께 변경해야 함 + 유지보수 관점에서도 관리 포인트가 2곳으로 늘어남

데이터와 그 데이터를 사용하는 기능을 매우 밀접하게 연관되어 있음
-> 객체 지향 프로그래밍을 사용하면 데이터와 기능을 온전히 하나로 묶어서 사용 가능!
*/