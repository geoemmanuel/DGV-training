package Player_cards;

public class Player {

		
		private String name;
		private int goals;
		private int age;
		private String club;
		private String country;
		public Player(String name, int goals, int age, String club, String country) {
			super();
			this.name = name;
			this.goals = goals;
			this.age = age;
			this.club = club;
			this.country = country;
		}
		@Override
		public String toString() {
			return "Player [name=" + name + ", goals=" + goals + ", age=" + age + ", club=" + club + ", country="
					+ country + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getGoals() {
			return goals;
		}
		public void setGoals(int goals) {
			this.goals = goals;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getClub() {
			return club;
		}
		public void setClub(String club) {
			this.club = club;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
		
		
		

	}

