package javalab;

public class itrfce {
	
public static void main(String[] args) {
Fish d = new Fish("Mimi");
Cat c = new Cat("Fluffy");
Animal e = new Spider();
Pet p = new Cat();
System.out.println("CAT");
System.out.println("This cat's name "+c.getname());
c.walk();
c.eat();
c.setname("Moose");
System.out.println("This cat's name "+p.getname());
System.out.println("SPIDER");
e.walk();
e.eat();
System.out.println("FISH");
System.out.println("This fish's name "+d.getname());
d.walk();
d.eat();
d.setname("Momo");
System.out.println("This fish's name "+d.getname());
		}
		}
abstract class Animal {
protected int legs;
	protected Animal(int legs) {
		this.legs = legs;
		}
public abstract void eat();
public void walk() {
System.out.println("This animals walk by "+this.legs+" legs");
		}
		}

		class Spider extends Animal {
		public Spider() {
		super(8);
		}
		public void eat() {
		System.out.println("Spider eat insect");
		}
		}

		interface Pet {
		public String getname();
		public void setname(String name);
		public void play();
		}

		class Cat extends Animal implements Pet{
		private String catname;
		public Cat(String name) {
		super(4);
		this.catname=name;
		}
		public Cat() {
		this("Moose");
		}
		public String getname() {
		return this.catname;
		}
		public void setname(String name) {
		this.catname = name;
		}
		public void play() {

		}
		public void eat() {
		System.out.println("Cat eat Fishes");
		}
		}
		class Fish extends Animal implements Pet{
		String fishname;
		public Fish(String name) {
		super(0);
		this.fishname=name;
		}
		public Fish() {
		this("Momo");
		}
		public void walk() {
		System.out.println("Fish has no legs");
		}
		public String getname() {
		return this.fishname;
		}
		public void setname(String name) {
		this.fishname = name;
		}
		public void play() {

		}
		public void eat() {
		System.out.println("Fishes eat Plants");
		}
		}

			


