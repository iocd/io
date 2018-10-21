package test;

public class t {
	public static void main(String[] args) {
		System.out.println("abcd".substring(0,3).indexOf("b"));
		//abc 1 截取字符串中下标为0-2的字串 返回指定字符在此字符串中第一次出现处的索引。
		System.out.println("abcdah".lastIndexOf("a"));
		//4 返回指定字符在此字符串中最后一次出现处的索引
		System.out.println("ass?fg".contains("?"));
		//true 当且仅当此字符串包含指定的 char 值序列时，返回 true
		
		String[] arr="asas?askif4".split("\\?");
		System.out.println(arr[0]+" "+arr[1]);//asas askif4
		//根据给定正则表达式的匹配拆分此字符串
		
		
		
		
		
		
		
	}
}
