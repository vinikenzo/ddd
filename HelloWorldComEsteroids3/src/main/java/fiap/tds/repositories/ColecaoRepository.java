package fiap.tds.repositories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fiap.tds.Infraestructure.DatabaseConfig;
import fiap.tds.Main;
import fiap.tds.entities.Colecao;
import fiap.tds.extentions.LocalDateTimeGsonAdapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



public class ColecaoRepository
        implements CrudRepository<Colecao> {
    public static Logger logger = LogManager.getLogger(Main.class);

    List<Colecao> colecoes = new ArrayList<>(List.of(
            new Colecao("Primeira edição", "1ED", "2025-02-10"),
            new Colecao("Segunda edição", "2ED", "2025-02-10"),
            new Colecao("Terceira edição", "3ED", "2-25-02-10")
    ));

    @Override
    public void adicionar(Colecao object) {
        colecoes.add(object);
    }

    @Override
    public void atualizar(int id, Colecao object) {
        for (Colecao c : colecoes)
            if (c.getId() == id)
                c = object;
    }

    @Override
    public void remover(Colecao object) {
        colecoes.remove(object);
    }

    @Override
    public void remover(int id) {
        colecoes.removeIf(c -> c.getId() == id);
    }

    @Override
    public void delete(Colecao object) {
        object.setDeleted(true);
    }

    @Override
    public void deleteById(int id) {
        var set = colecoes.stream().filter(s -> s.getId() == id)
                .findFirst();

        set.ifPresent(s -> s.setDeleted(true));
    }

    @Override
    public List<Colecao> listarTodos() {
        var query = "SELECT * FROM colecao";

        try{
            var connection =  DatabaseConfig.getConnection();
            var statement = connection.prepareStatement(query);
            var result = statement.executeQuery();
            while(result.next()) {

                      var colecao =  new Colecao();
                      colecao.setId(result.getInt("id"));
                      colecao.setDeleted(result.getBoolean("deleted"));
                      colecao.setNome(result.getString("nome"));
                      colecao.setCodigo(result.getString("codigo"));
                      colecao.setDataLancamento(result.getString("data de lançamento"));

            }

            }
        catch (SQLException e){}

        System.out.println("Erro ao importar o arquivo");

    }

    @Override
    public List<Colecao> listar() {
        return colecoes.stream().filter(s -> !s.isDeleted())
                .toList();
    }

    public void exportar() {
        // fazer um teste antes de exportação de uma string simples
        var guid = UUID.randomUUID().toString();
        var conteudo = "Este texto será o conteudo que será exportado para o meu arquivo";
        var caminho = "./reports/" +
                //LocalDateTime.now() +
                guid +
                "_colecoes.txt";
        try {
            var file = new File(caminho);
            if (!file.exists())
                file.createNewFile();
            var writer = new FileWriter(file);
            writer.write(conteudo);
            writer.close();
            System.out.println("Arquivo exportado com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao exportar o arquivo");
            throw new RuntimeException(e);
        }
    }

    public void importar(String c) {
        String caminho = "./reports/" + c;
        try {
            var file = new File(caminho);
            var reader = new FileReader(file);
            var conteudo = "";
            while (reader.ready())
                conteudo += (char) reader.read();
            System.out.println(conteudo);
        } catch (IOException e) {
            System.out.println("Erro ao importar o arquivo");
        }
    }

    public static void exportarArquivoGrande() {

        var guid = UUID.randomUUID().toString();
        var caminho = "./reports/" + guid + ".colecoes.txt";
        try {
            var newFile = new File(caminho);
            if (!newFile.exists()) {
                var writer = new BufferedWriter(
                        new FileWriter(newFile));
                var conteudoGrande = new StringBuilder();
                for (int i = 0; i < 10000000; i++)
                    conteudoGrande.append("Linha " + i + "\n");

                writer.write(conteudoGrande.toString());

                writer.close();
                System.out.println("Arquivo exportado com sucesso");

            }
        }
        catch(IOException e){
            System.out.println("Erro ao importar o arquivo");
        }
    }

    public void exportarParaJson(){
        var guid = UUID.randomUUID().toString();
        var caminho = "./reports/" + guid + ".colecoes.json";
        try{
            var gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeGsonAdapter())
                    .setPrettyPrinting()
                    .create();
            var json = gson.toJson(colecoes);
            var file = new File(caminho);
            var fileWriter = new FileWriter(file);
            fileWriter.write(json);
            fileWriter.close();
        }
        catch (Exception e){
            logger.error("Erro ao exportar arquivo", e);
            System.out.println("Erro ao exportar o arquivo");
        }
    }

    public void importarDeJson(String arquivo){
        try{
            var gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeGsonAdapter())
                    .create();
            var caminho = "./reports/" + arquivo;
            var reader = new FileReader(caminho);
            var colocoesDoJson = gson.fromJson(reader, Colecao[].class);

        }
        catch (Exception e){
            logger.error("Erro ao importar o arquivo");
            System.out.println("Erro ao importar o arquivo");
        }
    }
}