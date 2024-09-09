package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        //음악 플레이어 켜기
        player.on();

        //볼륨 증가
        player.volumeUp();

        //볼륨 증가
        player.volumeUp();

        //볼륨 감소
        player.volumeDown();

        //음악 플레이어 상태
        player.showStatus();

        //음악 플레이어 끄기
        player.off();
    }
}

/*
MusicPlayer 객체를 생성하고 필요한 기능(메서드)을 호출하기만 하면 됨!

MusicPlayer를 사용하는 입장 :
MusicPlayer 내부의 데이터인 volume, isOn 같은 것은 전혀 사용하지 않음
-> MusicPlayer 내부에 어떤 속성(데이터)이 있는지 몰라도 됨! 단순하게 MusicPlayer가 제공하는 기능 중 필요한 것을 호출, 사용하기만 하면 됨

<캡슐화>
MusicPlayer = 음악 플레이어를 구성하기 위한 속성과 기능이 하나의 캡슐에 쌓여있는 것처럼 되어 있음
-> 이처럼 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 '캡슐화'라고 함

*/