package stu;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		
		Map<String, Object> para = new HashMap<String, Object>();
		String a = null;

		StringBuilder sb = new StringBuilder("");

		String prov = "广东省";
		String city = "深圳市";
		String arear = "福田区";
		String address = (prov == null ? "" : prov) + (city == null ? "" : city) + (arear == null ? "" : arear);
		System.err.println(System.currentTimeMillis());

		// http://nongfang-10000212.image.myqcloud.com/7802f7f2-cace-4a1e-b056-a0765d8d0dc2
		// http://chetongapp-10000212.file.myqcloud.com/test/1453192450476706055.aac
		String url = "http://nongfang-10000212.image.myqcloud.com/7802f7f2-cace-4a1e-b056-a0765d8d0dc2";
		String regex = "http://(.*)-(.*).image.myqcloud.com/(.*?)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(url);
		if (m.matches()) {

			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(m.group(3));

		}

	}

}
