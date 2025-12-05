import java.util.*; // que in CodeFri Level 1 Contest

public class _1_PreviousLowerStockPrice {

  
    public static List<Integer> findPreviousLowerPrice(List<Integer> prices) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int price : prices) {

            // Remove all prices that are not strictly lower
            while (!st.isEmpty() && st.peek() >= price) {
                st.pop();
            }

            
            if (st.isEmpty()) {
                result.add(-1);
            } else {
                result.add(st.peek());
            }

            // Push current price for future comparisons
            st.push(price);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

        
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            prices.add(sc.nextInt());
        }

        
        List<Integer> ans = findPreviousLowerPrice(prices);

        // Print output
        for (int x : ans) {
            System.out.print(x + " ");
        }
        
        sc.close();
    }
}
