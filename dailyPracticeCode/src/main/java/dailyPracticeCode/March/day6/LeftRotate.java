package dailyPracticeCode.March.day6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeftRotate {
	
	public static void main(String[] args) {
		
		String str="abc abc abc pqr pqr pqr dvc";
		
		List<String> list = Arrays.asList(str.split(" "));
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		Set<Entry<String, Long>> set = map.entrySet();
		
		for (Entry<String, Long> entry : set) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
