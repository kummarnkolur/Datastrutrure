package GsQuestions.Tries;

import java.util.ArrayList;
import java.util.List;

public class tries {
    private static Node root;

    tries(){
        root=new Node();
    }

    public  void  insert(String word){
        Node node=root;
//        System.out.println(node);
        for(char ch:word.toCharArray()){
          if(node.links[ch-'a']==null){
             node.links[ch-'a']=new Node();
          }

          //moves to reference trie
          node=node.links[ch-'a'];
        }

        node.flag=true;
    }

    public  Node serach(String word){
        Node node=root;
        for(char ch:word.toCharArray()){
            if(node.links[ch-'a']==null){
               return null;
            }
            node=node.links[ch-'a'];
        }
        return node;
    }

    private void dfs(Node node, String prefix, List<String> result) {
        if (node.flag) {
            result.add(prefix);
        }
        for (int i = 0; i < 26; i++) {
            if (node.links[i] != null) {
                dfs(node.links[i], prefix + (char)('a' + i), result);
            }
        }
    }

    public  List<String> getWordsStartingWith(String prefix) {
        List<String> result = new ArrayList<>();
        Node node = serach(prefix);
        if (node == null) return result;
        dfs(node, prefix, result);
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
//        List<String> list=new ArrayList<>();
        tries newtries=new tries();
        for(String word:arr){
            newtries.insert(word);
        }
     List<String> lis=  newtries.getWordsStartingWith(prefix);
     System.out.println(lis);

    }

}
