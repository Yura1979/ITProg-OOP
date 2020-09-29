package com.gmail.tyi.Lesson10.HW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Translator {
	
	private String name;
	private Map<String, String> vocabulary;
	
	public Translator(String name) {
		super();
		this.name = name;
		vocabulary = new TreeMap<>();
	}
	
	public void addTranslation(String wordFrom, String wordTo) {
		if (wordFrom == null || wordTo == null) {
			throw new IllegalArgumentException();
		}
		vocabulary.put(wordFrom, wordTo);
	}
	
	public void saveVocabulary(File file) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));) {
			oos.writeObject(vocabulary);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clearVocabulary() {
		vocabulary.clear();
	}
	
	public void loadVocabulary(File file) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			vocabulary = (TreeMap<String, String>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void vobularyFill() {
		final String QUIT = "quit()";
		System.out.println("Interactive vocabulary fill! \n");
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("Enter translate from word or quit() to quit");
			String wordFrom = sc.nextLine();
			if (wordFrom.equals(QUIT)) {
				System.out.println("Quiting from interactive vocabulary fill");
				break;
			}
			System.out.println("Enter translate to word");
			String wordTo = sc.nextLine();
			
			addTranslation(wordFrom, wordTo);
		}
		sc.close();
	}
	
	public void translate(File from, File to) {
		
		String textFrom = "";
		String textTo = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(from))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
		        line = br.readLine();
			}
			textFrom = sb.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		textTo = translate(textFrom);
		
		try(PrintWriter pw = new PrintWriter(to)) {
			pw.write(textTo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private String translate(String textFrom) {
		StringBuilder sb = new StringBuilder();
		String[] text = textFrom.split(" ");
		
		for (String word : text) {
			String endsWith = "";
			
			char lastChar = word.charAt(word.length() - 1);
			
			switch (lastChar) {
			case ',':
				word = word.substring(0, word.length() - 1);
				endsWith = ",";
				break;
			case ':':
				word = word.substring(0, word.length() - 1);
				endsWith = ":";
				break;
			case '!':
				word = word.substring(0, word.length() - 1);
				endsWith = "!";
				break;
			case ';':
				word = word.substring(0, word.length() - 1);
				endsWith = ";";
				break;
			default:
				break;
			}
			
			if (vocabulary.containsKey(word)) {
				sb.append(vocabulary.get(word)+ endsWith + " ");
			} else {
				sb.append(word + endsWith + " ");
			}
		}
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getVocabulary() {
		return vocabulary;
	}

	@Override
	public String toString() {
		return "Translator [name=" + name + ", vocabulary=" + vocabulary + "]";
	}

}
