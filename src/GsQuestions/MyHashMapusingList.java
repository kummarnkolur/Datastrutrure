package GsQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyHashMapusingList<K,V> {
  static class Entry<K,V>{
      K key;
      V value;

      Entry(K key,V value){
          this.key=key;
          this.value=value;
      }
  }
  private List<Entry<K,V>> entries;

  MyHashMapusingList(){
      entries=new ArrayList<>();
  }

  public void put(K key,V value){
    for(Entry<K,V> entry:entries){
        if(Objects.equals(entry.key,key)){
            entry.value=value;
            return;
        }
    }
    entries.add(new Entry<>(key,value));
  }
  public V get(K key){
      for(Entry<K,V> entry:entries){
          if(Objects.equals(entry.key,key)){
              return entry.value;
          }
      }
      return null;
  }
  public void remove(K key){
      Entry<K,V> removeT=null;
      for(Entry<K,V> entry:entries){
        if(Objects.equals(entry.key,key)){
            removeT=entry;
            break;
        }
      }
      if(removeT!=null){
          entries.remove(removeT);
      }
  }
  public int size(){
      return entries.size();
  }
}
