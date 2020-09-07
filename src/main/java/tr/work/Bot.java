package tr.work;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class Bot extends TelegramLongPollingBot {
    private static final String TOKEN = "1127398277:AAGlTNdr0tp2I1YJVzcd--5x38a5_UWbNXw";
    private static final String USERNAME = "TrLangBot";

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()){


        } else if(update.hasCallbackQuery()){
            

        }

    }


    @Override
    public String getBotUsername() {
        return USERNAME;
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }
}
