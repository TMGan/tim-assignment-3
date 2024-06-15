package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileService {
	public User[] readFile() throws IOException {
		BufferedReader fileReader = null;

		fileReader = new BufferedReader(new FileReader("data.txt"));

		String line;
		int i = 0;
		User[] userInput = new User[4];
		while ((line = fileReader.readLine()) != null) {
			String[] userData = line.split(",");
			userInput[i++] = new User(userData[0], userData[1], userData[2]);

		}
		fileReader.close();
		return userInput;
	}

	public void getInfo(User[] newUser) {
		Scanner scanner = new Scanner(System.in);
		int i=5;
		while (i>0) {
			System.out.println("Please input username");
			String inputUsername = scanner.nextLine();
			System.out.println("Please input password");
			String inputPassword = scanner.nextLine();
			User loginAttemptUser= userValidation(newUser, inputUsername, inputPassword);
			if (loginAttemptUser != null) {
				System.out.println("Welcome "+ loginAttemptUser.getName());
				break;
			} else {
				i--;
				System.out.println("Invalid login, please try again");
			}
		} if (i==0) {
			System.out.println("Too many failed login attempts, you are now locked out.");
			scanner.close();
		}
				
			}
		public User userValidation(User[] userInput, String inputUsername, String inputPassword) {
			for (User user: userInput) {
				if ((user.getUsername()).equalsIgnoreCase(inputUsername) && (user.getPassword().equals(inputPassword))) {
					return user;
				}
			}
			return null;
			
		
		}
	}



