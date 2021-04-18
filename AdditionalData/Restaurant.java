import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	public int rank, sales, units, unit_volume;
	public String name, location;
	public double yoy_sales, yoy_units;
	public boolean franchising;

	@Override
	public String toString() {
		return "Restaurant [rank=" + rank + ", sales=" + sales + ", units=" + units + ", unit_volume=" + unit_volume
				+ ", name=" + name + ", location=" + location + ", yoy_sales=" + yoy_sales + ", yoy_units=" + yoy_units
				+ ", franchising=" + franchising + "]";
	}

	public static List<Restaurant> createDataset(String path) {
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			boolean header = true;
			while ((line = br.readLine()) != null) {
				if (header) {
					header = false;
					continue;
				}
				line = line.replace("%", "");
				String[] values = line.split(";");
				Restaurant restaurant = new Restaurant();
				restaurant.rank = Integer.valueOf(values[0]);
				restaurant.name = values[1];
				restaurant.location = values[2];
				restaurant.sales = Integer.valueOf(values[3]);
				restaurant.yoy_sales = Double.valueOf(values[4]) / 100.0;
				restaurant.units = Integer.valueOf(values[5]);
				restaurant.yoy_units = Double.valueOf(values[6]) / 100.0;
				restaurant.unit_volume = Integer.valueOf(values[7]);
				if (values[8].equals("Yes"))
					restaurant.franchising = true;
				else
					restaurant.franchising = false;

				restaurants.add(restaurant);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return restaurants;

	}
}
