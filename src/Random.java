import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Random {

 public static int[] randomInt(int index){
  String [] array = new String[index];
  for(int i = 0; i < index; i++){
   array[i] = String.valueOf(i);
  }
     List<Integer> list = (List) Arrays.asList(array);
     Collections.shuffle(list);
     array =(String[])list.toArray(new String[list.size()]);

     int[] result = new int[index];
     for(int i = 0; i < index; i++){
      result[i] = Integer.parseInt(array[i]);
  }
     return result;
 }

 public static String[] randomString(String[] index){
  String [] array = index;

     List<Integer> list = (List) Arrays.asList(array);
     Collections.shuffle(list);
     array =(String[])list.toArray(new String[list.size()]);
     return array;
 }
}