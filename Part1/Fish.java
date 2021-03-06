public class Fish {

	// Any fish below this size must be thrown back into the lake
	public static int  THROW_BACK_SIZE = 18;

	protected int size;
	protected double weight;

	public Fish(int aSize, double aWeight){
		size = aSize;
		weight = aWeight;
	}

	public boolean isDesirableTo(Fisher f){
		return canKeep() && f.getNumThingsCaught() < Fisher.LIMIT && (weight+f.getWeightSoFar() <= f.getWeightLimit());
	}

	public boolean canKeep(){
		return size > THROW_BACK_SIZE;
	}

	public int getSize(){ 
		return size; 
	}

	public double getWeight(){ 
		return weight; 
	}

	public String toString (){
		return ("A " + size + "cm " + weight + "kg Fish");
	}
}