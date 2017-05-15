public class Room
{
	int roomNumber;
	private int capacity;
	
	public Room(int roomNumber, int capacity)
	{
		this.roomNumber = roomNumber;
		this.setCapacity(capacity);
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}