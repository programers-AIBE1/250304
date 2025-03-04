import llm.LLM;
import slack.Slack;
import util.secret.MySecret;
import util.secret.NoEnvException;
import util.webclient.WebClient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws NoEnvException, InterruptedException, IOException {
        Slack slack = new Slack();
        LLM llm = new LLM();
        String aiResult = llm.sendPrompt("meta-llama/Llama-3.3-70B-Instruct-Turbo-Free", "Recommend a book for me. No markdown, No escape character, nut shell");
        slack.sendMessage(aiResult);

    }
}