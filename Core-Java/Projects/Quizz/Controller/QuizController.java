package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import modules.Rank;
import modules.SortRank;

public class QuizController {
	
	ArrayList <Rank> rank = new ArrayList<Rank>();
	
	public void rankData() {
		rank.add(new Rank("Gris",30));
		rank.add(new Rank("Penny",80));
		rank.add(new Rank("Victoria",35));
		rank.add(new Rank("Archie",45));
		rank.add(new Rank("Betty",60));
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void generateQuiz(String name) {
		int score =0;
		int userChoice;
		System.out.println();
		System.out.println("RULES: You Acheive +10 points for a right answer. you lose -5 points for wrong ones.");
		System.out.println("HIT THE BUZZERS");
		System.out.println();
		System.out.println("(A).Which is the biggest flower of the world ?");
		System.out.println("1. Rafflesia");
		System.out.println("2. Sunflower");
		System.out.println("3. Water lily");
		System.out.println("4. Wild Lotus");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("(B). Name the first talking robot in space?");
		System.out.println("1. Neo");
		System.out.println("2. Gensis");
		System.out.println("3. Kirobo");
		System.out.println("4. Sophia");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 3:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("(C).Name a bird which can also fly backwards.");
		System.out.println("1. Hoss");
		System.out.println("2. Humming bird");
		System.out.println("3. Kiwi");
		System.out.println("4. Nightingle");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 2:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("(D).Currency of Algeria?");
		System.out.println("1. Dinar");
		System.out.println("2. Euro");
		System.out.println("3. Afghani");
		System.out.println("4. Lek");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("(E). National Bird of New Zealand?");
		System.out.println("1. Kiwi");
		System.out.println("2. Kookabura");
		System.out.println("3. Eagle");
		System.out.println("4. Vulture");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("(F).what is the main ingredient of bombay duck?");
		System.out.println("1. Dried fish");
		System.out.println("2. Duck");
		System.out.println("2. Prawns");
		System.out.println("2. Green peas");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("(G).What is the collective noun for a group of pandas?");
		System.out.println("1. A Pandaloon");
		System.out.println("2. A Pack");
		System.out.println("3. An Embarrassment");
		System.out.println("4. A Herd");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 3:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("(H). From which country do French fries originate?");
		System.out.println("1. Belgium");
		System.out.println("2. France");
		System.out.println("3. Madagascar");
		System.out.println("4. Crotia");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("(I). Only two mammals like spicy food, one is Human Name the other one.");
		System.out.println("1. Otters");
		System.out.println("2. Platypus");
		System.out.println("3. Tree Shrews");
		System.out.println("4. Chipmunks");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 3:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("(J). What artist has the most streams on Spotify?");
		System.out.println("1. Kanye West");
		System.out.println("2. Dua lipa");
		System.out.println("3. Drake");
		System.out.println("4. Weeknd");
		userChoice = scanner.nextInt();
		switch(userChoice) {
		case 3:{
			System.out.println("Correct, +10 points");
			score+=10;
			break;
		}default:{
			score-=5;
			System.out.println("Incorrect, -5 points");
			break;
		}
		}
		System.out.println();
		System.out.println("Final score is "+score);
		rank.add(new Rank(name,score));
	}
	
	public void viewRanking() {
		Collections.sort(rank,new SortRank());
		System.out.println();
		System.out.println("Top 5 Ranks is as follows");
		System.out.println("Name          Score");
		for(int i=0;i<5;i++) {
			System.out.println(rank.get(i).getName()+"          "+rank.get(i).getScore());
		}
	}
	
	
}