/*
 * ackage amazon;
 * 
 * import java.util.HashMap; import java.util.PriorityQueue;
 * 
 * public class Findkclosestnumbersinanunsortedarray {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * void printKclosest(int arr[], int n, int x, int k)
 * 
 * { PriorityQueue<String> pq = new PriorityQueue();
 * 
 * 
 * for (int i = 0; i < k; i++) { pq.add((arr[i] - x)+" "+ i ); }
 * 
 * 
 * // Now process remaining elements. for (int i = k; i < n; i++) {
 * 
 * int diff = abs(arr[i] - x);
 * 
 * // If difference with current // element is more than root, // then ignore
 * it. if (diff > pq.top().first) continue;
 * 
 * // Else remove root and insert pq.pop(); pq.push({ diff, i }); }
 * 
 * // Print contents of heap. while (pq.empty() == false) { cout <<
 * arr[pq.top().second] << " "; pq.pop(); } }
 * 
 * private int abs(int i) { // TODO Auto-generated method stub return
 * Math.abs(i); }
 * 
 * }
 */