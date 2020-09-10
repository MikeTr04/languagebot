package tr.work.Handlers;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Handler extends TelegramLongPollingBot {
    private static final String TOKEN = "1127398277:AAGlTNdr0tp2I1YJVzcd--5x38a5_UWbNXw";
    private static final String USERNAME = "TrLangBot";
    @Override
    public String getBotUsername() {

        return USERNAME;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage()){
            Message message = update.getMessage();


            if(message.hasText()){


                SendMessage sendMessageRequest = new SendMessage();
                sendMessageRequest.setChatId(message.getChatId().toString());
                sendMessageRequest.setText("you said: " + message.getText());
                try {
                    sendMessage(sendMessageRequest);
                } catch (TelegramApiException e) {

                }
            }
        }

    }



    @Override
    public String getBotToken() {

        return TOKEN;
    }
}
