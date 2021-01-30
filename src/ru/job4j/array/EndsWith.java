package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean rsl = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }


    public static void main(String[] args) {
        char[] word = new char[]{'h', 'e', 'l', 'l', 'o', 'u'};
        char[] post = new char[]{'o', 'u'};
        System.out.println(endsWith(word, post));
    }
}



