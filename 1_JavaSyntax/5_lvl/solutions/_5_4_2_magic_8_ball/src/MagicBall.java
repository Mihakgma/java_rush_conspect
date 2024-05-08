import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        //напишите тут ваш код
        String[] answers = new String[] {
                CERTAIN,
                DEFINITELY,
                MOST_LIKELY,
                OUTLOOK_GOOD,
                ASK_AGAIN_LATER,
                TRY_AGAIN,
                NO,
                VERY_DOUBTFUL
        };
        Random r = new Random();
        int rndIndex = r.nextInt(8);
        if (rndIndex > 7 | rndIndex < 0) {
            return null;
        } else {
            return answers[rndIndex];
        }
    }
}