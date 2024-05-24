import java.util.ArrayList;
import java.util.Vector; // Consider using ArrayList instead for clarity
import java.util.Scanner;

public class ComputerSystemEmpMinDistance {

    public static int calculateDistance(ArrayList<Integer> status, ArrayList<Integer> dist) {
        int n = status.size();
        ArrayList<Integer> res = new ArrayList<>(n);
        ArrayList<Integer> res2 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            res.add(Integer.MAX_VALUE);
            res2.add(Integer.MAX_VALUE);
        }

        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (prev == -1) {
                if (status.get(i) == 1) {
                    prev = dist.get(i);
                    res.set(i, 0);
                }
            } else {
                if (status.get(i) == 0) {
                    res.set(i, (dist.get(i) - prev));
                } else {
                    res.set(i, 0);
                }
                prev = dist.get(i);
            }
        }

        prev = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (prev == -1) {
                if (status.get(i) == 1) {
                    prev = dist.get(i);
                    res2.set(i, 0);
                }
            } else {
                if (status.get(i) == 0) {
                    res2.set(i, (prev - dist.get(i)));
                } else {
                    res2.set(i, 0);
                }
                prev = dist.get(i);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (status.get(i) == 0) {
                ans += Math.min(res.get(i), res2.get(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> vec = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            vec.add(scanner.nextInt());
        }

        int m;
        m = scanner.nextInt();
        ArrayList<Integer> dist = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            dist.add(scanner.nextInt());
        }

        int result = calculateDistance(vec, dist);
        System.out.println(result);
    }
}
