
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class bubbleSort
{
public static void main (String[] args) throws IOException
{
// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String string = br.readLine();
int seed = Integer.parseInt(string);
Random r =new Random(seed);
int[] array = new int[10000];
for (int i = 0; i < 10000; i++) {
array[i]=r.nextInt(10000);
//System.out.println(array[i]);
}
//bubble sort
bubbleSort(array);
}
public static void bubbleSort(int[] array) {
//bubble sort
for (int i = 0; i < array.length; i++) {
for (int j = i+1; j < array.length; j++) {
if (array[i]>array[j]) {
int temp = array[i];
array[i] = array[j];
array[j] = temp;
}
}
}
for (int i = 0; i < array.length; i++) {
System.out.println(array[i]);
}
}
}

