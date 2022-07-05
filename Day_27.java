/* 30_Days_Code_Challenge
   Day_27
   Java Program for Circular Queue Operations
*/


public class Day_27 {
    java . util.Scanner s1 = new java.util.Scanner(System.in);

     int front = -1,rear = -1,Size=s1.nextInt();
     int [] a  = new int[Size]; 
       
    
    void Enqueue(int data){
        
        if(front==(rear+1)%Size){
            System.out.println("Queue OverFlow!.... So Now You Cannot Insert Elements Here ");
        }
        else if(rear ==-1 && front ==-1){
            front =0;
            rear = 0;
            a[rear]= data;
        }
        else{
            rear = (rear+1)%Size;
            a[rear]=data;
        }
    }
    void Dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("UnderFlow !.....");
        }
        else if(front == rear){
            System.out.println("UnderFlow!.......");
            front = -1;
            rear = -1;
        }
        else{
            front = (front+1)%Size;
        }
    }
    void Display(){

        if(front == -1 && rear == -1){
            System.out.println("UnderFlow !.....");
        }
        else{
            for(int i = front ; i!=rear ;i=(i+1)%Size){
                System.out.print(a[i]+" ");
            }
            System.out.print(a[rear]);
            System.out.println();
        }
        
    }
    public static void main(String args[]) {
        java . util. Scanner s = new java.util.Scanner(System.in);
        
        Main my = new Main();
        int ch;
        do{
            System.out.println("Enter \n1)For Insertion/Enqueue \n2)For Deletion/Dequeue \n3)For Display \n4)For Exit : ");
            ch = s.nextInt();
            switch(ch){
                case 1 : {
                    int ele;
                    System.out.println("Enter Element That To be Inserted : ");
                    ele = s.nextInt();
                    my.Enqueue(ele);
                    break;
                }
                case 2 : {
                    my.Dequeue();
                    break;
                }
                case 3: {
                    my.Display();
                    break;
                }
                case 4 :{
                    System.out.println("***-------EXIT-------***");
                    break;
                }
                default:{
                    System.out.println("Please Enter Valid Input My Dear......");
                }
            }
        }while(ch!=4);

    
   

    }
}
