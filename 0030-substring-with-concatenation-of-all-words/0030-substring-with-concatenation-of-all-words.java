import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int numWords = words.length;
        int totalLen = wordLen * numWords;
        int sLen = s.length();

        if (sLen < totalLen) {
            return result;
        }

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            Map<String, Integer> currentWindowCounts = new HashMap<>();
            int wordsFound = 0;
            int left = i;

            for (int j = i; j <= sLen - wordLen; j += wordLen) {
                String currentWord = s.substring(j, j + wordLen);

                if (wordCounts.containsKey(currentWord)) {
                    currentWindowCounts.put(currentWord, currentWindowCounts.getOrDefault(currentWord, 0) + 1);

                    if (currentWindowCounts.get(currentWord) <= wordCounts.get(currentWord)) {
                        wordsFound++;
                    } else {
                        while (currentWindowCounts.get(currentWord) > wordCounts.get(currentWord)) {
                            String leftWord = s.substring(left, left + wordLen);
                            currentWindowCounts.put(leftWord, currentWindowCounts.get(leftWord) - 1);
                            
                            if (currentWindowCounts.get(leftWord) < wordCounts.get(leftWord)) {
                                wordsFound--;
                            }
                            left += wordLen;
                        }
                    }

                    if (wordsFound == numWords) {
                        result.add(left);

                        String leftWord = s.substring(left, left + wordLen);
                        currentWindowCounts.put(leftWord, currentWindowCounts.get(leftWord) - 1);
                        wordsFound--;
                        left += wordLen;
                    }
                } else {
                    currentWindowCounts.clear();
                    wordsFound = 0;
                    left = j + wordLen;
                }
            }
        }

        return result;
    }
}