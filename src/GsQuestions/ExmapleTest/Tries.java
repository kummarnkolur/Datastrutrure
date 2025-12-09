package GsQuestions.ExmapleTest;

import java.util.ArrayList;
import java.util.List;

public class Tries {
    private static NodeTs root;

    Tries(){
        root=new NodeTs();
    }

    public void insert(String word){
        NodeTs node=root;
        for(char ch:word.toCharArray()){
            if(node.child[ch-'a']==null){
                node.child[ch-'a']=new NodeTs();
            }
            node=node.child[ch-'a'];
        }
        node.flag=true;
    }

    public static NodeTs serach(String word){
        NodeTs node=root;
        for(char ch:word.toCharArray()){
            if(node.child[ch-'a']==null){
                return null;
            }
            node=node.child[ch-'a'];
        }
        return node;
    }
    public static void dfs(NodeTs node,String prefix,List<String> list){
        if(node.flag){
            list.add(prefix);
        }
        for(int i=0;i<26;i++){
            if(node.child[i]!=null) {
                dfs(node.child[i], prefix + (char) ('a' + i), list);
            }
        }


    }
    public List<String> getStartWithPrefixChar(String prefix){
        List<String> list=new ArrayList<>();
       NodeTs node=serach(prefix);
       if(node==null){
           return list;
       }
           dfs(node,prefix,list);
        return list;
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        Tries newTry=new Tries();
        for(String str:arr){
            newTry.insert(str);
        }
        List<String> list=newTry.getStartWithPrefixChar(prefix);
        System.out.println(list);
    }
}
