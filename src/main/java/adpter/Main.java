package adpter;

public class Main {
    public static void main(String[] args) {
        IArabicSpeaker adapter = new LanguageAdapter();
        adapter.greeting();

        IEnglishSpeaker englishSpeaker = new EnglishSpeaker();
        englishSpeaker.greeting();
    }
}
