import slack.Slack;
import util.secret.NoEnvException;

public class Application {
    public static void main(String[] args) throws NoEnvException, InterruptedException {
        Slack slack = new Slack();
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            slack.sendMessage("안녕");
            Thread.sleep(1000);
            slack.sendMessage("나는");
            Thread.sleep(1000);
            slack.sendMessage("도우도우야");
        }
    }
}