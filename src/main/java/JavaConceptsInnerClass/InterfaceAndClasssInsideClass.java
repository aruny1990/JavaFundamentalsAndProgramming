package JavaConceptsInnerClass;

class VehicleType {

	interface vehicle{
		public int getNoOfWheels();
	}
	
	class Bus implements vehicle{

		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 4;
		}
		
	}
	
	class Auto implements vehicle{

		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 3;
		}
		
	}
}
