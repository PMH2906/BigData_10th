package com;

public class Ex5 {

	public static void main(String[] args) {
		String[] data = new String[5];
		try {
			for (int i =0;i<data.length+1;i++) {
				data[i] = "H";
				System.out.println(data[i]);
			}			
		} catch (Exception e) {
			System.out.println("배열의 인덱스 범위를 넘어갔습니다.");
		}

	}

}
