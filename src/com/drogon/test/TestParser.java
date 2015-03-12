package com.drogon.test;

import java.io.IOException;
import java.util.Iterator;
import com.drogon.core.Drogon;

/**
Contributors: Nachi
 */
public class TestParser {

	public static void main(String[] args) {
		String str = "Mozilla/5.0 (Unknown; Linux x86_64) AppleWebKit/534.34 (KHTML, like Gecko) PhantomJS/1.9.7 Safari/534.34";
		try {
			long start = System.currentTimeMillis();
			for(int i=0;i<10000;i++){
				Drogon parser = new Drogon(); 
				Iterator<String> iterator = parser.getProductList(str).iterator();
				while(iterator.hasNext()){
					System.out.println(iterator.next());
				}
			}
			System.out.println("Time taken = "+(System.currentTimeMillis() - start)+"ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
