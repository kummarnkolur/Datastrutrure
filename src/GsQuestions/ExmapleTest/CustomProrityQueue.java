package GsQuestions.ExmapleTest;

public class CustomProrityQueue {
    private int capacity;
    private int[] heap;
    private int size;

    public CustomProrityQueue(int capacity){
        this.capacity=capacity;
        heap=new int[capacity];
        size=0;
    }
    private int parent(int i){
        return (i-1)/2;
    }

    private int leftChild(int i){
        return i*2+1;
    }
    private int rightChild(int i){
        return i*2+2;
    }

    public void insert(int val){
        if(size==capacity) throw  new RuntimeException("Full");
//        {
//            capacity=capacity*3/2;
//            heap=new int[capacity];
//        }
        heap[size]=val;
        heapifyUp(size);
        size++;

    }

    public int peek(){
        if (size == 0) throw new RuntimeException("Heap is empty");
        return heap[0];
    }

    public int extraxtMax(){
        if(size==0) throw new RuntimeException("Heap is empty");
        int max=heap[0];
        heap[0]=heap[size-1];
        size--;
        heapifyDown(0);
        return max;
    }

    private void heapifyDown(int i){
        int largest=i;
        int right=rightChild(i);
        int left=leftChild(i);

        if(left<size&&heap[left]>heap[largest]){
            right=largest;
        }
        if(right<size&& heap[right]>heap[largest]){
            left=largest;
        }
        while (largest!=i){
            swap(i,parent(i));
            heapifyDown(i);
        }
    }
    private void heapifyUp(int i){
        while (i>0&&heap[parent(i)]<heap[size]){
            swap(i,parent(i));
            i=parent(i);
        }

    }
    private void swap(int i,int j){
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
    public static void main(String[] args) {
        CustomProrityQueue cQ=new CustomProrityQueue(5);
        cQ.insert(3);
        cQ.insert(4);
        cQ.insert(6);
        cQ.insert(5);
//        cQ.insert(4);
//        cQ.insert(6);
//        cQ.insert(5);
    }
}

