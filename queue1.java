class queue{
int rear=-1;
int front=0;
int size=5;
int x[]=new int [5];
void insert(){
if(fornt>rear){
System.out.print("queue is empty");
}
else{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
rear++;
x[rear]=a;
}
}
}
