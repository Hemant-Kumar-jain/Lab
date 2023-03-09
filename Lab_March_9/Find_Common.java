package array;

public class Find_Common {
	public static void main(String[] args) {
		int a[] = {2, 4, 8};
		int b[] = {2, 3, 4, 8, 10, 16};
		int c[] = {4, 8, 14, 40};
		int x = 0, y = 0, z = 0;
		System.out.print("Common elements are: ");
		while (x < a.length && y < b.length && z < c.length){
			if (a[x] == b[y] && b[y] == c[z]){
				System.out.print(a[x]+" ");
				x++;
				y++;
				z++;
			}
			else if (a[x] < b[y])
				x++;
			else if (b[y] < c[z])
				y++;
			else
				z++;
		}
	}
}


