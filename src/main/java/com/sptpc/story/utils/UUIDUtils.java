package com.sptpc.story.utils;

import java.util.UUID;

//获得唯一随机字符串
public class UUIDUtils {
	
	public static String getUuids(){
		
		String str = UUID.randomUUID().toString().replace("-", "");
		return str;
	}
	
  

}
