	import java.util.*;
	class customArraylist{
		 private int[] data;
		 private int size = 0;
		 private int default_length = 10;
		 customArraylist(){
		 		this.data = new int[default_length];
		 }
		 void add(int num){
		 	if(isfull()){
		 		resize();
		 	}
		 	data[size++] = num;
		 } 

		 boolean isfull(){
		 	return size==data.length;
		 }
		 void resize(){
		 	int[] temp = new int[default_length*2];

		 	for (int i = 0;i<data.length ;i++ ) {
		 		temp[i] = data[i];
		 	}

		 	data = temp;
		 }

		 int remove(){
		 	int removed = data[size--];
		 	return data[size];
		 }
		 int get(int index){
		 	return data[index];
		 }
		 @Override
		 public String toString(){
		 	for (int i = 0;i<data.length ;i++ ) {
		 		System.out.print(data[i]+" ");
		 	}
		 	System.out.println();
		 	return "Fuck You";
		 }
		 public static void main(String[] args) {
		 	customArraylist arr = new customArraylist();
		 	arr.add(12);
		 	arr.add(13);
		 	arr.add(14);
		 	arr.add(15);
		 	arr.add(15);
		 	arr.add(15);
		 	arr.add(15);
		 	arr.add(15);
		 	arr.add(15);
		 	arr.add(15);
		 	arr.add(15);
		 	arr.add(15);
		 	arr.toString();
		 	System.out.println(arr.remove());
		 	System.out.println(arr.get(2));
		 }
	}