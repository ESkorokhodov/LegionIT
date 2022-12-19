package SelfTrain;

public class TypingGame {
    public static void main(String[] args) {
        String[] user = {"cat", "blue", "skt", "umbrells", "paddy"};
        String[] correct = {"cat", "blue", "sky", "umbrella", "paddy"};
        int[] output = new int[user.length];


        for (int i = 0; i < user.length; i++) {
            for (int j = 0; true; j++) {
                if (user[i].equals(correct[j]) && i == j) {
                    output[i] = 1;
                } else {
                    output[i] = -1;
                }

            }
        }
    }
}



