package edu201905.util;

public class CommonUtils {
	
	public static String sex2Gender(Integer sex) {
		if (null != sex) {
			if (sex.intValue() == Const.GenderType.MAN.getSex())
				return Const.GenderType.MAN.getGender();
			else if (sex.intValue() == Const.GenderType.WOMAN.getSex())
				return Const.GenderType.WOMAN.getGender();
			else
				return Const.GenderType.UNKNOWN.getGender();
		}

		return Const.GenderType.UNKNOWN.getGender();
	}

}
