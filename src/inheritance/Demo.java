package inheritance;

interface Beverages {
	int cost = 5;

	void prepareTea();

	default void mix() {
		System.out.println("Mix the beverages properly ");
	}

	static void rating() {
		System.out.println("ratings for beverages");
	}

	interface Games {
		void play();

		void pause();

	}

	interface ModernGames extends Games {
		void graphics();

		void animation();
	}

	abstract class Animal {
		int age;

		public abstract void eat();

		public void sleep() {
			System.out.println("Animal should sleep");
		}

		class Men extends Animal implements Beverages, Games, ModernGames {
			@Override
			public void eat() {

			}

			@Override
			public void play() {
				// TODO Auto-generated method stub

			}

			@Override
			public void pause() {
				// TODO Auto-generated method stub

			}

			@Override
			public void prepareTea() {
				// TODO Auto-generated method stub

			}

			@Override
			public void graphics() {

			}

			@Override
			public void animation() {
				// TODO Auto-generated method stub

			}
		}

		public class Demo {
			public void main(String[] args) {
				Men m = new Men();
				m.eat();
				m.sleep();
				m.play();
				m.pause();
				System.out.println("things men do" );
			}
		}
	}
}