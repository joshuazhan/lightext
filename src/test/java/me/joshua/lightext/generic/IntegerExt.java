package me.joshua.lightext.generic;

public class IntegerExt implements GenericExt<Integer> {

	@Override
	public Integer plusOne(Integer numberic) {
		if (null == numberic) {
			return null;
		}
		return 1 + numberic;
	}

}
