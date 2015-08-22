drogon
======

A user agent parser.

Sample usage:

```java
		Drogon parser = new Drogon(); 
		Iterator<String> iterator = parser.getProductList(useragentString).iterator();
		while(iterator.hasNext()){
				System.out.println("Product = "+iterator.next());
		}
```

Sample output:

```
useragentString = "curl/7.22.0 (x86_64-pc-linux-gnu) libcurl/7.22.0 OpenSSL/1.0.1 zlib/1.2.3.4 libidn/1.23 librtmp/2.3"

Product = curl
Product = libcurl
Product = OpenSSL
Product = zlib
Product = libidn
Product = librtmp
```

Parse tree of the user agent:
![Parse tree](https://raw.githubusercontent.com/nachivpn/drogon/master/parse_tree.png)
