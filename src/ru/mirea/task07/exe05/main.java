package ru.mirea.task07.exe05;

class Stroke implements Stringable {

    @Override
    public int charCounter(String str) {
        int i = 0, c = 0;

        while (i != str.length() - 1) {
            if (str.charAt(i) != ' ') c++;
            i++;
        }
        return c;
    }

    @Override
    public String oddPositioner(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(i);
            res += " ";
        }
        return res;
    }

    @Override
    public String reverser(String str) {
        String res = "";
        for(int i = str.length() - 1; i >= 0; i--){
            res += str.charAt(i);
        }
        return res;
    }
}
