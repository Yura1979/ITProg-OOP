package com.gmail.tyi.Lesson10.HW;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Translator engToUkr = new Translator("English to Ukrainian");
		engToUkr.addTranslation("Hello", "Ïðèâ³ò");
		engToUkr.addTranslation("World", "Ñâ³ò");
		engToUkr.vobularyFill();

		File translateFrom = new File("D:\\test\\English.in");
		File translateTo = new File("D:\\test\\Ukrainian.out");
		File vocabulary = new File("D:\\test\\" + engToUkr.getName() + ".out");

		engToUkr.translate(translateFrom, translateTo);
		System.out.println(engToUkr);

		engToUkr.saveVocabulary(vocabulary);
		engToUkr.clearVocabulary();
		System.out.println(engToUkr);
		engToUkr.loadVocabulary(vocabulary);
		System.out.println(engToUkr);

	}

}
