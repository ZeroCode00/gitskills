import java.util.ArrayList;

interface IParking{
	void print();
	boolean addCar(int carType);
	public static IParams parse() throws Exception{
		return new ParkingSystem();
	}
}


interface IParams{
	int getBig();
	int getMedium();
	int getSmall();
	ArrayList<Integer> getPlanParking();
}


public class ParkingSystem implements IParking,IParams{
	private ArrayList<Integer> num;
	public ParkingSystem(int...nums) {
		num = new ArrayList<Integer>();
		for(int i = 0;i < nums.length;i++) {
			num.add(nums[i]);
		}
	}
	public void print() {
		for(int i = 0;i<num.size();i++) {
			System.out.print(num.get(i)+" ");
		}
		System.out.println();
	}
	public boolean addCar(int carType) {
		if(num.add(carType)) {
			return true;
		}
		return false;
	}
	
	
	public int getBig() {
		return 1;
	}
	public int getMedium() {
		return 2;
	}
	public int getSmall() {
		return 3;
	}
	public ArrayList<Integer> getPlanParking(){
		return num;
	}
	
	
	
	public static void main(String args[])  throws Exception{
		IParams params = IParking.parse();
		ParkingSystem ps = new ParkingSystem(params.getBig(),params.getSmall(),params.getMedium());
		ArrayList<Integer> plan = ps.getPlanParking();
		System.out.println(plan);
		ps.print();
	}

}



