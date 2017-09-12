import java.util.Scanner;

public class HighOrLow{

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  int[] num = new Random().randomInt(12);
  System.out.println("最初の数字は「"+( num[0] + 1)+"」です");
  int work;

  for(int i = 1; i < 7;i++){
   System.out.println("High：「1」\nLow:「2」");
   work = sc.nextInt();
   System.out.println("数字は「"+num[i]+"」です");

   if(1==(work)){
    if(num[i] > num[i-1]){
     System.out.println("成功！！");
    }else{
     System.out.println("失敗．．．");
     System.exit(0);
    }
   }else if(2==(work)){
    if(num[i] < num[i-1]){
     System.out.println("成功！！");
    }else{
     System.out.println("失敗．．．");
     System.exit(0);
    }
   }else{
    System.out.println("エラー");
    System.exit(0);
   }

  }
  System.out.println("☆Game★Clear☆");

 }
}