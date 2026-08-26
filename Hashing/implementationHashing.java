package Hashing;
import java.util.*;

public class implementationHashing {
    static class HashMap<K,V>{
        private class Node{

            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

            private int size;
         private int N;
            private LinkedList<Node> buckets[];

            @SuppressWarnings("unChecked")
            public  HashMap(){
                this.N =4;
                this.buckets = new LinkedList[4];
                for(int i=0; i<4; i++){
                    this.buckets[i] = new LinkedList<>();
                }
            }

            private int hashFunction(K key){
                 int hc = key.hashCode();
                 return Math.abs(hc)% N;

            }

            private int SearchInLL(K key, int bi){
                   LinkedList<Node> bucket = buckets[bi];
                   int di = 0;
                   for(int i=0; i<bucket.size(); i++){
                       Node node = bucket.get(i);
                       if(node.key == key){
                           return di;
                       }
                       di++;
                   }
                   return -1;
            }
            private void rehash(K key){
                 LinkedList<Node>oldBuck[] = buckets;
                 buckets = new LinkedList[N*2];
                 N = 2*N;
                 for(int i =0; i<buckets.length; i++){
                     buckets[i] = new LinkedList<>();
                 }

                 //nodes -> add in bucket
                for(int i=0; i<oldBuck.length; i++){
                    LinkedList<Node> ll = oldBuck[i];
                    for(int j=0; j<ll.size(); j++){
                        Node node = ll.remove();
                        put(node.key, node.value);
                    }
                }
            }
                public void put(K key, V  value){
                   int bi = hashFunction(key); // o to size-1
                   int di = SearchInLL(key, bi); // valid ; -1
                    if(di != -1){
                        Node node = buckets[bi].get(di);
                        node.value = value;
                    }else{
                        buckets[bi].add(new Node(key, value));
                        size++;
                    }

                    double lambda = (double)size/N;

                    if(lambda > 2.0){
                        rehash(key);
                    }
                }
                public boolean containsKey(K key){
                    int bi = hashFunction(key); // o to size-1
                    int di = SearchInLL(key, bi); // valid ; -1
                    if(di != -1){
                        return true;
                    }else{
                        return false;
                    }
                }

                public V remove(K key){
                    int bi = hashFunction(key); // o to size-1
                    int di = SearchInLL(key, bi); // valid ; -1
                    if(di != -1){
                        Node node = buckets[bi].remove(di);
                        size--;
                        return node.value;
                    }else{
                        return null;
                    }
                }

                public V get(K key){
                    int bi = hashFunction(key); // o to size-1
                    int di = SearchInLL(key, bi); // valid ; -1
                    if(di != -1){
                        Node node = buckets[bi].get(di);
                        return node.value;
                    }else{
                        return null;
                    }
                }

                public ArrayList<K> keySet(){
                    ArrayList<K>keys = new ArrayList<>();
                    for(int i=0; i<buckets.length; i++ ){
                        LinkedList<Node> ll =  buckets[i];
                        for(Node node: ll){
                            keys.add(node.key);
                        }
                    }
                    return keys;

                }

                public boolean isEmpty(){
                    return size==0;
                }


    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);

        ArrayList<String> keys =  map.keySet();
        for(String key: keys){
            System.out.println(map.get(key));
        }

    }
}
