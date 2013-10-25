import java.util.Vector;


public class LoopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = {1,2,1,3,1,2,2,1};

		// alternative 1: calculate the moving sum with WS=4 and TR=1
		System.out.print("loop1 WS=4 TR=1: ");
		for(int i=0;i<data.length;i++){
			int m = Math.max(0, i-3);
			int sum=0;
			for(int j=m;j<=i;j++){
				sum+=data[j];
			}
			System.out.print(sum+", ");
		}
		System.out.println();

		// alternative 2: calculate the moving sum with WS=4 and TR=1
		System.out.print("loop2 WS=4 TR=1: ");
		Vector<Integer> state2 = new Vector<Integer>();
		for(int j=0;j<4;j++)
			state2.add(0);
		int sum2=0;
		for(int i=0;i<data.length;i++){
			sum2=sum2-state2.get(0)+data[i];
			System.out.print(sum2+", ");
			state2.remove(0);
			state2.add(data[i]);
		}
		System.out.println();

		// alternative 3: calculate the moving sum with WS=4 and TR=1
		System.out.print("loop3 WS=4 TR=1: ");
		int[] state = new int[4];
		int pointer = 0;
		int sum=0;
		for(int i=0;i<data.length;i++){
			sum=sum-state[pointer]+data[i];
			state[pointer]=data[i];
			pointer = (pointer+1) % 4;
			System.out.print(sum+", ");
		}
		System.out.println();

		System.out.println();

		// alternative 1: calculate the moving sum with WS=4 and TR=2
		System.out.print("loop1 WS=4 TR=2: ");
		for(int i=0;i<data.length;i++){
			int m = Math.max(0, i-3);
			sum=0;
			if(i%2==0){
				for(int j=m;j<=i;j++){
					sum+=data[j];
				}
				System.out.print(sum+", ");
			}
		}
		System.out.println();

		// alternative 2: calculate the moving sum with WS=4 and TR=2
		System.out.print("loop2 WS=4 TR=2: ");
		for(int i=0;i<data.length;i=i+2){
			int m = Math.max(0, i-3);
			sum=0;
			for(int j=m;j<=i;j++){
				sum+=data[j];
			}
			System.out.print(sum+", ");
		}
		System.out.println();

		// alternative 3: calculate the moving sum with WS=4 and TR=2
		System.out.print("loop3 WS=4 TR=2: ");
		for(int i=0;i<data.length/2;i++){
			int m = Math.max(0, i*2-3);
			sum=0;
			for(int j=m;j<=i*2;j++){
				sum+=data[j];
			}
			System.out.print(sum+", ");
		}
		System.out.println();

		// alternative 4: calculate the moving sum with WS=4 and TR=2
		System.out.print("loop4 WS=4 TR=2: ");
		state2 = new Vector<Integer>();
		for(int j=0;j<4;j++)
			state2.add(0);
		sum2=0;
		for(int i=0;i<data.length;i++){
			sum2=sum2-state2.get(0)+data[i];
			if(i%2==0)
				System.out.print(sum2+", ");
			state2.remove(0);
			state2.add(data[i]);
		}
		System.out.println();

		// alternative 5: calculate the moving sum with WS=4 and TR=2
		System.out.print("loop5 WS=4 TR=2: ");
		state = new int[4];
		pointer = 0;
		sum=0;
		for(int i=0;i<data.length;i++){
			sum=sum-state[pointer]+data[i];
			state[pointer]=data[i];
			pointer = (pointer+1) % 4;
			if(i%2==0)
				System.out.print(sum+", ");
		}
		System.out.println();
	}	

}
