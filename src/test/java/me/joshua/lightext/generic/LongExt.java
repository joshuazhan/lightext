package me.joshua.lightext.generic;

public class LongExt implements GenericExt<Long> {

	@Override
	public Long plusOne(Long numberic) {
		if (null == numberic) {
			return null;
		}

		return 1 + numberic;
	}

}
