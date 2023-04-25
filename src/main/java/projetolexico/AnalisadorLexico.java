package projetolexico;

import projetolexico.models.Classe;
import projetolexico.models.Helper;
import projetolexico.models.Lexico;
import projetolexico.models.Token;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class AnalisadorLexico {

    public static void main(String[] args) {

//        if (args.length == 0) {
//            System.out.println("Modo de usar: java -jar projetolexico-1.0-SNAPSHOT.jar NomeArquivoTeste.extensao");
//            return;
//        }
//        String filePath = args[0];
        String filePath = "src/main/java/projetolexico/test/teste.txt";
        Helper.parseTabIntoSpace(filePath);

        Lexico lexico = new Lexico(filePath);
        Token token;

        if(lexico.getFilePath() != null){
            do {
                token = lexico.getToken();
                System.out.println(token);
            } while (token != null && token.getClasse() != Classe.cEOF);
        }
    }
}