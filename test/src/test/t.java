package test;

public class t {
	public static void main(String[] args) {
		System.out.println("abcd".substring(0,3).indexOf("b"));
		//abc 1 ��ȡ�ַ������±�Ϊ0-2���ִ� ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
		System.out.println("abcdah".lastIndexOf("a"));
		//4 ����ָ���ַ��ڴ��ַ��������һ�γ��ִ�������
		System.out.println("ass?fg".contains("?"));
		//true ���ҽ������ַ�������ָ���� char ֵ����ʱ������ true
		
		String[] arr="asas?askif4".split("\\?");
		System.out.println(arr[0]+" "+arr[1]);//asas askif4
		//���ݸ���������ʽ��ƥ���ִ��ַ���
		
		
		
		
		
		
		
	}
}
