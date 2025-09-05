class Exterior {

	public void someMethod() {}

}

class Container {

	private Exterior util = new Exterior();

	public void subMethod() {

		util.someMethod();

	}

}
