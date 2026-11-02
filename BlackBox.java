public class BlackBox {
    public int findIndexOfLetter(String word, String letter){
        for (int i = 0; i < word.length(); i++)
            if (word.substring(i, i + 1).equals(letter)){
                return i;
            }
        return -1;
    }
}
