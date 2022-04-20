package pl.edu.pw.mini.po.part2collections.collections.data.model.human;

public class StudyingWomanVisitor implements HumanVisitable {

	private int numberOfStudyingWoman;
	private String nameToCompare;

	public StudyingWomanVisitor(String nameToCompare) {
		this.nameToCompare = nameToCompare;
	}

	@Override
	public void visitWoman(Woman woman) {
		if (nameToCompare.equals(woman.getName()) 
				&& woman.isStudying()) {
			numberOfStudyingWoman++;
		}
	}

	public int getNumberOfStudyingWoman() {
		return numberOfStudyingWoman;
	}

}
