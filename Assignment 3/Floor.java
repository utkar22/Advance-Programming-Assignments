package assignment3;

public abstract class Floor {
	public abstract void display(Player player);
	public abstract int get_new_floor();
	public abstract void update_points(Player player);
	public abstract boolean is_empty();
}
