/*
 * TimeOfDay class
 */
public class TimeOfDay {
	private int totalSeconds;

	/*
	 * Constructor Seconds per hours = 3600 | Seconds per minutes = 60
	 */
	public TimeOfDay(int hours, int minutes, int seconds) {
		totalSeconds = (hours * 3600 + minutes * 60 + seconds) % 86400; // 86400 is the seconds of 24 hours
	}

	/*
	 * Get hour method
	 */
	int getHours() {
		int h = totalSeconds / 3600;
		return h;
	}

	/*
	 * Get minute method
	 */
	int getMinutes() {
		int m = (totalSeconds % 3600) / 60;
		return m;
	}

	/*
	 * Get Second method
	 */
	int getSeconds() {
		int s = (totalSeconds % 3600) % 60;
		return s;
	}

	/*
	 * addSeconds method
	 */
	public TimeOfDay addSeconds(int seconds) {
		seconds = (totalSeconds + seconds) % 86400;
		int h = seconds / 3600;
		int m = (seconds % 3600) / 60;
		int s = (seconds % 3600) % 60;
		return new TimeOfDay(h, m, s);

	}

	/*
	 * secondsFrom method
	 */
	public int secondsFrom(TimeOfDay other) {
		int s = Math.abs(this.totalSeconds - other.totalSeconds);
		return s;

	}
}
