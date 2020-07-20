package unitomega13.magicBall8.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.*;

public class magicBall8 implements EntryPoint {

   private VerticalPanel verticalPanel = new VerticalPanel();
   private Button start = new Button("Start");
   private Button newTry = new Button("Again");
   private Label textArea = new Label();
   private Label statistic = new Label();
   int positive = 0;
   int negative = 0;
   int almostPositive = 0;
   int neutral = 0;
   int count = 0;

    public void onModuleLoad() {
            start();
        }

    private void start(){
        verticalPanel.add(start);
        verticalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        verticalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        start.setSize("200", "200");
        start.addStyleName("newOne");
        textArea.setSize("600", "50");
        statistic.setSize("600", "250");
        statistic.setText("Total attempts: " + count + "\n" + "positive answers: " + positive + "\n"
                + "almost positive answers: " + almostPositive + "\n" + "neutral answers: " + neutral + "\n"
                + "negative answers: " + negative);
        textArea.setStyleName("newOne");
        newTry.addClickHandler(event -> {
            int value = (Random.nextInt(2000) + 1) / 100;
            startMagic(value);
        });
        verticalPanel.add(statistic);
        RootPanel.get("frame1").add(verticalPanel);
        start.addClickHandler(event -> {
            int value = (Random.nextInt(2000) + 1) / 100;
            startMagic(value);
            verticalPanel.add(textArea);
            verticalPanel.remove(start);
            verticalPanel.add(newTry);
        });
    }

    private void startMagic(int value) {
        switch (value) {
            case 1:
                textArea.setText("It is certain (Бесспорно)");
                count++;
                positive++;
                break;
            case 2:
                textArea.setText("It is decidedly so (Предрешено)");
                count++;
                positive++;
                break;
            case 3:
                textArea.setText("Without a doubt (Никаких сомнений)");
                count++;
                positive++;
                break;
            case 4:
                textArea.setText("Yes - definitely (Определённо да)");
                count++;
                positive++;
                break;
            case 5:
                textArea.setText("You may rely on it (Можешь быть уверен в этом)");
                count++;
                positive++;
                break;
            case 6:
                textArea.setText("As I see it, yes (Мне кажется — «да»)");
                count++;
                almostPositive++;
                break;
            case 7:
                textArea.setText("Most likely (Вероятнее всего)");
                count++;
                almostPositive++;
                break;
            case 8:
                textArea.setText("Outlook good (Хорошие перспективы)");
                count++;
                almostPositive++;
                break;
            case 9:
                textArea.setText("Signs point to yes (Знаки говорят — «да»)");
                count++;
                almostPositive++;
                break;
            case 10:
                textArea.setText("Yes (Да)");
                count++;
                almostPositive++;
                break;
            case 11:
                textArea.setText("Reply hazy, try again (Пока не ясно, попробуй снова)");
                count++;
                neutral++;
                break;
            case 12:
                textArea.setText("Ask again later (Спроси позже)");
                count++;
                neutral++;
                break;
            case 13:
                textArea.setText("Better not tell you now (Лучше не рассказывать)");
                count++;
                neutral++;
                break;
            case 14:
                textArea.setText("Cannot predict now (Сейчас нельзя предсказать)");
                count++;
                neutral++;
                break;
            case 15:
                textArea.setText("Concentrate and ask again (Сконцентрируйся и спроси опять)");
                count++;
                neutral++;
                break;
            case 16:
                textArea.setText("Don’t count on it (Даже не думай)");
                count++;
                negative++;
                break;
            case 17:
                textArea.setText("My reply is no (Мой ответ — «нет»)");
                count++;
                negative++;
                break;
            case 18:
                textArea.setText("My sources say no (По моим данным — «нет»)");
                count++;
                negative++;
                break;
            case 19:
                textArea.setText("Outlook not so good (Перспективы не очень хорошие)");
                count++;
                negative++;
                break;
            case 20:
                textArea.setText("Very doubtful (Весьма сомнительно)");
                count++;
                negative++;
                break;
            default:
                break;
        }
    }

}
