class Queue{

    int size;
    int arr[];
    int head = 0;
    int tail = 0;

    Queue(int size){

        this.size = size;
        this.arr = new int[size];
    }

    public void enqueue(int number){

        if(tail == arr.length){

            if(head > 0){

                tail = 0;
                arr[tail] = number;
                tail++;
                System.out.println("successfully added");
            }

            else{
                System.out.println("Stack full");
            }
        }
        else{
            if(head > 0 && head == tail){
                System.out.println("Underflow");
            }
            else{
                arr[tail] = number;
                tail++;
                System.out.println("successfully added");
            }
           
        }
    }

    public void dequeue(){

        if(head == arr.length){

            if(head == tail){
                System.out.println("Empty stack");
            }
            else{
                head = 0;
                System.out.println("Top value: "+arr[head]);
                head++;
            }
        }
       
        else{
            if(tail>0 && head == tail){
                System.out.println("Underflow");
            }
           else{
            System.out.println("Top value: "+arr[head]);
            head++;
           }
        }
    }
}


public class Main{

    public static void main(String[] args){

        Queue first = new Queue(5);
        first.enqueue(56);
        first.enqueue(516);
        first.enqueue(16);
        first.enqueue(60);
        first.enqueue(36);
       
        
        first.dequeue();
        first.dequeue();
        first.dequeue();
        first.dequeue();

        first.enqueue(16);
        first.enqueue(60);
        first.enqueue(36);

        first.dequeue();
        first.dequeue();
        first.dequeue();
        first.dequeue();
        first.dequeue();

       

       
       

    }
}