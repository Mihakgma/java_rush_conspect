public class Main {
    public static void main(String[] args) {
        JavarushQuest[] quests = JavarushQuest.values();
        for (JavarushQuest q: quests) {
            System.out.println(q.ordinal());
        }
    }
}
