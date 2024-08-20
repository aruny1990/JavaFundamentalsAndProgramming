package JavaConceptsInnerClass;

interface VehicleEx {

	public int getNoOfWheels();
	class DefaultVehicle implements VehicleEx{

		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 2;
		}
		
	}
}

class Bus implements VehicleEx{

	@Override
	public int getNoOfWheels() {
		// TODO Auto-generated method stub
		return 4;
	}
	
}

class MyTest2{
	public static void main(String[] args) {
		VehicleEx.DefaultVehicle d = new VehicleEx.DefaultVehicle();
		System.out.println(d.getNoOfWheels());
		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());
	}
}
