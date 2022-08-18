package step1_03.operator;

/*
 * 
 *  # 증감 연산자 
 *  
 *  1) 좌변에 우변의 값을 더한 후 저장		    +=
 *  2) 좌변에 우변의 값을 뺀 후 저장 	   		-=
 *  3) 좌변에 우변의 값을 곱한 후 저장 	   		*=
 *  4) 좌변에 우변의 값을 나눈 후 저장 	   		/=
 *  5) 좌변에 우변의 값을 나눈 나머지를 저장   	%=
 *  6) 변수의 값에 1을 더한 후 저장	        ++
 *  7) 변수의 값에 1을 뺀 후 저장	            --
 *  
 * */

public class OperatorEx08 {

	public static void main(String[] args) {

		int tempData1 = 10;
		tempData1 += 1;
		System.out.println(tempData1);

		int tempData2 = 20000;
		tempData2 -= 10000;
		System.out.println(tempData2);
		
		int tempData3 = 100;
		tempData3 *= 7;
		System.out.println(tempData3);
		
		System.out.println();

		// [ 참고 ] 변수++ 과 ++변수의 차이점 : 명령어 실행 순서의 차이가 있다.
		
		int x = 0;
		x++;  					  // 순서의 영향이 없음
		System.out.println(x);
		++x;  					  // 순서의 영향이 없음
		System.out.println(x);
		
		System.out.println();
		
		int y = 0;
		System.out.println(y++);  // sout 명령어 실행 후 y 증가
		System.out.println(y);
		
		int z = 0;
		System.out.println(++z);  // z 증가 후 sout 명령어 실행
		System.out.println(z);
		
	}

}




