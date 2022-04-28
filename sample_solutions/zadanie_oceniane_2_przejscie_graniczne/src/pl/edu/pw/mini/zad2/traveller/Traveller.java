package pl.edu.pw.mini.zad2.traveller;

import java.util.LinkedHashSet;

import pl.edu.pw.mini.zad2.merchandise.Merchandise;

public abstract class Traveller implements Comparable<Traveller> {

	private static int idCounter = 0;

	private int id;
	private int age;
	private LinkedHashSet<Merchandise> goods;

	public Traveller(int age) {
		this.age = age;
		id = idCounter++;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LinkedHashSet<Merchandise> getGoods() {
		return goods;
	}

	public void setGoods(LinkedHashSet<Merchandise> goods) {
		this.goods = goods;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Traveller other = (Traveller) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Traveller o) {
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", age=" + age + "]";
	}
}
