package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드에 직접 접근하여 수정");
        //speaker.volume = 200; //volume 필드에 private 접근 제어자가 붙었으므로 오류가 발생
        //java: volume has private access in access.Speaker 오류 메시지 확인 가능

        speaker.showVolume();
    }
}

/*
Speaker 객체를 사용하는 사용자 -> Speaker의 volume 필드와 메서드에 모두 접근할 수 있음

volumeUp()과 같은 메서드에서 음량이 100을 넘지 못하게끔 기능을 개발했지만 소용이 없음
Speaker를 사용하는 입장에서는 volume 필드에 직접 접근해서 바꿔버리면 그만이기 때문!!

-> 이런 문제를 해결하기 위해선 volume 필드의 외부 접근을 막을 수 있는 방법이 필요

<접근 제어자의 종류>
1. private : 모든 외부 호출을 막음
2. default(package-private) : 같은 패키지 안에서의 호출은 허용
3. protected : 같은 패키지 안에서의 호출은 허용. 단, 패키지가 달라도 상속 관계의 호출은 허용
4. public : 모든 외부 호출을 허용

private -> default -> protected -> public 순으로 점점 허용 범위가 늘어남
접근 제어자를 명시하지 않으면 기본적으로 default 접근 제어자가 적용(실제로는 package-private이 더 정확한 표현)

접근 제어자 사용 위치 : 필드와 메서드, 생성자에 사용(+ 클래스 레벨에도 일부 접근 제어자를 사용 가능)

<접근 제어자의 핵심> - 속성과 기능을 외부로부터 숨기는 것!!
private : 나의 클래스 안으로 속성과 기능을 숨길 때 -> 외부 클래스에서 해당 기능 호출 불가
default : 나의 패키지 안으로 속성과 기능을 숨길 때 -> 외부 패키지에서 해당 기능 호출 불가
protected : 상속 관계로 속성과 기능을 숨길 때 -> 상속 관계가 아닌 곳에서 해당 기능 호출 불가
public : 속성과 기능을 숨기지 않고 어디서든 호출할 수 있게 공개
*/