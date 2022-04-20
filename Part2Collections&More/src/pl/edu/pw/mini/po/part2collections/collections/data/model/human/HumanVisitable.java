package pl.edu.pw.mini.po.part2collections.collections.data.model.human;

public interface HumanVisitable {
	default void visitMan(Man man) {};
	default void visitWoman(Woman woman) {};
}
