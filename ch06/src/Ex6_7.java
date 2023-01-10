class Data2 {int x;}
class Ex6_7 {
	public static void main(String[] args) {
		Data2 d = new Data2(); // 1) 객체생성
		d.x=10; // 2) 참조변수 d가 가리키는 객체 x의 값이 10저장
		System.out.println("main() : x = "+ d.x); // 3) println호출 d.x = 10
		
		change(d); // 4) d=main의 지역변수 ,change메서드 호출 d(0x100번지) 주소가 5)의 Data2 c의 값에 대입, 7)후 돌아옴
		System.out.println("After change(d)");  // 8)
		System.out.println("main() : x = " + d.x);  // 9) main의 끝
	
	}
	static void change(Data2 c) { // 참조형매개변수 5) 참조변수 c로 변경 = d의 주소(0x100)이랑 같은 주소
		c.x = 1000; // 6) 참조변수 c도 객체 x의 주소를 갖고있으니깐 가리키게됨, 1000을 참조변수c가 가리키는 x에 저장
		System.out.println("change() : x = " + c.x); // 7) println메서드호출
		
	}

}
