Task:

You have a file describing the output of a private investigator following his targets.
The file has many sentences, one in a row.
The private investigator uses consistent phrasing to describe what is going on. Only one word can change in a specific phrase/pattern.
The input may look like:
01-01-2012 19:45:00 Naomi is getting into the car
01-01-2012 20:12:39 Naomi is eating at a restaurant
02-01-2012 09:13:15 George is getting into the car
02-01-2012 10:14:00 George is eating at a diner
03-01-2012 10:14:00 Naomi is eating at a diner

Your task is to write code that finds and groups together the similar sentences and extracts the changes, then outputs them to a file.

What I did:
There are three .java in the jar:

-ReadFile: Read the .txt file

-WriteFile: Finds the groups and similar sentences to write it down on a new .txt file.

-Main.
What I did was basically this:

[["Naomi","is","getting","into","the","car"], ["Naomi", "is", "eating", "at", "a", "restaurant"]...]

So after that I compare every word and every sentence with the other. If there were more than one word different, then it will pass throw the next one, until the file is finish.
