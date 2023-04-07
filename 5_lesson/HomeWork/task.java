import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Есть текст, нужно извлечь из него все слова и отсортировать по длине
		 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
		 * проснись
		 * 
		 */

		String longText = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
		collectWords(longText);
	}

	public static void collectWords(String text) {
		Map<Integer, List<String>> wordsMap = new HashMap<>();
		String[] words = text.split(" ");
		for (String word : words) {
			List<String> wordsList = new ArrayList<>();
			int lenght = word.length();
			if (wordsMap.containsKey(lenght)) {
				wordsList = wordsMap.get(lenght);
			}
			wordsList.add(word);
			wordsMap.put(lenght, wordsList);
		}

		for (Integer key : wordsMap.keySet()) {
			System.out.println(String.join(", ", wordsMap.get(key)));
		}
	}
}

