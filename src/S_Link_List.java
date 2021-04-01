/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aeon
 */
public class S_Link_List {
private    Node head;
private    Node last=null;
private    int count=0;

    public S_Link_List() {
        this.head=null;
    }

/**
        * It will add passed element at the end of the List.
 */
    void add(int data){
        count++;
    Node newNode = new Node(data);
    if (head == null){
        head = last = newNode;
    }
    else{
        last.next= newNode;
        last = newNode;
    }
}

     /**
        * It will check whether the passed element is present in the List.
 */
    public boolean contains(int a){
        Node temp=head;
        while(temp!=null){
            if(temp.data==a)
                return true;
            temp=temp.next;
        }
        return false;
    }
         /**
        * It will insert passed element at the specified index in the List.
 */
    public boolean add(int index,int a){
        Node n=new Node(a);
        if(index<count){
            Node temp=head;
            int c=0;
            while(temp!=null){
                if(index==0){
                    n.next=head;
                    head=n;
                    count++;
                    return true;
                }
                if(c+1==index){
                    n.next=temp.next;
                    temp.next=n;
                    count++;
                    return true;
                }else{
                    c++;
                    temp=temp.next;
                }
            }
        }
        return false;
        
    }
    
/**
        * It will remove the first occurrence of the passed element from the List.
 */
    public boolean remove(int x){
        Node temp1=head;
        Node temp2=head.next;
        while(temp2!=null){
            if(head.data==x){
                head=head.next;
                return true;
            }
            if(temp2.data==x){
                temp1.next=temp2.next;
                return true;
            }else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return false;
    }
            /**
        * It will return a string in reverse having all the elements in the List.
 */
    public String printReverse(){
        if(count!=0){
        int[] arr=new int[count];
        int loop=0;
        for(Node n=head;n!=null;n=n.next){
            arr[loop]=n.data;
            loop++;
        }
        String a="{";
        for(int i=count-1;i>=0;i--){
            a=a+arr[i]+",";
        }
        a=a.substring(0, a.length()-1);
        a=a+"}";
        return a;
        }
        else
            return null;
    }
        
  /**
        * It will return the size of the List.
 */
    public int size(){
        return this.count;
    }
    
 /**
        * It will return the next after the passed element in the List.
 */
    public int nextAfter(int a){
        Node temp=head;
        int check=0;
        while(temp!=null){
            check++;
            if(temp.data==a){
                temp=temp.next;
                if(check==count)
                    return -1;
                else
                return temp.data;
            }
            temp=temp.next;
        }
        return -1;
    }
    
     /**
        * It will return the element present at passed index.
 */
    public int get(int index){
        Node n=head;
        for(int i=0;n!=null;n=n.next){
            if(i==index)
                return n.data;
            i++;
        }
        return -1;
    }
     /**
        * It will return the index of first occurrence of the passed element in the List.
 */
     public int IndexOf(int a){
        int i=0;
        for(Node n=head;n!=null;n=n.next){
            if(a==n.data)
                return i;
            i++;
        }
        return -1;
    }
    
    
 /**
        * It will return the total occurrence of the passed element in the List.
 */
    public int SearchAll(int a){
        Node temp=head;
        int check=0;
        while(temp!=null){
            if(temp.data==a)
                check++;
            temp=temp.next;
        }
        if(check==0)
            return -1;
        else
            return check;
    }
        /**
        * It will return a string having all the elements in the List.
 */
    public String print(){
        if(count!=0){
            Node temp=head;
            int[] arr=new int[count];
            int loop=0;
            while(temp!=null){
                arr[loop]=temp.data;
                loop++;
                temp=temp.next;
            }
       String a="{";
        for(int i=0;i<loop;i++){
            a=a+arr[i]+",";
        }
        a=a.substring(0, a.length()-1);
        a=a+"}";
        return a;
        }
        return null;
    }
}
