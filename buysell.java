public class buysell{
  public static void main(String[] args) {
    int []arr={6,3,1,4,5,6,8};
    int profit=0;
    int buy_price=arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]<buy_price){
        buy_price=arr[i];
        continue;
      }
      profit=Math.max(profit,arr[i]-buy_price);
    }
    System.out.println(profit);
    /*(0,2-1)->1
      (1,4-1)->3
      (3,3-1)->3
      (3,5-1)->4
      (4,6-1)->5
     */
  }
}