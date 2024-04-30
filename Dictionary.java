package vocabulary;

import java.util.*;

public class Dictionary {
    List<String> words;
    HashMap<String, String> translations;

    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        this.add("Luggage", "Baggage");
        this.add("Mountain", "Montagne");
        this.add("Forest", "Forêt");
        this.add("Sky", "Ciel");
        this.add("Beach", "Mer");
        this.add("Spain", "Espagne");
    }

    public String get(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.words.add(word);
        }
        this.translations.put(word, translation);
    }

    public String getRandomWord() {
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }

    public void printDictionary() {
        System.out.println("The Dictionary has size " + this.translations.size() + ". It is: ");
        for (Map.Entry<String, String> entry: this.translations.entrySet()) {
            System.out.println(entry.getKey() + ": " +entry.getValue());
        }
        System.out.println("The list of words is: ");
        for (String word: words) {
            System.out.print(word + ", ");
        }
    }
}

