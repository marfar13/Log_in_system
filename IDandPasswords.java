package main;

import java.util.HashMap;

public class IDandPasswords 
{
HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("user","password");
		logininfo.put("Denis","DENIS");
		logininfo.put("Marcu","marcu123");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}

}
