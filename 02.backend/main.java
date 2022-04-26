// 클래스 명은 항상 대문자여야함

public class main //main이라는 클래스가 있고, 그 클래스는 1개의 메서드(main())을 가지고 있다.
{
    // mainn()은 특별한 메서드
    public static void main(String[] args)
    {
        //Java 프로그램을 실행하면 main()이 호출됨.
        // Java에서 문자열은 "" 사용
        System.out.print("Hellow World");
        hi();
    }

    public static void hi()
    {
        System.out.print("hi")
    }
}