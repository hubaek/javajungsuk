class Data {int x;}
class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data(); // 1)Data객체생성, 참조변수 : d
		d.x = 10; // 2)참조변수 d가 가리키는 x에 10을 대입
		System.out.println("main() : x = " + d.x); // println실행, main() : x = 10;
		
		change(d.x); // 3) change 메서드 호출 d.x의 값 10 --> 13라인 int x(기본형 매개변수)에 복사
		System.out.println("After change(d.x)"); // 5) println메서드 실행
		System.out.println("main() : x = "+ d.x); // 6) println실행, d가 가리키는 x의 값(d.x)는 2번의 값 10
		}
	
	static void change(int x) { // 기본형 매개변수 x= change 메서드의 지역변수
		x = 1000; // 지역변수 x에 1000을 대입 
		System.out.println("change() : x = "+ x); // 4) x=1000 , change메서드가 끝나면 지역변수 x:1000은 끝남
	}

}
