grammar UserAgent;

@header{
	package com.drogon.core;
	import java.util.List;
	import java.util.ArrayList;
}

@parser::members{
	List<String>list;
	/**
	* Custom constructor to pass reference to a list to 
	* which product names are to be added
	*/
	public UserAgentParser(TokenStream input, List list){
		this(input);
		this.list = list;
	}
}  

useragent  	:  body;         

body		: product
			| body SP tail
			;

tail    	: product 
        	| COMMENT
        	;
	
product		: ID '/' version	{
									list.add($ID.text);
								}
	   		| ID				{
	   								list.add($ID.text);
	   							}
	   		;

version		: ID
        	;
 
ID 			: [A-Za-z0-9.!#$%&'*+-.^_`|~]+;		
SP 			: [ \t];
WS 			: [\r\n]+ -> skip; 
COMMENT		: '(' (.)*? ')';	