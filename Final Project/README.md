## Synopsis

This is a prototype random name generator for authors or fantasy gamers. This will randomly generate a name for a variety of different races, currently elves and orcs.

## Code Example

Based on inputs from the user this code will generate any number of names for a collection of fantasy races. My intention was to make a generator that randomly combines letters to make names that are 100% random. Giving some sway to the idea that different fantasy races have different sounding names. For example, in my mind, orcish names have sounds that are a bit harsher and harder to hear, like the letters “G” and “K”. Where as elvish names are sound softer, like the letters “M” and “L”.

Here is a sample of my code.
```
		System.out.println("How many names would you like to generate?");
		int numberOfNames = input.nextInt();

		while(numberOfNames > 0) {
			System.out.println("how many syllables do you want?");
			int userInputSyllables = input.nextInt();

			while(userInputSyllables > 0) {

				int syllableNumber = (int)Math.round(Math.random() * ((4 - 1 ) + 1)); 
				char[] syllableSize = randomSyllables(syllableNumber);

				//charNameLength += charNameLength + syllableSize.length;
				for(int i = 0; i < syllableSize.length; i++) {
					if(Character.compare(syllableSize[i], 'a') == 0) { // Determines if the character is a vowel.
						int vows = (int)Math.round(Math.random() * (6 - 1));
						syllableSize[i] = vowels[vows];
					}
					else if(Character.compare(syllableSize[i], 'b') == 0) { // Determines if the character is a consonant.
						int cons = (int)Math.round(Math.random() * (21 - 1));
						syllableSize[i] = consonants[cons];
					}
```

This is specifically the code that builds the random names for orcs.

This is a sample run of the program.

Prompts the user to input the race they wish to generate, how many names, and how many syllables. When finished it asks if the user would like to do it again.

(Sample Run.jpg)


## Motivation

This project is a prototype random name generator specifically for my mom. My mom’s an author and she has to come up with a lot of names for various characters. I wanted to write a random name generator for her, that will prompt her to enter an integer that dictates how many syllables the name is. Based on that length it will choose randomly how many vowels and consonants to have. Then randomly call into two arrays, one filled with all the vowels, and one filled with all the consonants. Followed by displaying the name that was generated. I would also like to implement conditions that allow for more racial specific names saved in a variety of methods.

## Installation

Merely click the Random_Name_Generator file to run the program.

## Tests

I used Junit to test the randomSyllables() method. As see in Testing_Random_Name_Generator.

## Contributors

This is part of my resume portfolio. Please do not make changes.
