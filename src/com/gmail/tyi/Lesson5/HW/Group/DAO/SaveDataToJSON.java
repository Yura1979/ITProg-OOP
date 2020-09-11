package com.gmail.tyi.Lesson5.HW.Group.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.gmail.tyi.Lesson5.HW.Group.Group;
import com.google.gson.Gson;

public class SaveDataToJSON implements Data {

	@Override
	public void saveData(Group obj, File file) {
		Gson json = new Gson();

		String json_str = json.toJson(obj);

		try (Writer out = new BufferedWriter(new FileWriter(file))) {
			out.write(json_str);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Group loadData(File file) {
		String json_str = "";

		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			while (in.ready()) {
				json_str += in.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Gson json = new Gson();
		Group obj = json.fromJson(json_str, Group.class);
		
		return obj;
	}

}
