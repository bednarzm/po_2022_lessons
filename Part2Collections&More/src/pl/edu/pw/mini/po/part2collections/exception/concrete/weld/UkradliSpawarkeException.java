package pl.edu.pw.mini.po.part2collections.exception.concrete.weld;

import pl.edu.pw.mini.po.part2collections.exception.concrete.section.WeldingSectionException;

public class UkradliSpawarkeException extends WeldingSectionException {
	private String type;

	public UkradliSpawarkeException(String message) {
		super(message, null);
	}

}
