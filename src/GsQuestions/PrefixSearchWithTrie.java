//package GsQuestions;
//
//import java.util.List;
//
//public class PrefixSearchWithTrie {
//    public static void main(String[] args) {
//        String[] words = {"apple", "applet", "bread", "aper"};
//        String prefix = "app";
//
//        Trie trie = new Trie();
//        for (String word : words) {
//            trie.insert(word);
//        }
//
//        List<String> matches = trie.searchWithPrefix(prefix);
//        System.out.println("Words starting with \"" + prefix + "\": " + matches);
//    }
//}
