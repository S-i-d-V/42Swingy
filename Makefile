.SILENT:

#COLORS OUTPUTS
RED =`tput setaf 1`
GREEN =`tput setaf 2`
YELLOW =`tput setaf 3`
CLEAR =`tput sgr0`

#FILES
SOURCES = Swingy/Game.java
OBJECTS = $(SOURCES:.java=.class)

#RULES
.PHONY: all clean fclean re

all:
	echo "$(YELLOW)Compiling binary files from java files..$(CLEAR)"
	javac $(SOURCES)
	echo "$(GREEN)Executing Swingy RPG..$(CLEAR)"
	java Swingy.Game scenario.txt

clean:
	echo "$(RED)Cleaning binary files..$(CLEAR)"
	rm -rf $(OBJECTS)

fclean: clean
	echo "$(RED)Cleaning executable..$(CLEAR)"
#	rm -rf 

re: fclean all
