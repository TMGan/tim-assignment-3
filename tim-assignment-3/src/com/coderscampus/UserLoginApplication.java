package com.coderscampus;

import java.io.IOException;


public class UserLoginApplication {
	

	public static void main(String[] args) throws IOException {
		FileService fileService = new FileService();
		fileService.readFile();
		User[] newUser = null;
		fileService.getInfo(newUser);
		}
	}

