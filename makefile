# Arquivo de Script MakeFile
# Segunda lista de exercícios de LP02
# https://github.com/gdiael/LP02_002_BinaryTree.git
# - Legenda
# $@ = nome da regra de compilação
# $^ = lista de depedências da regra
# $< = primeira dependência da regra
#
#     se você está usando windows, desca até a seção com as orientações para windows

# Comando de compilação do java
CC = javac

# Diretórios do Programa
SRC = ./src
BIN = ./bin

# Arquivo executável [programa principal]
PROG = $(BIN)/Main

# Regras de compilação
FLAGS = -d $(BIN)

all: mkdirs $(PROG)

mkdirs:
	mkdir -p $(BIN)

$(PROG): $(SRC)/Main.java $(SRC)/Node.java $(SRC)/Tree.java
	$(CC) $(FLAGS) $^

clean: 
	rm -f $(BIN)/*

run:
	java -cp bin Main

# propriedades para serem usadas ao compilar no windows com o MinGW
# não usar o comando Make e sim o executável: mingw32-make.exe

mkdirswin:
	if not exist $(BIN) mkdir "$(BIN)

mkwin: mkdirswin $(PROG)

runwin: mkwin
	java -cp bin Main

cleanwin: 
	del /q "$(BIN)\*