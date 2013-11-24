package core;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChineseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChineseDemo demo = new ChineseDemo();

		demo.sortByPinyin();
	}

	public void sortByPinyin() {
		Collator cmp = Collator.getInstance(java.util.Locale.CHINA);
		String[] arr = { "����", "����", "����", "����", "JAVA", "123", "$%$#", "����A",
				"1����A", "1����b", "1����a", "����", "��", "����" };

		List<String> list = Arrays.asList(arr);
		Arrays.sort(arr, cmp);
		System.out.println(list);

		String zhStr = "�й�aadf��111��bbb�Ƶ�zz����";
		// List<String> listZhStr = splitZhStr(zhStr);
		// Arrays.sort(listZhStr.toArray(), cmp);
		// System.out.println(listZhStr);
		String[] arr2 = splitZhStr2(zhStr);
		List<String> list2 = Arrays.asList(arr2);
		Arrays.sort(arr2, cmp);
		System.out.println(list2);
	}

	public List<String> splitZhStr(String content) {

		char[] cArray = content.toCharArray();
		List l = new ArrayList();
		// for(char c:cArray){
		// l.add(c);
		// }
		// return l;
		String sTemp = "";
		for (int i = 0; i < cArray.length; i++) {
			sTemp = new String(cArray, i, 1);
			l.add(sTemp);
		}
		return l;
	}

	public String[] splitZhStr2(String content) {

		char[] cArray = content.toCharArray();
		String[] sArray = new String[cArray.length];
		// for(char c:cArray){
		// l.add(c);
		// }
		// return l;
		String sTemp = "";
		for (int i = 0; i < cArray.length; i++) {
			sTemp = new String(cArray, i, 1);
			sArray[i] = sTemp;
		}
		return sArray;
	}
}
